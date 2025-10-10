package io

/**
 * Задача:
 * Прочитайте файл input.txt построчно и выведите каждую строку в виде "Line: <строка>".
 */
class Task2 {

	static void main(String[] args) {
		def file = new File("buffer/task2.txt")
		file.text = "line1\nline2\nline3"

		file.eachLine {println(it)}
	}
}
