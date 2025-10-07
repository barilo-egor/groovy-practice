package loops

/**
 * Задача:
 * Напишите метод, который возвращает сумму чисел от 1 до 5 включительно.
 *
 * Подсказка: в Groovy диапазоны (1..5) можно использовать прямо в for.
 */
class Task1 {

	static void main(String[] args) {
		def sum = 0
		for (i in 1..5) {
			sum += i
		}
		assert sum == 15
		println sum
		sum = 0
		for (i in 1..<6) {
			sum += i
		}
		assert sum == 15
		println sum
	}
}
