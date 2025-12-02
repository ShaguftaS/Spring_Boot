package com.example.springboot.mycoolapp.Human;

import java.util.ArrayList;

public class Application2 {

    public static void main(String []args){

        ArrayList<String>  ani = new ArrayList<String>();
        ani.add("Lion");
        ani.add("Cat");
        ani.add("Dog");

//        for(int i=0; i < ani.size(); i++){
//            System.out.println(ani.get(i));
//        }
//
//        for(String an: ani){
//
//            System.out.println(an);
//        }

        ArrayList<Vehicle> veh = new ArrayList<Vehicle>();
        Vehicle veh2 = new Vehicle("Toyota", "Camery", 12500, false);
        veh.add(new Vehicle("Honda", "accord", 12000, false ));
        veh.add(veh2);
        veh.add(new Vehicle("Jeep", "Wrangler", 14555, true));

        for(Vehicle c : veh){

            System.out.println(c);
            System.out.println(c.getMake());
            System.out.println(c.fourWDrive);
            System.out.println(c.model);
        }

    }
}
