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
					"�� � ����� ���������� � ����� �� ����������, ��� �� ����� ������� ���������?");
		} else if (this.monitor == null) {
			throw new java.lang.IllegalStateException(
					"�� � ����� �������� ���, ��� �� ������� ���������?");
		}
		return a + b;
	}
	
	public String getPCInfo() {
	    StringBuilder sb = new StringBuilder("\r\nPC Info: ");
	    if (this.systemUnit != null) {
	        sb.append("\r\n").append("System Unit - ").append(this.systemUnit.getName());
	    }
        if (this.monitor != null) {
            sb.append("\r\n").append("Monitor - ").append(this.monitor.getName());
        }
        if (this.keyboard != null) {
            sb.append("\r\n").append("Keyboard - ").append(this.keyboard.getName());
        }
        if (this.mouse != null) {
            sb.append("\r\n").append("Mouse - ").append(this.mouse.getName());
        }
        return sb.toString();
	}

}
