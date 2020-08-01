package com.java.principle.singleresponsibility;

public class Singleresponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }

}

    class Vehicle2{

        public void run(String vehicle){System.out.println(vehicle + "在地上运行. . . . .  ");}
        public void runAir(String vehicle){System.out.println(vehicle + "在天空中运行. . . . .  ");}
        public void runWater(String vehicle){System.out.println(vehicle + "在水中运行. . . . .  ");}

}
