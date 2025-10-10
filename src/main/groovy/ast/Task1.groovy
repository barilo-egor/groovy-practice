package ast

import groovy.transform.ToString

/**
 * Задача:
 * Добавьте к классу Person аннотацию @ToString и выведите объект в консоль.
 */
class Task1 {

	static void main(String[] args) {
		def person = new Person()
		person.name = "Ivan"
		person.age = 15
		println(person)
	}

	@ToString
	static class Person {

		String name

		int age
	}
}
