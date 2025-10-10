package mop

/**
 * Задача:
 * Если вызывается неизвестный метод, выведите сообщение "Метод <имя> не существует".
 */
class Task4 {

	static void main(String[] args) {
		def dog = new Dog()
		dog.bark(1,2,3)
	}
}
