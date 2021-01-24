package com.madhumita.csv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class CR {
	
	public static void main(String[] args) {
		String csvfile = "C:\\Users\\Madhumeeta\\Desktop\\CSVFile\\POP.csv";
        BufferedReader fileReader = null;
        final String DELIMITER = ",";
        Scanner sc=new Scanner(System.in);
        try
        {
            String line = "";
            System.out.println("Enter country name & Year:");
            String cName=sc.nextLine();
            String year=sc.nextLine();
            System.out.println("CountryName  CountryCode year  Population");
            fileReader = new BufferedReader(new FileReader(csvfile));
           while ((line = fileReader.readLine()) != null) 
            {
                  String[] tokens = line.split(DELIMITER);
                    for(String token : tokens)
                      {
                		 if(tokens[0].equals(cName))
                		    {
                			 if(tokens[2].equals(year))
                             {
                               System.out.print(token+"  ");
                             }
                          }
                       } 
                	 System.out.println();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally
        {
            try {
                fileReader.close();
                sc.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }	
}



