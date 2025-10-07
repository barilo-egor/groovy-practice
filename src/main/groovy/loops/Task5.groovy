package loops

/**
 * Задача:
 * Используйте метод step() для суммирования чисел от 0 до 10 с шагом 2.
 */
class Task5 {

	static void main(String[] args) {
		def sum = 0
		0.step(11, 2, { sum += it})
		println sum
		assert sum == 30
	}
}
