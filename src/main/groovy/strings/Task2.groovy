package strings

/**
 * Напиши метод, который проверяет, начинается ли строка с заглавной буквы.
 * Если строка пустая или null — верни false.
 */
class Task2 {

	static void main(String[] args) {
		println isFirstLetterInUpperCase("")
		println isFirstLetterInUpperCase(null)
		println isFirstLetterInUpperCase("asd")
		println isFirstLetterInUpperCase("Asd")
	}

	static boolean isFirstLetterInUpperCase(String str) {
		return str ? (str[0] in 'A'..'Z') : false
	}
}
