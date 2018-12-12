package com.megamind.reader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.Scanner;

public class WinningClassAdder {

	public WinningClassAdder() {
		// TODO Auto-generated constructor stub
		processData("1415in.txt");
	}

	
	public void processData(String fileName) {
		String line="";
	    FileReader fr;
	    int i=0, j=0;

		try {
			fr = new FileReader(fileName);
	        Scanner scan = new Scanner (fr);
	        

			
			
			


	        
	        while(scan.hasNext()){
	        	String teamData1="";
	        	String teamData2="";
	        	
	        	String line1=scan.nextLine();
	        	String line2=scan.nextLine();
	        	teamData1 = line1;
	        	teamData2 = line2;
	        	
	        	String[] split1 = line1.split(",");
	        	String[] split2 = line2.split(",");
	        	Double score1 = Double.valueOf(split1[2]);
	        	Double score2 = Double.valueOf(split2[2]);
	        	System.out.println(teamData1);
	        	System.out.println(teamData2);
	        	System.out.println("scores= "+score1+" "+score2);
	        	String result1="";
	        	String result2="";
	        	 if (score1>score2){
	        		 //home win =1
	        		 result1="1";
	        		 result2="-1";
	        		 System.out.println("Home Win");
	        	 }
	        	 else if (score1<score2){
	        		 //away win =1
	        		 result1="-1";
	        		 result2="1";
	        		 System.out.println("Home Loss");
	        	 }
	        	 else{
	        		 //Draw
	        		 result1="0";
	        		 result2="0";
	        	 }
	        	 teamData1=teamData1+","+result1;
	        	 teamData2=teamData2+","+result2;
	        	 System.out.println(teamData1);
	        	 System.out.println(teamData2);
	        
	        	

	        	
//	        	System.out.println("Home Team = " + split[0]+ " Away Team = " + split[1]);
	        	

	    	        FileWriter writer1 = new FileWriter("data_1415.txt",true);
	    			BufferedWriter writer2= new BufferedWriter (writer1);
	    			PrintWriter writer = new PrintWriter(writer2); 
	    			//writer.println("home_team,away_team,home_goals,away_goals,result,season");
	        		
	    			writer.println(teamData1);
	    			writer.println(teamData2);

	    			writer.flush();  
	    			writer.close();

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
