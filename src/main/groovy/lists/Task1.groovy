package lists

/**
 * Задача:
 * Создайте список из чисел [1, 2, 3].
 * Верните сумму первого и последнего элемента.
 */
class Task1 {

	static void main(String[] args) {
		def list = [1,2,3]
		def sum = list[0] + list[2]
		println sum
		assert sum == 4
		sum = list.first() + list.last()
		println sum
		assert sum == 4
		sum = list[-3] + list[-1]
		println sum
		assert sum == 4
	}
}
