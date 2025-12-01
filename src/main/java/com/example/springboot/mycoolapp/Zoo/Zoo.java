package com.example.springboot.mycoolapp.Zoo;

public class Zoo {

    public static void main(String []args){

        Animal an = new Animal(10,"Male", 55);
        an.eat();
        an.sleep();
        an.play();

    }
}
