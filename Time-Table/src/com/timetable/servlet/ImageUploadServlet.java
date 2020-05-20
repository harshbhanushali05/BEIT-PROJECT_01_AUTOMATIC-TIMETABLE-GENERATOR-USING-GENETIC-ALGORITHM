package com.timetable.servlet;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import javax.imageio.ImageIO;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.IOUtils;

import com.timetable.utility.CSVReader;

/**
 * Servlet implementation class ImageUploadServlet
 */
public class ImageUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	;
    public ImageUploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		//HttpServletRequest request = ServletActionContext.getRequest();
		
		
		
		String fileName = "format.csv";
		String destPath = "C:/uploads/excelFormat/";
		
    	String filePath = destPath + fileName;
    	if(!filePath.equals("")){
    		    //HttpServletResponse response = ServletActionContext.getResponse();
    		    //HttpServletRequest request = ServletActionContext.getRequest();
	 			File downloadFile = new File(filePath);
	 			FileInputStream inputStream = null;
	 			OutputStream outStream = null;
	 			if(downloadFile.exists()){
	 			try {
	 				inputStream = new FileInputStream(downloadFile);
	 				if(inputStream!=null){
		 				response.setContentLength((int) downloadFile.length());
		 				response.setContentType("text");
		 				// response header
		 				String headerKey = "Content-Disposition";
		 				//String headerValue = String.format("attachment; filename=\"%s\"", downloadFile.getName());
		 				String headerValue = String.format("attachment; filename=\"%s\"",fileName);
		 				response.setHeader(headerKey, headerValue);
		 				// Write response
		 				outStream = response.getOutputStream();
		 				IOUtils.copy(inputStream, outStream);
		 				request.setAttribute("logString","downloaded task file "+ downloadFile.getName()+" from ");
	 				}
	 			} catch (Exception e) {
	 				e.printStackTrace();
	 			} finally {
	 				try {
	 					if (null != inputStream)
	 						inputStream.close();
	 					if (null != inputStream)
	 						outStream.close();
	 				} catch (IOException e) {
	 					e.printStackTrace();
	 				}
	 			}
	 			}
    	}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		
		HttpSession session=request.getSession();
		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	    
        if (isMultipart) {
         // Create a factory for disk-based file items
         FileItemFactory factory = new DiskFileItemFactory();

         // Create a new file upload handler
         ServletFileUpload upload = new ServletFileUpload(factory);
 
            try {
             // Parse the request
    List /* FileItem */ items = upload.parseRequest(request);
    Iterator iterator = items.iterator();
                while (iterator.hasNext()) {
                    FileItem item = (FileItem) iterator.next();
                    if (!item.isFormField()) {
                        String fileName = item.getName();  
                        
                        
                        //String relativeWebPath = "/uploads";
                        String absoluteFilePath = "C:/uploads"; //getServletContext().getRealPath(relativeWebPath);
                     //   String root = getServletContext().getRealPath("/");
                        File path = new File(absoluteFilePath);
                        System.out.println("-------------------------------"+absoluteFilePath);
                       
                     /*   String root = "C:/Users/blaziken/Desktop/Event 24_08_2015/event5/EventManagement28-07-2015/EventManagement28-07-2015/WebContent/";
                     // String root = getServletContext().getRealPath("/");
                        File path = new File(root + "/uploads");*/
                        if (!path.exists()) {
                                boolean status = path.mkdirs();
                        }
                        
 
                        File uploadedFile = new File(path + "/" + fileName);
                        
                        
                        item.write(uploadedFile);
                        List<String[]> detailsList =  CSVReader.readCSV(path + "/" + fileName);
                        System.out.println(uploadedFile.getAbsolutePath());
                        session.setAttribute("detailsList", detailsList);
                        response.sendRedirect("details.jsp");
                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
}
