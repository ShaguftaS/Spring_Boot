package com.example.springboot.mycoolapp.Human;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application3 {

    public static void main(String[] args){

        HashSet <Integer> val = new HashSet<Integer>();
        val.add(12);
        val.add(33);
        val.add(99);
        val.add(200);
        val.add(33);

        for(int i : val){

            System.out.println(i);
        }

        HashSet<String> str = new HashSet<String>();
        str.add("Ran");
        str.add("Box");
        str.add("Ran");

        for(String s : str){

            System.out.println(s);
        }

        LinkedHashSet<String> ll = new LinkedHashSet<String>();
        ll.add("car");
        ll.add("hi");
        ll.add("Shagufta");
        ll.add("car");

        for (String ls : ll){
            System.out.println(ls);
        }


    }
}
