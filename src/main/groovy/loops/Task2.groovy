package loops

/**
 * Задача:
 * Посчитайте сумму всех элементов списка [10, 20, 30].
 * Используйте for-in без индексов.
 */
class Task2 {

	static void main(String[] args) {
		def sum = 0
		for (num in [10, 20, 30]) {
			sum += num
		}
		assert sum == 60
		println sum
	}
}
