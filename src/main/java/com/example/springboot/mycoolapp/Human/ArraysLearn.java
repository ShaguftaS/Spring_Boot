package com.example.springboot.mycoolapp.Human;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ArraysLearn {

    public static void main(String []args){

        int value[] = new int[100];

        HashSet<Integer> list1 = new HashSet<>();
        list1.add(12);
        list1.add(323);
        list1.add(878);
        list1.add(454);
        list1.add(10);
        list1.add(10);
        list1.add(454);
        list1.add(454);

        ArrayList<Integer> myList = new ArrayList<Integer>(list1);

        Collections.sort(myList);
        System.out.println(myList);




    }
}
