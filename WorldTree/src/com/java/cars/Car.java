package com.java.cars;

public class Car {
	private final double fuelTank = 50; // ����� ����
	private double fuelLevel = 50; // ������� �������
	private final double fuelRate = 5; // ������ �������
	private double mileage = 0; // ������

	public Boolean drive(Double distance) {
		if (getFuelLevel() >= fuelRate * distance) {
			setFuelLevel(getFuelLevel() - fuelRate * distance);
			setMileage(getMileage() + distance);
			return true;
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
}