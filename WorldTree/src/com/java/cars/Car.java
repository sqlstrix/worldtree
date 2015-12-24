package com.java.cars;

public class Car {
	double fuelTank = 50; // объем бака
	double fuelLevel = 40; // уровень топлива
	double fuelRate = 50; // расход топлива
	double mileage = 0; // пробег

	public Boolean drive(Double distance) {
		if (fuelLevel >= fuelRate * distance) {
			fuelLevel = fuelLevel - fuelRate * distance;
			mileage = mileage + distance;
			return true;
		} else {
			return false;
		}
	}

	public Boolean fueling(Double fuel) {
		if (fuel <= fuelTank - fuelLevel) {
			return true;
		} else {
			return false;
		}
	}	
}