package ifelse

/**
 * Задача:
 * Реализуйте метод, который возвращает имя пользователя.
 * Если имя = null или пустое, вернуть "Unknown".
 *
 * Подсказка: В Groovy есть оператор "?:" (Elvis),
 * который заменяет if-else.
 */
class Task2 {

	static void main(String[] args) {
		def person = new Person()
		assert "Unknown" == person.getUsername()
		person.username = ""
		assert "Unknown" == person.getUsername()
		person.username = "Nickname"
		assert "Nickname" == person.getUsername()
	}

	static class Person {
		String username

		String getUsername() {
			username ?: "Unknown"
		}
	}
}
