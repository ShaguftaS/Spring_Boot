package com.example.springboot.mycoolapp.Human;

public class Human {

    String name;
    int age;
    int height;
    String eyeColor;

    public Human(String name, int age, int height, String eyeColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speak(){
        System.out.println("Hello, my name is "+name);
        System.out.println("I'm "+ age+ " years old");
        System.out.println("I'm "+height+" inches tall");
        System.out.println("My eye color is "+eyeColor);
    }
    public void eat(){
        System.out.println("eating ...");
    }
    public void walk(){
        System.out.println("walking....");
    }
    public void work(){
        System.out.println("working....");
    }
}
