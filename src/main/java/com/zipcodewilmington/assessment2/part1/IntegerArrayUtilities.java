package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return (array ); //(array );
    }

    public Integer[] range(int start, int stop) {
        return null;
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
