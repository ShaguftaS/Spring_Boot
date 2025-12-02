package com.example.springboot.mycoolapp.Human;

import java.util.ArrayList;

public class Application2 {

    public static void main(String []args){

        ArrayList<String>  ani = new ArrayList<String>();
        ani.add("Lion");
        ani.add("Cat");
        ani.add("Dog");

        for(int i=0; i < ani.size(); i++){
            System.out.println(ani.get(i));
        }

        for(String an: ani){

            System.out.println(an);
        }

    }
}
