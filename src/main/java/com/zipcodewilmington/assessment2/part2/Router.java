package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;

public class Router {


    HashMap <String, String> outcome = new HashMap<>();
        //this.outcome = new HashMap();


    public void add(String path, String controller) {


        outcome.put(path, controller);
    }

    public Integer size() {

        return outcome.size();
    }

    public String getController(String path) {

        return outcome.get(path);
    }

    public void update(String path, String newController) {

        outcome.replace(path, newController);
    }

    public void remove(String path) {

        outcome.remove(path);
    }

    public String toString(){
        return outcome.keySet().toString();
    }
}
