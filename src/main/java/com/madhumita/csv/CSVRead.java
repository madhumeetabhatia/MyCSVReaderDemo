package com.madhumita.csv;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvValidationException;
public class CSVRead {

	public static void main(String args[]) throws IOException, CsvValidationException {
		 try {
			
			 Scanner sc=new Scanner(System.in);
		     File f=new File("C:\\Users\\Madhumeeta\\Desktop\\CSVFile\\POP.csv");
			 FileReader fr=new FileReader(f);
			 CSVReader reader=new CSVReaderBuilder(fr)
					        .withSkipLines(1)
					        .build();
		     String line[];
				
			 System.out.println("Enter your desire country Name & year:"); 
			 String cc=sc.nextLine(); 
			 String yy=sc.nextLine();
			 while ((line = reader.readNextSilently()) != null) 
			 {
		    	   if(cc.equals(line[0]) && yy.equals(line[2]))
		    	   {
		    		   System.out.println("["+line[0]+" "+line[1]+" "+line[2]+" "+line[3]+"]");
		    	   }
			 }   	      
			}
		     catch(Exception e)
			{
				e.printStackTrace();
			}
		 		
		}
}
