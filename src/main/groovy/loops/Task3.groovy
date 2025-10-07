package loops

/**
 * Задача:
 * Используя each, посчитайте сумму чисел в списке [1,2,3,4].
 */
class Task3 {

	static void main(String[] args) {
		def sum = 0
		[1,2,3,4,5].each { sum += it }
		assert sum == 15
		println sum
	}
}
