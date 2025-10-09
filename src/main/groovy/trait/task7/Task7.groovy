package trait.task7

/**
 * Задача:
 * Создайте два trait'а:
 * - Singer с методом sing()
 * - Dancer с методом dance()
 * Создайте класс Artist, реализующий оба, и вызовите оба метода.
 */
class Task7 {

	static void main(String[] args) {
		def artist = new Artist()
		artist.dance()
		artist.sing()
	}
}
