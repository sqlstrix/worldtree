package com.java.strix.example;

/**
 * 
 * @author Mikhail_Ivanov
 * ����� PC ��������� ������ ����������� �������� - ���������� ����� a � b
 *
 */
public class PC {

	// ����������, �������� � ������ PC
	private SystemUnit systemUnit;
	private Monitor monitor;
	private Keyboard keyboard;
	private Mouse mouse;

	/**
	 * ����������������� �����������, ����������� �� ���� ���������� PC
	 * 
	 * @param systemUnit - ��������� ����
	 * @param monitor - �������
	 * @param keyboard - ����������
	 * @param mouse - ����
	 */
	public PC(SystemUnit systemUnit, Monitor monitor, Keyboard keyboard,
			Mouse mouse) {
		this.systemUnit = systemUnit;
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	/**
	 * ����� ������ PC, ������� ��������� ����� � ���������� ���������
	 * @param a - ������ �����
	 * @param b - ������ �����
	 * @return - �� �����
	 */
	public Integer sum(Integer a, Integer b) {
		// ���� �� ��������������� ��� ��� ���� ��������� - ������� ������
		if (this.systemUnit == null) {
			throw new java.lang.IllegalStateException(
					"�� � ����� ��� ���������� �����, �� ����� ��� �����.");
		} else if (this.keyboard == null && this.mouse == null) {
			throw new java.lang.IllegalStateException(
					"�� � ����� ���������� �� ����������, ��� �� ����� ������� ���������?");
		} else if (this.monitor == null) {
			throw new java.lang.IllegalStateException(
					"�� � ����� �������� ���, ��� �� ������� ���������?");
		}
		return a + b;
	}

}
