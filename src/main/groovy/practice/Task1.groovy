package practice

import mop.Car
import oop.Person

class Task1 {
	static void main(String[] args) {
		Class.metaClass.make = {
			println(it)
			delegate.metaClass.invokeConstructor(it)
		}

		def person = Person.make("Ivan", "Ivanov", 25)
		println(person)
	}
}
