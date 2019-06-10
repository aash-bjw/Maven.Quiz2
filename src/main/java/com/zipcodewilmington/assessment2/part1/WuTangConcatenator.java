package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    public WuTangConcatenator(Integer input) {
    }

    public Boolean isWu() {
        boolean multiple = false;
        int i = 0;
        if(i % 3 == 0)
            multiple = true;

        return multiple;
    }

    public Boolean isTang() {
        return null;
    }

    public Boolean isWuTang() {
        return null;
    }
}
