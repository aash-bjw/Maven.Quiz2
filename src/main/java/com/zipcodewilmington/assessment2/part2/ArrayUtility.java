package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array1);
        Collections.addAll(list, array2);

        return list.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        int counter = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals(array2)) {
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {

        Arrays.sort(array);
        int counter = 1,
                tempCounter;
        int common = array[0];
        for (int i = 0; i < (array.length - 1); i++)
        {
            int temp = array[i];
            tempCounter = 0;
            for (int j = 1; j < array.length; j++)
            {
                if (temp == array[j])
                    tempCounter++;
            }
            if (tempCounter > counter)
            {
                common = temp;
                counter = tempCounter;
            }
        }
        return common;
    }
}
