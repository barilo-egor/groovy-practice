package mop

import groovy.transform.TupleConstructor

/**
 * Задача:
 * Добавьте метод greet() ко всем объектам класса Car.
 */
class Task2 {

	static void main(String[] args) {
		def person1 = new Person("Ivan")
		Person.metaClass.greet = {println("Hi ")}
		def person2 = new Person("Petr")
		def person3 = new Person("Dima")

		person2.greet()
		person3.greet()
		person1.greet() // Exception
	}

	@TupleConstructor
	static class Person {
		String name
	}
}
