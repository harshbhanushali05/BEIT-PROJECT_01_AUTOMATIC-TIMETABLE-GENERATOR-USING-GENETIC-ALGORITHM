package com.timetable.utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    
	 public static List<String[]> readCSV(String fileNameWithPath){

		    List<String[]> list = new ArrayList<String[]>();
	        String csvFile = fileNameWithPath;
	        String line = "";
	        String cvsSplitBy = ",";

	        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
	        	int i = 1;
	            while ((line = br.readLine()) != null) {
	            	if(i<2){
	            		i++;
	            		continue;
	            		
	            	}
	                String[] data = line.split(cvsSplitBy);
	                list.add(data);

	            }
	            return list;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
			return list;

	    } 
	 
}
