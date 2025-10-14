package mop

/**
 * Задача:
 * Создайте Expando, добавьте ему свойство name и метод sayHello().
 */
class Task6 {

	static void main(String[] args) {
		def exp = new Expando()
		exp.name = "Ivan"
		exp.sayHello = {println("Hello!")}
		println(exp.name)
		exp.sayHello()
	}
}
