package io

/**
 * Задача:
 * Создайте текстовый файл input.txt с текстом "Groovy I/O test".
 * Прочитайте его содержимое в строку и выведите в консоль.
 */
class Task1 {

	static void main(String[] args) {
		def file = new File("buffer/task1.txt")
		file.text = "Groovy I/O test"
		println(file.text)
	}
}
