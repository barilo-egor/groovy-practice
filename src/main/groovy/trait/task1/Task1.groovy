package trait.task1

/**
 * Задача:
 * Создайте trait Logger с методом log(String msg), который печатает "LOG: <msg>".
 * Создайте класс App, реализующий этот trait, и вызовите log().
 */
class Task1 {

	static void main(String[] args) {
		def app = new App()
		app.log("some message")
	}
}
