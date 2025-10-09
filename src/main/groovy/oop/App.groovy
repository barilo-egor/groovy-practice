package oop

class App {
	static void main(String[] args) {
		def person = new Person()
		person.firstName = "Petr"
		person.lastName = "Petrov"
		println(person)
		person['firstName'] = "Ivan"
		person['age'] = 15
		println(person)
		Person person1 = ['Dima', 'Dimov', 15]
		println(person1)

		person.color = "blue"
		println(person)
	}
}
