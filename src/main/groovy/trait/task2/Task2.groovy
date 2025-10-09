package trait.task2

/**
 * Задача:
 * Создайте trait Counter с полем count и методом inc(), увеличивающим count.
 * Создайте класс Clicker, реализующий Counter, и вызовите inc() трижды.
 */
class Task2 {

	static void main(String[] args) {
		def clicker = new Clicker()
		clicker.inc()
		clicker.inc()
		clicker.inc()
		println(clicker.count)
	}
}
