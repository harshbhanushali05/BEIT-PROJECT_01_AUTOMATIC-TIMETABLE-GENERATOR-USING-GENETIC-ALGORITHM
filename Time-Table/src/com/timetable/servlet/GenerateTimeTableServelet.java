package com.timetable.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import demoapp.TimeTableGeneration;


/**
 * Servlet implementation class GenerateTimeTableServelet
 */
public class GenerateTimeTableServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateTimeTableServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		List<String[]> detailsList = (List<String[]>)session.getAttribute("detailsList");
		Map<String,Map<String,List<String>>> population= new LinkedHashMap<String,Map<String,List<String>>>();
		Map<String,Map<String,List<String>>> populationP= new LinkedHashMap<String,Map<String,List<String>>>();
		
		//	no  sub fac L/P load YE 
		for(String []data : detailsList){
			if(data[3].equals("L")){
			
			
				if(population.containsKey(data[5])){
					List<String> teacher = population.get(data[5]).get("teacher");
					teacher.add(data[2]);
					
					List<String> sub = population.get(data[5]).get("subject");
					sub.add(data[1]);
					
					List<String> load = population.get(data[5]).get("load");
					load.add(data[4]);
				}else{
					Map<String,List<String>> m = new LinkedHashMap<String, List<String>>();
					List<String> teacher = new ArrayList<String>();
					teacher.add(data[2]);
					
					List<String> sub = new ArrayList<String>();
					sub.add(data[1]);
					
					List<String> load = new ArrayList<String>();
					load.add(data[4]);
					
					m.put("teacher",teacher);
					m.put("subject",sub);
					m.put("load",load);
					population.put(data[5], m);
				 }
			}else if(data[3].equals("P")){
			
			
				if(populationP.containsKey(data[5])){
					List<String> teacher = populationP.get(data[5]).get("teacher");
					teacher.add(data[2]);
					
					List<String> sub = populationP.get(data[5]).get("subject");
					sub.add(data[1]);
					
					List<String> load = populationP.get(data[5]).get("load");
					load.add(data[4]);
				}else{
					Map<String,List<String>> m = new LinkedHashMap<String, List<String>>();
					List<String> teacher = new ArrayList<String>();
					teacher.add(data[2]);
					
					List<String> sub = new ArrayList<String>();
					sub.add(data[1]);
					
					List<String> load = new ArrayList<String>();
					load.add(data[4]);
					
					m.put("teacher",teacher);
					m.put("subject",sub);
					m.put("load",load);
					populationP.put(data[5], m);
				 }
			}
		}
		
		List<String> seTeachNameL=population.get("S").get("teacher");
		List<String> teTeachNameL=population.get("T").get("teacher");
		List<String> beTeachNameL=population.get("B").get("teacher");
		
		String[] seTeachName = seTeachNameL.toArray(new String[seTeachNameL.size()]);
		String[] teTeachName = teTeachNameL.toArray(new String[teTeachNameL.size()]);
		String[] beTeachName = beTeachNameL.toArray(new String[beTeachNameL.size()]);
		
		List<String> seSubNameL=population.get("S").get("subject");
		List<String> teSubNameL=population.get("T").get("subject");
		List<String> beSubNameL=population.get("B").get("subject");
		
		
		String[] seSubName = seSubNameL.toArray(new String[seSubNameL.size()]);
		String[] teSubName = teSubNameL.toArray(new String[teSubNameL.size()]);
		String[] beSubName = beSubNameL.toArray(new String[beSubNameL.size()]);
		
		
		List<String> seLoadL=population.get("S").get("load");
		List<String> teLoadL=population.get("T").get("load");
		List<String> beLoadL=population.get("B").get("load");
		
		String[] seLoad = seLoadL.toArray(new String[seLoadL.size()]);
		String[] teLoad = teLoadL.toArray(new String[teLoadL.size()]);
		String[] beLoad = beLoadL.toArray(new String[beLoadL.size()]);
		
		
		
		List<String> seTeachNameP=populationP.get("S").get("teacher");
		List<String> teTeachNameP=populationP.get("T").get("teacher");
		List<String> beTeachNameP=populationP.get("B").get("teacher");
		
		String[] seTeachNamePrac = seTeachNameP.toArray(new String[seTeachNameP.size()]);
		String[] teTeachNamePrac = teTeachNameP.toArray(new String[teTeachNameP.size()]);
		String[] beTeachNamePrac = beTeachNameP.toArray(new String[beTeachNameP.size()]);
		
		List<String> seSubNameP=populationP.get("S").get("subject");
		List<String> teSubNameP=populationP.get("T").get("subject");
		List<String> beSubNameP=populationP.get("B").get("subject");
		
		
		String[] seSubNamePrac = seSubNameP.toArray(new String[seSubNameP.size()]);
		String[] teSubNamePrac = teSubNameP.toArray(new String[teSubNameP.size()]);
		String[] beSubNamePrac = beSubNameP.toArray(new String[beSubNameP.size()]);
		
		
		List<String> seLoadP=populationP.get("S").get("load");
		List<String> teLoadP=populationP.get("T").get("load");
		List<String> beLoadP=populationP.get("B").get("load");
		
		String[] seLoadPrac = seLoadP.toArray(new String[seLoadP.size()]);
		String[] teLoadPrac = teLoadP.toArray(new String[teLoadP.size()]);
		String[] beLoadPrac = beLoadP.toArray(new String[beLoadP.size()]);
		
		
		
		

		try {
			Map<String,String[][]> finalTimeTable = TimeTableGeneration.generateTimeTable(teTeachName, seTeachName, beTeachName, seLoad, teLoad, beLoad, seSubName, teSubName,
					beSubName,teTeachNamePrac, seTeachNamePrac, beTeachNamePrac, seLoadPrac, teLoadPrac, beLoadPrac, seSubNamePrac, teSubNamePrac, beSubNamePrac);
			        session.setAttribute("timeTableMap",finalTimeTable);
					response.sendRedirect("timeTable.jsp?key=SE");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		HttpSession session=request.getSession();
		Map<String,String[][]> map =  (Map<String,String[][]>)session.getAttribute("timeTableMap");
		String key = request.getParameter("key");
		Gson gson = new Gson();
		String jsonString  = gson.toJson(map.get(key));
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		out.print(jsonString);
		out.flush();
//		HttpSession session=request.getSession();
//		String seTeachName[]=request.getParameterValues("seTeacher");
//		String[] seSubName=request.getParameterValues("seSubject");
//		String[] seLoad=request.getParameterValues("seLoad");
//
//		
//		String teTeachName[]=request.getParameterValues("teTeacher");
//		String[] teSubName=request.getParameterValues("teSubject");
//		String[] teLoad=request.getParameterValues("teLoad");
//		
//		String beTeachName[]=request.getParameterValues("beTeacher");
//		String[] beSubName=request.getParameterValues("beSubject");
//		String[] beLoad=request.getParameterValues("beLoad");
//		
//		String semType=request.getParameter("semType");
//		System.out.println("semType" +semType);
//		
//		//GenerateTimeTable generateTimeTable=new GenerateTimeTable();
//		try {
//			
//		
//		List<String[][]> finalTimeTable=null;//TimeTableGeneration.gnerateTimeTable(teTeachName, seTeachName, beTeachName, seLoad, teLoad, beLoad, seSubName, teSubName, beSubName);
//		
//		
//		
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		response.sendRedirect("tt_hod_home.jsp");
	
		
		
		
		
		
		
		
		
		
	}

}
