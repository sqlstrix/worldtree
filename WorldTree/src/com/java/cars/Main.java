package com.java.cars;

public class Main {
    public static void main(String args[]) {

        Car c = new Car();
        System.out.println("Создана новая машина: " + c.toString());
        c.fueling(40D);

        double distance = 5D;
        if (c.drive(distance)) {
            System.out.println("Мы проехали " + distance + " миль");
            System.out.println("Осталось горючего: " + c.getFuelLevel() + " литров");
            System.out.println("Текущий пробег: " + c.getMileage() + " миль");
        } else {
            System.out.println("Не могу ехать (проверь колёса и бак)");
        }

        double fuel = 0.5D;
        if (c.fueling(fuel)) {
            System.out.println("В бак залито " + fuel + " литров бензина");
        } else {
            System.out.println("Не удалось залить в бак " + fuel + " литров бензина");
        }

        System.out.println("Машина в конце дня: " + c.toString());

    }
}
