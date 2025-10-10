package mop

/**
 * Задача:
 * Добавьте к объекту Person метод sayHi(), который печатает "Hi, <name>".
 */
class Task1 {
	static void main(String[] args) {
		def person = new Person()
		person.metaClass.sayHi = {println("Hi")}
		person.sayHi()
		def person2 = new Person()
		println(person2.sayHi()) // Exception
	}

	static class Person {
	}
}
