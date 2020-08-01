package com.java.principle.singleresponsibility;

public class Singleresponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("小汽车");

        AiVehicle aiVehicle = new AiVehicle();
        aiVehicle.run("飞机");
    }


}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行. . . . .  ");
    }
}

class AiVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在天空中运行. . . . .  ");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在水中运行. . . . .  ");
    }
}
