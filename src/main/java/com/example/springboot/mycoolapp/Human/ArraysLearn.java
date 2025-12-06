package com.example.springboot.mycoolapp.Human;

import java.util.ArrayList;

public class ArraysLearn {

    public static void main(String []args){

        int value[] = new int[100];

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(12);
        list1.add(323);
        list1.add(878);
        list1.add(454);
        list1.add(10);
        list1.add(10);
        list1.add(454);
        list1.add(454);

        ArrayList<Integer> newlist = new ArrayList<Integer>();
        newlist.add(10);
        newlist.add(100);
        newlist.add(410);
        newlist.add(454);

        list1.retainAll(newlist);


        System.out.println(list1);
    }
}
