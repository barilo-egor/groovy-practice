package loops

/**
 * Задача:
 * Используйте метод times(), чтобы 5 раз вывести "Hi".
 * Верните количество итераций.
 */
class Task4 {

	static void main(String[] args) {
		def counter = 0
		5.times {
			println "Hi"
			counter++
		}
		assert counter == 5
	}
}
