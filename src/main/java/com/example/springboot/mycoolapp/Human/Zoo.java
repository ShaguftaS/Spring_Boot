package com.example.springboot.mycoolapp.Human;

public class Zoo {

    public static void main(String []args){

        Animal an = new Animal(10,"Male", 55);
        an.eat();
        an.sleep();
        an.play();

        bird b1 = new bird();
        b1.fly();

        fish f1 = new fish();
        f1.swim();

    }
}
