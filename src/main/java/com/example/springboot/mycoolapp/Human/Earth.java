package com.example.springboot.mycoolapp.Human;

public class Earth {

    public static void main(String []args){

        Human hum1 = new Human("Tom", 25,76,"Blue");
        Human hum2 = new Human("Joe",28,68, "Green");

        hum2.speak();
        hum1.speak();




    }
}
