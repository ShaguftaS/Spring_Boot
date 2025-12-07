package com.example.springboot.mycoolapp.Human;

import java.util.HashMap;

public class ApplicationMap {

    public static void main(String[] args){

        HashMap<String, String> dict = new HashMap<String, String>();
        dict.put("Brave","ready to face to face ");
        dict.put("Brilliant","clever or talented ");
        dict.put("Joy","a feeling of great pleasure");
        dict.put("Confidence","state of feeling certain about the truth");

        for(String word: dict.keySet()){
            System.out.println(dict.get(word));
            System.out.println(word);

        }


    }
}
