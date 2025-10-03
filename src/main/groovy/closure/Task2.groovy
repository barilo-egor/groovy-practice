package closure

/**
 * Задача 2.
 * С помощью замыкания посчитать количество строк в списке, которые длиннее 3 символов.
 *
 * Пример:
 * Вход: ["cat", "dog", "elephant", "cow"]
 * Выход: 1 (только "elephant")
 */
class Task2 {

	static void main(String[] args) {
		def list = ["123", "1234", "321", "231", "4321", "222222"]
		def result = list.count { it.length() > 3 }
		assert result == 3
		println result
	}
}
