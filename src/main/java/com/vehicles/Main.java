package com.vehicles;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike("Thar","xuv123","sportsBike");
        System.out.println(bike.maxSpeed("sportsBike"));
        System.out.println(bike.getManufacturerInformation());
        Car car= new Car("Ciaz","xuv500 ","sedan");
        System.out.println(car.maxSpeed("sedan"));
        System.out.println(car.getManufacturerInformation());



    }
}