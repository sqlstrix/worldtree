package com.java.cars;

public class Car {

    private final double fuelTank; // ����� ����
    private final double fuelRate; // ������ �������
    private final Wheel wheels[];
    private double fuelLevel = 0; // ������� �������
    private double mileage = 0; // ������

    public Car() {
        fuelTank = 50D;
        fuelRate = 5D;
        wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }

    /**
     * ����� �������� ��������� ����
     * 
     * @return false - ���� ���� �� 1 ������ �������, true - ���� ��� ������
     */
    private boolean allWheelsInflated() {
        // TODO
        return false;
    }

    /**
     * ����� ��������� ���� �������� ������ ������ �� ��������� wheels
     */
    public void inflateWheels() {
        // TODO
    }

    public Boolean drive(Double distance) {
        if (fuelLevel >= fuelRate * distance && allWheelsInflated()) {
            fuelLevel -= fuelRate * distance;
            mileage += distance;
            return true;
        }
        return false;
    }

    public Boolean fueling(Double fuel) {
        if (getFuelTank() >= fuelLevel + fuel) {
            fuelLevel += fuel;
            return true;
        }
        return false;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getFuelTank() {
        return fuelTank;
    }

    public double getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car [fuelTank=" + fuelTank + ", fuelRate=" + fuelRate + ", fuelLevel=" + fuelLevel + ", mileage=" + mileage + "]";
    }

}