package com.zipcodewilmington.assessment2.part1;

import java.util.ArrayList;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Boolean evenLength = false;

        if(array.length % 2 == 0)
             evenLength = true;
        return evenLength ;
    }

    public Integer[] range(int start, int stop) {

        ArrayList<Integer> outcome = new ArrayList<>();

        for(int i = start; i <= stop; i++)
            outcome.add(i);

        return outcome.toArray(new Integer[0]);
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        int sum = 0;
        for(int i = 0; i < 2; i++){
           sum+= array[i];
        }

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        int product = 1;
        for(int i = array.length - 2; i < array.length; i++){
            product *= array[i];
        }

        return product;
    }
}
