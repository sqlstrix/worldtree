package com.java.cars;

public class Main {
	public static void main(String args[]) {
		Car c = new Car();
		boolean result = c.drive(0.5);	
		if (result) {
			System.out.println("��������� � ���� ��� ������� ��������: " + c.getFuelLevel());
			System.out.println("� ���������� ������: " + c.getMileage());
		} else {
			System.out.println("�� �������");
		}

		boolean result1 = c.fueling(0.5);
		if (result1) {
			System.out.println("�� ������ �� � ��� ������: " + (c.getFuelTank() - c.getFuelLevel()));
		}
		
	}
}
