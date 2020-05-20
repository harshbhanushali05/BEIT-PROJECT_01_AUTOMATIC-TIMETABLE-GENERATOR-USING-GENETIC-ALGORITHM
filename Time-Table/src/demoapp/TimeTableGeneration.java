package demoapp;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeTableGeneration {

	
	static String [][] sem=null;
	static String [][] sem1=null;
	static String [][] sem2=null;
	
	//static String [] seTeachName=null;
	//static String [] teTeachName=null;
	
	public static Map<String,String[][]> generateTimeTable(String teTeachName[],String seTeachName[],String beTeachName[]
			,String seLoad[],String teLoad[],String beLoad[],String[] seSubName,String[] teSubName,String[] beSubName,
			String teTeachNamePrac[],String seTeachNamePrac[],String beTeachNamePrac[]
					,String seLoadPrac[],String teLoadPrac[],String beLoadPrac[],String[] seSubNamePrac,String[] teSubNamePrac,String[] beSubNamePrac) throws InterruptedException {
		

		sem=new String[8][5];
		Integer lecNo[]={0,1,2,3,4,5,6,7};
		
		//String teacher[]={"T1","T2","T3","T4","T5"};
		String teacher[]=seTeachName;

		

		int load[]=new int[seLoad.length];
		
		for(int i=0;i<seLoad.length;i++){
			
			load[i] = Integer.parseInt(seLoad[i]);
		}
		
		
		String practical[]={"0,1","0,1","2,3","0,1","4,5"};
		
		sem1=new String[8][5];
		Integer lecNo1[]={0,1,2,3,4,5,6,7};
		
		String teacher1[]=teTeachName;
		int load1[]=new int[teLoad.length];

		for(int i=0;i<teLoad.length;i++){
			
			load1[i] = Integer.parseInt(teLoad[i]);
		}
		
		String practical1[]={"2,3","4,5","4,5","2,3","0,1"};
		
		
		sem2=new String[8][5];
		Integer lecNo2[]={0,1,2,3,4,5,6,7};
		
		String teacher2[]=beTeachName;
		int load2[]=new int[beLoad.length];
       for(int i=0;i<beLoad.length;i++){
			
			load2[i] = Integer.parseInt(beLoad[i]);
		}
		
		
		String practical2[]={"4,5","2,3","0,1","4,5","2,3"};
		
		
		
		
		int firstCount=0;
		int secondCount=0;
		int thirdCount=0;
	L: while(true){	
		Z: for(int i=0;i<teacher.length;i++)
			{
				 int rnd=abc.getRandomNumber(teacher);
				 String teacherName=teacher[i];
	        	 int count=load[i];
        	 
        	 
		          while(count>0 && firstCount<1000)
		             {	
		             
		   		
		        	  for(int m=0;m<sem[0].length;m++)
		        	  {
		        		  firstCount++;
		        		  int rndNo=abc.getRandomNumber(lecNo);
		    			  int lecN=lecNo[rndNo];
		    			  String pracTime[]=practical[m].split(",");
		    			 // System.out.println(sem[lecN][m]);
		    			  
		             	  if(sem[lecN][m]==null && count>0 && lecN!=Integer.parseInt(pracTime[0]) && lecN!=Integer.parseInt(pracTime[1]) )
		             	  {
		             		
		             		 sem[lecN][m]=teacherName;
		             		
		             	   
		
		             		 
		             		 count --;
		                    		  
		             	  }
		             	  else{
		             		 
		             	  }
		        	  }
		        		
		        	 
					 }
         
    
	         if(firstCount>1000){
	 			firstCount=0;
	 			
	 			 List arrayList=new ArrayList();
		    	 arrayList.add(sem);
		    	 arrayList.add(sem1);
		    	 arrayList.add(sem2);
			    	 for(Object obj:arrayList){
			    		 String curr[][]=(String[][])obj;
			    	 for(int k=0;k<curr.length;k++)
						{
						
						 	  for(int m1=0;m1<curr[i].length;m1++)
						 	  {
						 		  
						 		 curr[k][m1]=null;  
						 	  }
			 	  
						}
			    	 }
	 			
	 			
	 			continue L;
	 		}
       
		}
		
		
	
	Z1: for(int i=0;i<teacher1.length;i++)
		{
		  int rnd=abc.getRandomNumber(teacher1);
		  String teacherName1=teacher1[i];
    	  int count1=load1[i];
    	
	    	 
	     while(count1>0 && secondCount<1000)
	         {	
	         
	    	  for(int m=0;m<sem1[0].length;m++)
	    	  {
	    		  secondCount++;
	    		  int rndNo1=abc.getRandomNumber(lecNo1);
				  int lecN1=lecNo1[rndNo1];
				  String pracTime1[]=practical1[m].split(",");
				  
				 // System.out.println(sem[lecN][m]);
				  
	         	  if(sem1[lecN1][m]==null && count1>0 && lecN1!=Integer.parseInt(pracTime1[0]) && lecN1!=Integer.parseInt(pracTime1[1]) && !teacherName1.equals(sem[lecN1][m]))
	         	  {
	         		//  System.out.println(teacherName);
	         		 sem1[lecN1][m]=teacherName1;
	         		// Thread.sleep(2000);
	         		 count1 --;
	                		  
	         	  }
	    	  }
	    	  
	    	 
			 }
     
	     if(secondCount>1000){
				firstCount=0;
				secondCount=0;
				
				 List arrayList=new ArrayList();
		    	 arrayList.add(sem);
		    	 
		    	 arrayList.add(sem1);
		    	 
		    	 arrayList.add(sem2);
		    	 
			    	 for(Object obj:arrayList){
			    		 String curr[][]=(String[][])obj;
			    	 for(int k=0;k<curr.length;k++)
						{
						
						 	  for(int m1=0;m1<curr[i].length;m1++)
						 	  {
						 		  
						 		 curr[k][m1]=null;  
						 	  }
			 	  
						}
			    	 }
				
				
				
				continue L;
			}
      
   
	}
		
		
	
		

		
	Z3: for(int i=0;i<teacher2.length;i++)
		{
			 int rnd=abc.getRandomNumber(teacher2);
			 String teacherName2=teacher2[i];
	    	 int count2=load2[i];
    	
    	 
		     while(count2>0 && thirdCount<1000)
		         {	
		    	  for(int m=0;m<sem2[0].length;m++)
		    	  {
		    		  thirdCount++;
		    		  int rndNo2=abc.getRandomNumber(lecNo2);
					  int lecN2=lecNo2[rndNo2];
					  String pracTime2[]=practical2[m].split(",");
					 // System.out.println(sem[lecN][m]);
					  
		         	  if(sem2[lecN2][m]==null && count2>0 && lecN2!=Integer.parseInt(pracTime2[0]) && lecN2!=Integer.parseInt(pracTime2[1]) && !teacherName2.equals(sem[lecN2][m]) && !teacherName2.equals(sem1[lecN2][m]))
		         	  {
		         		 sem2[lecN2][m]=teacherName2;
		         		// Thread.sleep(2000);
		         		 count2 --;
		                		  
		         	  }
		    	  }
		    		
		    	 
				 }
     
         if(thirdCount>=1000){
    	 
		    	 List arrayList=new ArrayList();
		    	 arrayList.add(sem);
		    	 arrayList.add(sem1);
		    	 arrayList.add(sem2);
			    	 for(Object obj:arrayList){
			    		 String curr[][]=(String[][])obj;
			    	 for(int k=0;k<curr.length;k++)
						{
						
						 	  for(int m1=0;m1<curr[i].length;m1++)
						 	  {
						 		  
						 		 curr[k][m1]=null;  
						 	  }
			 	  
						}
			    	 }
	    	 
					firstCount=0;
					secondCount=0;
					thirdCount=0;
					continue L;
		}
     
   
	}
	System.out.println(firstCount);
	System.out.println(secondCount);
	System.out.println(thirdCount);
	
	 System.out.println("***************SE*****************");
	    for(int i=0;i<sem.length;i++)
		{
	  	  for(int m=0;m<sem[i].length;m++)
	  	  {
	  		if(sem[i][m]==null)
			 {
	  			sem[i][m]="N/A";
			 }
	  		System.out.print(sem[i][m]+"  ");  
	  	  }
	  	  System.out.println();
		}
	 
	 

	    System.out.println("***************TE*****************");
		 
	 for(int i=0;i<sem1.length;i++)
		{
		   	  for(int m=0;m<sem1[i].length;m++)
		   	  {
		   		if(sem1[i][m]==null)
				 {
		   			sem1[i][m]="N/A";
				 }
		   		System.out.print(sem1[i][m]+"  ");  
		   	  }
	             System.out.println();
	   }
	 

	 System.out.println("****************BE*****************");

	 for(int i=0;i<sem2.length;i++)
		{
		  for(int m=0;m<sem2[i].length;m++)
		    {
			 if(sem2[i][m]==null)
			 {
				 sem2[i][m]="N/A";
			 }
			System.out.print(sem2[i][m]+"  ");  
		    }
	        System.out.println();
		}

	
	
   
//    int []sePracCount = new int[5];
// 
//    int  sCountP=0;
//	int semPracsCount=0;
//	for(int i=0;i<seTeachNamePrac.length;i++)
//	{
//		 //int rnd=abc.getRandomNumber(teacher);
//		 String teacherName=seTeachNamePrac[i];
//         int count=Integer.parseInt(seLoadPrac[i])/2;
//	 
//	 
//         
//         while(count>0 && sCountP<100){
//        	 for(int m=0;m<sem[0].length;m++)
//        	  {
//        		  sCountP++;
//         	  int rndNo=abc.getRandomNumber(lecNo);
////    		       int lecN=practical[rndNo].split(",");
//    			   String pracTime[]=practical[m].split(",");
//    			 // System.out.println(sem[lecN][m]);
//    			  int prc1 = Integer.parseInt(pracTime[0]);
//    			  int prc2 = Integer.parseInt(pracTime[1]);
//             	  if(sePracCount[m]<3)
//             	  {
//             		
//             		  if(count>0 && !sem[prc1][m].contains(teacherName) && !sem1[prc1][m].equals(teacherName) && !sem1[prc2][m].equals(teacherName) && !sem2[prc1][m].equals(teacherName) && !sem2[prc2][m].equals(teacherName)){
//             			 sem[prc1][m]=sem[prc1][m]+"_"+teacherName;
//	             		 sem[prc2][m]=sem[prc2][m]+"_"+teacherName;
//	             		 sePracCount[m] = sePracCount[m] + 1;
//	             		 
//  	             		 semPracsCount=1;
//  	             		 count--;
//	             		 
//             		  }
//             		
//             	   
//
//             		 
//             		
//                    		  
//             	  }
//             	  
//             	
//        	  }  
//        	  }
//        	  if(sCountP>=100){
//        			System.out.println("Continue kar re baba. semPracsCount.."+teacherName);
//        			 List arrayList=new ArrayList();
//    		    	 arrayList.add(sem);
//    		    	 arrayList.add(sem1);
//    		    	 arrayList.add(sem2);
//    			    	 for(Object obj:arrayList){
//    			    		 String curr[][]=(String[][])obj;
//    			    	 for(int k=0;k<curr.length;k++)
//    						{
//    						
//    						 	  for(int m1=0;m1<curr[i].length;m1++)
//    						 	  {
//    						 		  
//    						 		 curr[k][m1]=null;  
//    						 	  }
//    			 	  
//    						}
//    			    	 }
//    	    	 
//    					firstCount=0;
//    					secondCount=0;
//    					thirdCount=0;
//        			continue L;
//        		}else{
//        			semPracsCount=0;
//        		}
//        
// 
//
//
//
//}
//	
	
//	
//	 System.out.println("***************SE*****************");
//	    for(int i=0;i<sem.length;i++)
//		{
//	  	  for(int m=0;m<sem[i].length;m++)
//	  	  {
//	  		if(sem[i][m]==null)
//			 {
//	  			sem[i][m]="N/A";
//			 }
//	  		System.out.print(sem[i][m]+"  ");  
//	  	  }
//	  	  System.out.println();
//		}
//	 
//	 
//
//	    System.out.println("***************TE*****************");
//		 
//	 for(int i=0;i<sem1.length;i++)
//		{
//		   	  for(int m=0;m<sem1[i].length;m++)
//		   	  {
//		   		if(sem1[i][m]==null)
//				 {
//		   			sem1[i][m]="N/A";
//				 }
//		   		System.out.print(sem1[i][m]+"  ");  
//		   	  }
//	             System.out.println();
//	   }
//	 
//
//	 System.out.println("****************BE*****************");
//
//	 for(int i=0;i<sem2.length;i++)
//		{
//		  for(int m=0;m<sem2[i].length;m++)
//		    {
//			 if(sem2[i][m]==null)
//			 {
//				 sem2[i][m]="N/A";
//			 }
//			System.out.print(sem2[i][m]+"  ");  
//		    }
//	        System.out.println();
//		}

	// for sem 1
//	int sem1PracsCount=0;
//	for(int i=0;i<teacher1.length;i++)
//	{
//		 //int rnd=abc.getRandomNumber(teacher);
//		 String teacherName=teacher1[i];
//    //	 int count=load[i];
//	 
//	 
//         
//   		
//        	  for(int m=0;m<sem1[0].length;m++)
//        	  {
//        		
//        	//  int rndNo=abc.getRandomNumber(lecNo);
//    			//  int lecN=lecNo[rndNo];
//    			//  String pracTime[]=practical[m].split(",");
//    			 // System.out.println(sem[lecN][m]);
//    			  
//             	  if(sem1[2][m]==null  && sem1[3][m]==null )
//             	  {
//             		
//             		  if(!sem[2][m].equals(teacherName) && !sem[3][m].equals(teacherName) && !sem2[2][m].equals(teacherName) && !sem2[3][m].equals(teacherName)){
//             			 sem1[2][m]=teacherName;
//	             		 sem1[3][m]=teacherName;
//	             		sem1PracsCount=1;
//	             		 break;
//             		  }
//             		
//             	   
//
//             		 
//             		
//                    		  
//             	  }
//             	  else{
//             		 
//             	  }
//        	  }
//        		if(sem1PracsCount<=0){
//        			System.out.println("Continue kar re baba .sem1PracsCount. "+teacherName);
//        			 List arrayList=new ArrayList();
//    		    	 arrayList.add(sem);
//    		    	 arrayList.add(sem1);
//    		    	 arrayList.add(sem2);
//    			    	 for(Object obj:arrayList){
//    			    		 String curr[][]=(String[][])obj;
//    			    	 for(int k=0;k<curr.length;k++)
//    						{
//    						
//    						 	  for(int m1=0;m1<curr[i].length;m1++)
//    						 	  {
//    						 		  
//    						 		 curr[k][m1]=null;  
//    						 	  }
//    			 	  
//    						}
//    			    	 }
//    	    	 
//    					firstCount=0;
//    					secondCount=0;
//    					thirdCount=0;
//        			continue L;
//        			
//        		}else{
//        			sem1PracsCount=0;
//        		}
// 
//}
//
//	// for sem 2
//			int sem2PracsCount=0;
//			for(int i=0;i<teacher2.length;i++)
//			{
//				 //int rnd=abc.getRandomNumber(teacher);
//				 String teacherName=teacher2[i];
//	        //	 int count=load[i];
//	    	 
//	    	 
//		         
//		   		
//		        	  for(int m=0;m<sem2[0].length;m++)
//		        	  {
//		        		
//		        	//  int rndNo=abc.getRandomNumber(lecNo);
//		    			//  int lecN=lecNo[rndNo];
//		    			//  String pracTime[]=practical[m].split(",");
//		    			 // System.out.println(sem[lecN][m]);
//		    			  
//		             	  if(sem2[4][m]==null  && sem2[5][m]==null )
//		             	  {
//		             		
//		             		  if(!sem[4][m].equals(teacherName) && !sem[5][m].equals(teacherName) && !sem1[4][m].equals(teacherName) && !sem1[5][m].equals(teacherName)){
//		             			 sem2[4][m]=teacherName;
//			             		 sem2[5][m]=teacherName;
//			             		sem2PracsCount=1;
//			             		 break;
//		             		  }
//		             		
//		             	   
//		
//		             		 
//		             		
//		                    		  
//		             	  }
//		             	  else{
//		             		 
//		             	  }
//		        	  }
//		        		if(sem2PracsCount<=0){
//		        			System.out.println("Continue kar re baba. sem2PracsCount.."+teacherName);
//		        			 List arrayList=new ArrayList();
//		    		    	 arrayList.add(sem);
//		    		    	 arrayList.add(sem1);
//		    		    	 arrayList.add(sem2);
//		    			    	 for(Object obj:arrayList){
//		    			    		 String curr[][]=(String[][])obj;
//		    			    	 for(int k=0;k<curr.length;k++)
//		    						{
//		    						
//		    						 	  for(int m1=0;m1<curr[i].length;m1++)
//		    						 	  {
//		    						 		  
//		    						 		 curr[k][m1]=null;  
//		    						 	  }
//		    			 	  
//		    						}
//		    			    	 }
//		    	    	 
//		    					firstCount=0;
//		    					secondCount=0;
//		    					thirdCount=0;
//		        			continue L;
//		        		}else{
//		        			sem2PracsCount=0;
//		        		}
//		 
//		}
// 
// 
 
 
 
 
 
	break L;
	}	
		
	
			
		
		
		
		
	
		 		 
		/* int count=0;
         String[] s=new String[7];
		 Set set=new LinkedHashSet();
		 int sum=0;
		 int a[]={1,2,3,4,5};
		   for(int i=0;i<5;i++){
			   for(int j=1;j<5;j++){
				   for(int k=2;k<5;k++){
					   sum=0;
					   if(i!=j && j!=k && i!=k)
					   {
						     sum=a[i]+a[j]+a[k];
						     set.add(a[i]+" "+a[j]+" "+a[k]);
					   }
				   }  
			   }   
		   }
		   
		   
		   
		 
		 String totalCount[][]=new String[5][2];
		 for(int i=0;i<totalCount.length;i++){
     		    totalCount[i][1]="0";
		    	 		     } 
	     
		 
		 
		Object[] mbh=set.toArray();
	     for(Object f:mbh){
			    	 String newString=(String)f;
			    	 System.out.println(newString);
			    	 String newArray[]=newString.split(" ");
	    	  
	    	         for(String t:newArray){
	    		 
			    		  int g=Integer.parseInt(t);
			    		  int m=Integer.parseInt(totalCount[g-1][1])+1;
			    		  
			    		  totalCount[g-1][1]=""+m;
		    		 
	    	     }
	     }
	     
	     
	     for(int i=0;i<totalCount.length;i++){
		    	 System.out.println(totalCount[i][1]);
		    	 		     
	     }
	    */ 
	     
	System.out.println("********************DG Pracs*******************************");     
	  List<String> seTList= Arrays.asList(seTeachName); 
	  List<String> teTList= Arrays.asList(teTeachName); 
	  List<String> beTList= Arrays.asList(beTeachName); 
			  
			  
	 for(int i=0;i<sem.length;i++)
		{
	  	  for(int m=0;m<sem[i].length;m++)
	  	  {
	  		if(sem[i][m]!="N/A")  {
	  			int index = seTList.indexOf(sem[i][m].trim());
	  			sem[i][m] = sem[i][m]+'#'+seSubName[index];
	  			
	  		}
	  	//	System.out.print(sem[i][m]+"           ");  
	  	  }
	  	//  System.out.println();
		}
	 
	 
	// System.out.println("*********************************");

		 
	 for(int i=0;i<sem1.length;i++)
		{
		   	  for(int m=0;m<sem1[i].length;m++)
		   	  {
		   		if(sem1[i][m]!="N/A")  {
		  			int index = teTList.indexOf(sem1[i][m].trim());
		  			sem1[i][m] = sem1[i][m]+'#'+teSubName[index];
		  			
		  		}
		   	//	System.out.print(sem1[i][m]+"           ");  
		   	  }
	          //    System.out.println();
	   }
	 

	 System.out.println("*********************************");

	 for(int i=0;i<sem2.length;i++)
		{
		  for(int m=0;m<sem2[i].length;m++)
		    {
			  if(sem2[i][m]!="N/A")  {
		  			int index = beTList.indexOf(sem2[i][m].trim());
		  			sem2[i][m] = sem2[i][m]+'#'+beSubName[index];
		  			
		  		}
			//System.out.print(sem2[i][m]+"           ");  
		    }
	     // System.out.println();
		}
		 
	    
	    
		 
		 
		 
	 List arrayList=new ArrayList();
	 Map<String,String[][]> timeTableMap =  new HashMap<String, String[][]>();
	 timeTableMap.put("SE", sem);
	 timeTableMap.put("BE", sem1);
	 timeTableMap.put("TE", sem2);
	 
	 return timeTableMap;
/*	 arrayList.add(sem);
	 arrayList.add(sem1);
	 arrayList.add(sem2);
	 
	 List<String[]> masterSub=new ArrayList<String[]>();
	 
	 masterSub.add(seSubName);
	 masterSub.add(teSubName);
	 masterSub.add(beSubName);
	 
 List<String[]> masterTech=new ArrayList<String[]>();
	 
 masterTech.add(teacher);
 masterTech.add(teacher1);
 masterTech.add(teacher2);
	 
 
 String practTimeTable[]={"0,1","2,3","4,5"};
 
 
	 
	 
 	 for(int i=0;i<arrayList.size();i++){
		 String curr[][]=(String[][])arrayList.get(i);
		 String currentSubArray[]=(String[])masterSub.get(i);
		 String currentTech[]=(String[])masterTech.get(i);
		 String currentPrac=practTimeTable[i];
		 String pracIndex[]=currentPrac.split(",");
		 int index1=Integer.parseInt(pracIndex[0]);
		 int index2=Integer.parseInt(pracIndex[1]);
	 for(int k=0;k<curr.length;k++)
		{
		
		 	  for(int m1=0;m1<curr[k].length;m1++)
		 	  {
		 		  
		 		String Teacher=curr[k][m1];
		 		int index=0;
		 		for(int d=0;d<currentTech.length;d++){
		 			if(Teacher.equals(currentTech[d])){
		 				index=d;
		 				break;
		 			}
		 			
		 		}
		 		String subject=currentSubArray[index];
		 		if(k==index1 || k==index2)
		 		   curr[k][m1]=Teacher+"-"+subject+"- ";
		 		else
		 			curr[k][m1]=Teacher+"-"+subject;
		 	  }
	  
		}
	 }*/
	
	 //return arrayList;
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
}
}
