package com.megamind.reader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class OpponentAdder {

	public OpponentAdder() {
		// TODO Auto-generated constructor stub
		processData("ft.txt");
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
	        	String line2=scan.nextLine();
	        	
	        	String[] split1 = line1.split(",");
	        	String[] split2 = line2.split(",");
	        	String team1Point = split1[0];
	        	String team2Point = split2[0];
	        	String team1NewData = split1[0]+","+team2Point+","+split1[1]+","+split1[2]+","+split1[3];
	        	String team2NewData = split2[0]+","+team1Point+","+split1[1]+","+split2[2]+","+split2[3];
	        	
	      
    	        FileWriter writer1 = new FileWriter("finalDataset_3class.txt",true);
    			BufferedWriter writer2= new BufferedWriter (writer1);
    			PrintWriter writer = new PrintWriter(writer2); 
    			//writer.println("home_team,away_team,home_goals,away_goals,result,season");
        		writer.println(team1NewData);
        		writer.println(team2NewData);

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
