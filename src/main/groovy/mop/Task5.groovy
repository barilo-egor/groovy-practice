package mop

/**
 * Задача:
 * Если обращаются к несуществующему свойству, возвращайте "N/A".
 */
class Task5 {

	static void main(String[] args) {
		def dog = new Dog()
		println(dog.someProp)
	}
}
