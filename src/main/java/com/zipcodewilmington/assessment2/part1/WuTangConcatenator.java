package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public WuTangConcatenator(Integer input) {
    }

    public Boolean isWu() {
        boolean multiple = false;
        Integer input = 0;
        if(input % 3 == 0) {
            multiple = true;
        }
        return multiple;
    }

    public Boolean isTang() {
        boolean multiple = false;
        Integer input = 0;
        if (input % 5 == 0) {
            multiple = true;
        }
        return multiple;
    }

    public Boolean isWuTang() {
        boolean multiple = false;
        Integer input = 0;
        if (input % 3 == 0 && input % 5 == 0) {
            multiple = true;
        }
        return multiple;
    }
}
