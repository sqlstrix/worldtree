package com.java.strix.example;

/**
 * 
 * @author Mikhail_Ivanov
 * Класс PC позволяет решать насущнейшую проблему - складывать числа a и b
 *
 */
public class PC {

	// Компоненты, входящие в состав PC
	private SystemUnit systemUnit;
	private Monitor monitor;
	private Keyboard keyboard;
	private Mouse mouse;

	/**
	 * Параметризованный конструктор, принимающий на вход компоненты PC
	 * 
	 * @param systemUnit - системный блок
	 * @param monitor - монитор
	 * @param keyboard - клавиатура
	 * @param mouse - мышь
	 */
	public PC(SystemUnit systemUnit, Monitor monitor, Keyboard keyboard,
			Mouse mouse) {
		this.systemUnit = systemUnit;
		this.monitor = monitor;
		this.keyboard = keyboard;
		this.mouse = mouse;
	}

	/**
	 * Метод класса PC, который суммирует числа и возвращает результат
	 * @param a - первое число
	 * @param b - второе число
	 * @return - их сумма
	 */
	public Integer sum(Integer a, Integer b) {
		// Если не инициализирован тот или иной компонент - выводим ошибку
		if (this.systemUnit == null) {
			throw new java.lang.IllegalStateException(
					"Да у компа нет системного блока, не трать зря время.");
		} else if (this.keyboard == null && this.mouse == null) {
			throw new java.lang.IllegalStateException(
					"Да у компа клавиатура не подключена, как ты числа вводить собираешь?");
		} else if (this.monitor == null) {
			throw new java.lang.IllegalStateException(
					"Да у компа монитора нет, как ты увидишь результат?");
		}
		return a + b;
	}

}
