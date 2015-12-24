package com.java.cars;

public class Main {
	public static void main(String args[]) {
		Car c = new Car();
		boolean result = c.drive(0.5);	
		if (result) {
			System.out.println("Останется у тебя вот столько горючего: " + c.getFuelLevel());
			System.out.println("И увеличится пробег: " + c.getMileage());
		} else {
			System.out.println("не доедешь");
		}

		boolean result1 = c.fueling(0.5);
		if (result1) {
			System.out.println("Не залить ли в бак бензин: " + (c.getFuelTank() - c.getFuelLevel()));
		}
		
	}
}
