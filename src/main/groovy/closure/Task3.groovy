package closure

/**
 * Задача 3.
 * Написать функцию, которая принимает число и замыкание.
 * Функция должна возвращать результат применения замыкания к числу.
 *
 * Пример:
 * apply(5, { it * it }) → 25
 * apply(3, { it + 10 }) → 13
 */
class Task3 {

	static void main(String[] args) {
		def number = 6
		def result = apply(number, { it * it })
		assert result == 36
		println result
	}

	static def apply(int number, Closure closure) {
		return closure(number)
	}
}
