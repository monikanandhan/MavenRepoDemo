
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.opencsv.exceptions.CsvException;


public class OpenCsv {

    public void CSVReader(String filepath) throws FileNotFoundException
    {
        Scanner sc = new Scanner(new File(filepath));  
        sc.useDelimiter(",");   
        while (sc.hasNext())  
        {  
    
        System.out.print(sc.next());  
            }   
        sc.close(); 
    }
    public static void main(String args[]) throws  IOException, CsvException
    {
        String filepath=new File("").getAbsolutePath()+File.separator+"/src/main/resources/worldcities.csv";
       OpenCsv obj=new OpenCsv();
       obj.CSVReader(filepath);
    }

    }