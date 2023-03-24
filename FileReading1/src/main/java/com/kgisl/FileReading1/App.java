package com.kgisl.FileReading1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mysql.cj.x.protobuf.MysqlxCrud.Collection;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException, CsvException {
        System.out.println("Hello World!");
        // try (CSVReader reader = new CSVReader(new FileReader("worldcities.csv")))
        // {
        // List<Cities> r = reader.readAll();
        // // r.forEach(x -> System.out.println(Arrays.toString(x)));
        // List<Cities> obj = (List)r;
        // System.out.println(obj);
        // // List<String[]> m = r.stream().distinct().collect(Collectors.toList());
        // // System.out.println(m);
        // }

        List<Cities> beans = new CsvToBeanBuilder(new FileReader("worldcities - Copy.csv"))
                .withType(Cities.class).withSkipLines(1)
                .build()
                .parse();

        // beans.forEach(System.out::println);

        // 1)Unique cities

        // List<String> x =
        // beans.stream().map(Cities::getCity).distinct().collect(Collectors.toList());
        // System.out.println(x);

        // 2)Total no of cities
        // long k = beans.stream().map(Cities::getCity).count();
        // System.out.println(k);
        // }

        // 3)Country wise city count
        // Map<String, Long> i =
        // beans.stream().collect(Collectors.groupingBy((Cities::getCity),Collectors.counting()));
        // System.out.println(i);

        // 4)Cities in same lat
        // Map<String, List<String>> i =
        // beans.stream().collect(Collectors.groupingBy((Cities::getLat),Collectors.mapping(Cities::getCity,
        // Collectors.toList())));
        // System.out.println(i);

        // 5)Cities in same lng
        // Map<String, List<String>> i =
        // beans.stream().collect(Collectors.groupingBy((Cities::getLng),Collectors.mapping(Cities::getCity,
        // Collectors.toList())));
        // System.out.println(i);

        // 6)Order cities by population
        // Map<String, List<String>> i =
        // beans.stream().collect(Collectors.groupingBy((Cities::getCity),Collectors.mapping(Cities::getPopulation,
        // Collectors.toList())));
        // System.out.println(i);

        
        //7)Less populated city 
                // List<String> a =beans.stream().map(Cities::getPopulation).filter(x->!x.isEmpty()).collect(Collectors.toList());
                // System.out.println(a);
                // List<Double> h = a.stream().map(Double::parseDouble).collect(Collectors.toList());
                // Double v = h.stream().min(Double::compare).get();
                // System.out.println(v);

                // List<Double> h = a.stream().map(Double::parseDouble).collect(Collectors.toList());
                // Double v = h.stream().max(Double::compare).get();
                // System.out.println(v);
       
        // Double m=0.0;
        // for(int i=0;i<h.size();i++)
        // {
        //    for(int j=i+1;j<h.size();j++)

        //    {
        //     if(h.get(i)> h.get(j) )
        //     {
        //        m = h.get(j);
               
        //     }
        //    }
        // System.out.println(m);
    
    //     for(int i=0;i<a.size();i++)
    //     {
    //     String popString = a.get(i);
    //     if(popString!=null && popString!="" )
    //     {
    //     double g = Double.parseDouble(popString);
    //     System.out.println(g);
    //     }
    //     }
        
    
        // 8)Print country name in A-Z
        // beans.stream().map(Cities::getCity).sorted().forEach(System.out::println);

        //9)print the cities ending with "ing"
        //  beans.stream().filter(x->x.getCity().endsWith("ing")).forEach(System.out::println);

         //10)Search my city
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the city");
        // String m = sc.next();
        // List<String> l = beans.stream().map(Cities::getCity).collect(Collectors.toList());;
        // // for(int i=0;i<l.size();i++)
        // // {
        // if (l.contains(m)) 
        // {
        //     System.out.println(m);
        
        // }

        // 11)List Unique capital

    //  List<String> j = beans.stream().map(Cities::getCapital).distinct().collect(Collectors.toList());
    //  System.out.println(j);


       // 12)Selected country total population

        // List<String> a =beans.stream().map(Cities::getPopulation).filter(x->!x.isEmpty()).collect(Collectors.toList());
        // List<Double> h = a.stream().map(Double::parseDouble).collect(Collectors.toList());
        //   double f = h.stream().mapToDouble(Double::new).sum();
        //   System.out.println(f);

        //13)Selected country avg population

        //   List<String> a =beans.stream().map(Cities::getPopulation).filter(x->!x.isEmpty()).collect(Collectors.toList());
        //   List<Double> h = a.stream().map(Double::parseDouble).collect(Collectors.toList());
        //     OptionalDouble f = h.stream().mapToDouble(Double::new).average();
        // //     System.out.println(f);
          
         //14)Country wise state count
            
            //     Map<String, Long> i = beans.stream().collect(Collectors.groupingBy((Cities::getAdmin_name),Collectors.mapping(Cities::getCountry,
            //    Collectors.counting())));
            //    System.out.println(i);

            //15)state wise city count
            //      Map<String, Long> i = beans.stream().collect(Collectors.groupingBy((Cities::getCity),Collectors.mapping(Cities::getAdmin_name,
            //    Collectors.counting())));
            //    System.out.println(i);

          //  16)List the states by country
            //      Map<String, List<String>> i = beans.stream().collect(Collectors.groupingBy((Cities::getAdmin_name),Collectors.mapping(Cities::getCountry,Collectors.toList())));
            //    System.out.println(i);

          
               List<String> g = beans.stream().map(Cities::getCity).collect(Collectors.toList());
               for(int i =0; i < g.size(); i++) {
                if (g.contains(g.get(i))) {
                    System.out.println(g.get(i)+" is duplicated");
                }
              }






      
      


        

       
        



      


       

        
    }
}