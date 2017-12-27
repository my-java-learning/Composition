package com.example;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "Dell" , "240" , dimensions);
        Monitor monitor = new Monitor("27inch Beast" , "Acer" , 27 , new Resolution(2540,1440));
        Motherboard motherboard = new Motherboard("BJ-200" , "Asus" , 4 , 6 , "v2.44");
        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUp();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("East");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modelr", 4,3,2,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims" , wall1, wall2, wall3, wall4 , ceiling, bed , lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
