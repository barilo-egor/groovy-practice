package lists

/**
 * Задача:
 * Удалите дубликаты из списка [1, 1, 2, 3, 3].
 * Используйте unique().
 */
class Task7 {

	static void main(String[] args) {
		def list = [1,1,2,3,3]
		def result = list.unique()
		println(result)
		assert result == [1,2,3]
	}
}
