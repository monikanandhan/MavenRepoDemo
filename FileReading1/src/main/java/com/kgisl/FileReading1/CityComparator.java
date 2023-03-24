package com.kgisl.FileReading1;

import java.util.Comparator;

public class CityComparator implements Comparator<Cities>{

    @Override
    public int compare(Cities o1, Cities o2) {
        if(o1.getPopulation()==o2.getPopulation())
        return -1;
        else 
        return 0;
    }

   

   
}
