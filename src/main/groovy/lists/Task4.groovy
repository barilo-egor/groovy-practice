package lists

/**
 * Задача:
 * Из списка [1, 2, 3, 4, 5] оставьте только чётные числа.
 * Используйте findAll().
 */
class Task4 {

	static void main(String[] args) {
		def list = [1,2,3,4,5]
		def result = list.findAll {it % 2 == 0}
		println result
		assert result == [2,4]
	}
}
