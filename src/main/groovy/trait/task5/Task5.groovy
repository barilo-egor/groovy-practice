package trait.task5

/**
 * Задача:
 * Модифицируйте предыдущий пример так,
 * чтобы метод B.hi() вызывал A.super.hi() после себя.
 */
class Task5 {
	static void main(String[] args) {
		def c = new C()
		c.hi()
	}
}
