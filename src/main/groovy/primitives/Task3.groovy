package primitives

/**
 * Напишите программу, которая объявляет переменную number и проверяет, является ли это число четным.
 * Результат проверки (true или false) сохраните в переменную isEven и выведите его.
 */
class Task3 {

	static void main(String[] args) {
		int number = 8
		def isEven = number % 2 == 0
		println "Число $number является ${isEven ? "четным" : "нечетным"}"
	}
}
