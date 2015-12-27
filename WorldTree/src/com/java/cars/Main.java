package com.java.cars;

public class Main {
    public static void main(String args[]) {

        Car c = new Car();
        System.out.println("������� ����� ������: " + c.toString());
        c.fueling(40D);

        double distance = 5D;
        if (c.drive(distance)) {
            System.out.println("�� �������� " + distance + " ����");
            System.out.println("�������� ��������: " + c.getFuelLevel() + " ������");
            System.out.println("������� ������: " + c.getMileage() + " ����");
        } else {
            System.out.println("�� ���� ����� (������� ����� � ���)");
        }

        double fuel = 0.5D;
        if (c.fueling(fuel)) {
            System.out.println("� ��� ������ " + fuel + " ������ �������");
        } else {
            System.out.println("�� ������� ������ � ��� " + fuel + " ������ �������");
        }

        System.out.println("������ � ����� ���: " + c.toString());

    }
}
