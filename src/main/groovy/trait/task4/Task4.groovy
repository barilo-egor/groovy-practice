package trait.task4

/**
 * Задача:
 * Создайте два trait'а: A с методом hi() → "A",
 * и B с методом hi() → "B".
 * Реализуйте их в классе C и вызовите hi().
 */
class Task4 {
	static void main(String[] args) {
		def c = new C()
		c.hi()
	}
}
