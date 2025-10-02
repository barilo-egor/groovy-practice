package strings

/**
 * Проверить, начинается ли строка с подстроки "Groovy"
 */
class Task4 {

	static void main(String[] args) {
		println startsWithGroovy(null)
		println startsWithGroovy("")
		println startsWithGroovy("qwertyGroovy")
		println startsWithGroovy("GroovyQwerty")
	}

	static boolean startsWithGroovy(String s) {
		return s?.startsWith("Groovy") ?: false
	}
}
