package demoapp;

import java.io.*;
import java.util.*;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;


public class ConvertPDFToTEXT {
      public static void main(String[] args) throws IOException {
      try {
    	  FileWriter fw=new FileWriter("C:\\Users\\Com-1\\Desktop\\dg.txt");
    	   //create buffered writer
    	   BufferedWriter bw=new BufferedWriter(fw);
    	   //create pdf reader
    	   PdfReader pr=new PdfReader("C:\\Users\\Com-1\\Desktop\\dg.pdf");
    	   //get the number of pages in the document
    	   int pNum=pr.getNumberOfPages();
    	   //extract text from each page and write it to the output text file
    	   for(int page=1;page<=pNum;page++){
    	    String text=PdfTextExtractor.getTextFromPage(pr, page);
    	    bw.write(text);
    	    bw.newLine();
    	    
    	   }
    	   bw.flush();
    	   bw.close();
      }
         catch (Exception e) {
        	 e.printStackTrace();
        	 
        	 
         }
    }
    }
  