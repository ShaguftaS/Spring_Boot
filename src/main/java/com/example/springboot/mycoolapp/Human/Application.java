package com.example.springboot.mycoolapp.Human;

import java.util.ArrayList;
import java.util.LinkedList;

public class Application {

    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("there");

        String i1 = words.get(0);
        System.out.println(i1);

        LinkedList<String> str = new LinkedList<String>();

        str.add("Shagufta");
        str.add("Syeda");
        str.add(" is my ");
        str.add("name");

        for(String s : str){

            System.out.println(s);
        }



    }




}
