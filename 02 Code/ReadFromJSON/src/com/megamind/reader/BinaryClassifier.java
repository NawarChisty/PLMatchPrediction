package com.megamind.reader;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class BinaryClassifier {

	public BinaryClassifier() {
		// TODO Auto-generated constructor stub
		processData("homeNaway.txt");
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
	        	
	        	
	        	String[] split1 = line1.split(",");
	        	
	        	//String team1Point = split1[0];
	        	//String team2Point = split2[0];
	        	String x = split1[4];
	        	Double winningClass = Double.valueOf(x);
	        	int wc = winningClass.intValue();
	        	if (winningClass<0){
	        		winningClass=0.0;
	        	}
	        	String team1NewData = split1[0]+","+split1[1]+","+split1[2]+","+split1[3]+","+winningClass.intValue();
	        	
//	        	System.out.println("Home Team = " + split[0]+ " Away Team = " + split[1]);
	        	

	    	        /*FileWriter writer1 = new FileWriter("home.txt",true);
	    			BufferedWriter writer2= new BufferedWriter (writer1);
	    			PrintWriter writerH = new PrintWriter(writer2); 
	    			
	    	        FileWriter writer3 = new FileWriter("away.txt",true);
	    			BufferedWriter writer4= new BufferedWriter (writer3);
	    			PrintWriter writerA = new PrintWriter(writer4);
	    			//writer.println("home_team,away_team,home_goals,away_goals,result,season");
	        		writerH.println(team1NewData);
	        		writerA.println(team2NewData);
	    			writerH.flush();  
	    			writerH.close();
	    			writerA.flush();  
	    			writerA.close();*/
    	        FileWriter writer1 = new FileWriter("finalDataset_2class.txt",true);
    			BufferedWriter writer2= new BufferedWriter (writer1);
    			PrintWriter writer = new PrintWriter(writer2); 
    			//writer.println("home_team,away_team,home_goals,away_goals,result,season");
        		writer.println(team1NewData);

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
