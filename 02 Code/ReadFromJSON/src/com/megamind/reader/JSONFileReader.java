package com.megamind.reader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class JSONFileReader {

	public JSONFileReader() {
		// TODO Auto-generated constructor stub
		//processData("1415.json");
		//processData("1516.json");
		//processData("1617.json");
		processData("1718.json");
		
	}
	
	
	public void processData(String fileName) {
	    

		try {
			FileReader fr = new FileReader(fileName);
	        Scanner scan = new Scanner (fr);
	        
	        while(scan.hasNext()){
	        	String teamData="";
	        	
	        	String line=scan.nextLine();
	        	while(!line.contains("team_name")){
	        		if(scan.hasNext())
	        			line=scan.nextLine();
	        	}
	        	if(line.contains("team_name")){
	        		String[] split = line.split(":");
	        		String name = split[1];
	        		int length= split[1].length()-2;
	        		//System.out.println(team_name.substring(1, length));
	        		 name = name.substring(1, length);
	        		 teamData=teamData+name;
	        		if(scan.hasNext())
	        			line=scan.nextLine();
	        		
	        	}
	        	while(!line.contains("possession_percentage")){
	        		if(scan.hasNext())
	        			line=scan.nextLine();
	        	}
	        	if(line.contains("possession_percentage")){
	        		String[] split = line.split(":");
	        		String poss = split[1];
	        		int length= split[1].length()-2;
	        		poss = poss.substring(1, length);
	        		//Double possession = Double.valueOf(poss);
	        		
	        		teamData=teamData+","+poss;
	        		//System.out.println(teamData);
	        		if(scan.hasNext())
	        			line=scan.nextLine();
	        		
	        	}
	        	while(!line.contains("goals")){
	        		if(scan.hasNext())
	        			line=scan.nextLine();
	        	}
	        	if(line.contains("goals")){
	        		String[] split = line.split(":");
	        		String goals = split[1];
	        		String[] split2 = goals.split("\"");
	        		goals = split2[1];
	        		//int length= split[1].length()-2;
	        		//goals = goals.substring(1, length);
	        		//Double possession = Double.valueOf(goals);
	        		
	        		teamData=teamData+","+goals;
	        		//System.out.println(teamData);
	        		if(scan.hasNext())
	        			line=scan.nextLine();
	        		
	        	}
	        	//String[] split = line.split(",");

	    	        //FileWriter writer1 = new FileWriter("1415in.txt",true);
	    	        //FileWriter writer1 = new FileWriter("1516in.txt",true);
	    	        //FileWriter writer1 = new FileWriter("1617in.txt",true);
	    	        FileWriter writer1 = new FileWriter("1718in.txt",true);
	    			BufferedWriter writer2= new BufferedWriter (writer1);
	    			PrintWriter writer = new PrintWriter(writer2); 
	    			//writer.println("home_team,away_team,home_goals,away_goals,result,season");
	        		
	    			writer.println(teamData);


	    			writer.flush();  
	    			writer.close();

	        }
	        fr.close();
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
