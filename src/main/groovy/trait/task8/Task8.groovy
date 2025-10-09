package trait.task8

/**
 * Задача:
 * Создайте trait Greeter с методом sayHi().
 * Добавьте этот trait к существующему объекту Dog во время выполнения.
 */
class Task8 {

	static void main(String[] args) {
		def person = new Person() as Greeter
		person.sayHi()
	}
}
