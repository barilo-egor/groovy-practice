package lists

/**
 * Задача:
 * Объедините два списка [1, 2] и [3, 4] в один.
 * Используйте оператор '+'.
 */
class Task3 {

	static void main(String[] args) {
		def list1 = [1,2]
		def list2 = ["123", "123"]
		def result = list1 + list2
		println result
		assert result == [1,2,3,4]
	}
}
