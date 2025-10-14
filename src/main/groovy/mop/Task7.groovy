package mop

/**
 * Задача:
 * Реализуйте GroovyInterceptable класс Spy, который перехватывает все вызовы методов.
 */
class Task7 {

	static void main(String[] args) {
		def spy = new Spy()
		println(spy.getGreet())
		spy.unknown()
	}

	static class Spy implements GroovyInterceptable {
		def getGreet() {
			return "hello"
		}

		def invokeMethod(String name, args) {
			System.out.println("Called $name with $args")
		}
	}
}
