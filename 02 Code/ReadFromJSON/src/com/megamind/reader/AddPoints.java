package com.megamind.reader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class AddPoints {

	public AddPoints() {
		// TODO Auto-generated constructor stub
		processData("1718points.txt");
	}
	
	
	
	
	
	
	
	
	
	
	public void processData(String fileName) {
		String line="";
	    FileReader fr;
	    int i=0, j=0;

		try {
			fr = new FileReader(fileName);
	        Scanner scan = new Scanner (fr);
	        
	        while(scan.hasNext()){
	        	
	        	String line1=scan.nextLine();
	        	
	        	
	        	ArrayList<String> teamArray = new ArrayList<String>();

	        	
	        	String[] split = line1.split(",");
	        	String team = split[0];
	        	
	        	Double points = Double.valueOf(split[1]);
	        	if (teamArray.contains("Arsenal")){
	        		System.out.println("Paisi");
	        		
	        	}
	        	else{
	        		teamArray.add(split[0]);
	        	}
	        	
	        	System.out.println(points);
	        	
	        	
	        	
	        	
	        	Scanner sc = new Scanner (line);

	        	
//	        	System.out.println("Home Team = " + split[0]+ " Away Team = " + split[1]);
	        	

	    	        FileWriter writer1 = new FileWriter("nothing.txt",true);
	    			BufferedWriter writer2= new BufferedWriter (writer1);
	    			PrintWriter writer = new PrintWriter(writer2); 
	    			//writer.println("home_team,away_team,home_goals,away_goals,result,season");
	        		

	    			writer.flush();  
	    			writer.close();
	        		//System.out.println("First occurance of "+split[0]);
	        	
	        	
	        	sc.close();
	        }
	        scan.close();
	        //rowArray list is done. using it to create column arraylist
 

        
	        
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
	}

	
	
	

}
