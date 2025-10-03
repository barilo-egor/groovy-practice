package closure

/**
 * Задача 1.
 * Используя замыкание, отфильтровать список чисел и оставить только четные.
 *
 * Пример:
 * Вход: [1, 2, 3, 4, 5, 6]
 * Выход: [2, 4, 6]
 */
class Task1 {

	static void main(String[] args) {
		def input = [1, 2, 3, 4, 5, 6, 7, 8]
//		def result = input.stream()
//				.filter { it % 2 == 0 }
//				.collect()
		def result = input.findAll({ it % 2 == 0})
		assert result == [2,4,6,8]
		println result
	}
}
