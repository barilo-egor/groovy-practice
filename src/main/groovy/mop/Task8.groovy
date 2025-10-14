package mop

/**
 * Задача:
 * Сделайте, чтобы операция + у Integer выполняла умножение.
 */
class Task8 {

	static void main(String[] args) {
		Integer.metaClass.plus = {n -> delegate - n}
		println(10 + 20)
	}
}
