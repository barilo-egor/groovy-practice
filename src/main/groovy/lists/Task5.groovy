package lists

/**
 * Задача:
 * Из списка [1, 2, 3] создайте новый, где все элементы умножены на 10.
 * Используйте collect().
 */
class Task5 {

	static void main(String[] args) {
		def list = [1,2,3]
		def result = list.collect { it * 10 }
		println result
		assert result == [10,20,30]
	}
}
