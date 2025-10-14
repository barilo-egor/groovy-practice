package categories

/**
 * Создать категорию StringCategory с методом:
 * - shout(): String - возвращает строку в верхнем регистре с '!'
 */
class Task1 {

	static void main(String[] args) {
		use(StringUtilsCategory) {
			println("sOME STRING".shout())
		}
	}

	@Category(String.class)
	static class StringUtilsCategory {

		def shout() {
			this.substring(0).toUpperCase() + this.substring(1) + "!"
		}
	}
}
