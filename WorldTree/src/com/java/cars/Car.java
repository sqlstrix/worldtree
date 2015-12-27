package com.java.cars;

import com.java.cars.Wheel;

public class Car {
	private final double fuelTank = 50; // ����� ����
	private double fuelLevel = 50; // ������� �������
	private final double fuelRate = 5; // ������ �������
	private double mileage = 0; // ������
	private Object Wheels[] = new Wheel[] { new Wheel(), new Wheel(), new Wheel(), new Wheel() };

	public Boolean drive(Double distance, boolean air) {
		if (getFuelLevel() >= fuelRate * distance) {
			setFuelLevel(getFuelLevel() - fuelRate * distance);
			setMileage(getMileage() + distance);
			return true;
		} else if ((boolean) (Wheels[0] = false)) {
			return false;
		} else {
			return false;
		}
	}

	public Boolean fueling(Double fuel) {
		if (fuel <= getFuelTank() - getFuelLevel()) {
			return true;
		} else {
			return false;
		}
	}

	public double getFuelLevel() {
		return fuelLevel;
	}

	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}

	public double getFuelTank() {
		return fuelTank;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public Object[] getWheels() {
		return Wheels;
	}

	public void setWheels(Object wheels[]) {
		Wheels = wheels;
	}

}