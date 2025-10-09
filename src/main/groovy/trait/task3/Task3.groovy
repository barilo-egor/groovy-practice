package trait.task3

/**
 * Задача:
 * Создайте trait Greeter с абстрактным методом getName()
 * и методом greet(), который печатает "Hello, <name>!".
 * Реализуйте этот trait в классе Person.
 */
class Task3 {
	static void main(String[] args) {
		def person = new Person()
		person.name = "Ivan"
		person.greet()
	}
}
