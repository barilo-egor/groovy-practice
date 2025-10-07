package lists

/**
 * Задача:
 * Верните true, если все числа в списке [2, 4, 6] чётные.
 * Используйте every().
 */
class Task6 {

	static void main(String[] args) {
		def list = [2, 4, 6]
		def result = list.every { it % 2 == 0 }
		println(result)
		assert result
	}
}
