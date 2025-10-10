package ast

import groovy.transform.ToString
import groovy.transform.TupleConstructor

/**
 * Задача:
 * Добавьте к классу Point аннотацию @TupleConstructor и создайте объект через конструктор.
 */
class Task2 {

	static void main(String[] args) {
		def person1 = new PersonNameAge()
		def person2 = new PersonNameAge("Ivan")
		def person3 = new PersonNameAge("Ivan", 15)
		println(person1)
		println(person2)
		println(person3)

		def person4 = new PersonAgeName()
		def person5 = new PersonAgeName("Ivan")
		def person6 = new PersonAgeName("Ivan", 15)
		println(person4)
		println(person5)
		println(person6)
	}

	@TupleConstructor
	static class PersonNameAge {
		String name
		int age
	}

	@TupleConstructor
	static class PersonAgeName {
		int age
		String name
	}
}
