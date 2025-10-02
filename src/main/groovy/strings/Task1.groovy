package strings

/**
 * Напиши метод, который принимает строку и возвращает её длину.
 * Убедись, что метод корректно работает даже если строка равна null.
 */
class Task1 {
	static void main(String[] args) {
		println getStringLength("")
		println getStringLength(null)
		println getStringLength("qwerty")
	}

	static int getStringLength(String str) {
		return str?.length() ?: 0
	}
}
