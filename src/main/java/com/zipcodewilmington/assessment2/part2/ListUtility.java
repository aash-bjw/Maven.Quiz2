package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListUtility {

   ArrayList<Integer> newList = new ArrayList<>(0);

    public Boolean add(int i) {
        return newList.add(i);
    }

    public Integer size() {
       return newList.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> unique = new ArrayList<>();
        for(Integer i : newList){
            if(!unique.contains(i)){
                unique.add(i);
            }
        }
        return unique;
    }

    public String join() {
        String joinString = "" + newList.get(0);
        for(int i = 1; i < newList.size(); i++){
            joinString += ", " + newList.get(i);
        }
        return joinString;
    }

    public Integer mostCommon() {
        Integer[] array = new Integer[newList.size()];
        ArrayUtility arrayUtility = new ArrayUtility();
        return arrayUtility.mostCommon(newList.toArray(array));

    }

    public Boolean contains(Integer valueToAdd) {

        return newList.contains(valueToAdd);
    }
}
