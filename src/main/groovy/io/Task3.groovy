package io

/**
 * Задача:
 * Создайте файл output.txt, запишите в него строку "Start\n",
 * затем добавьте "End\n" в конец файла.
 */
class Task3 {

	static void main(String[] args) {
		def file = new File("buffer/task3.txt")
		file << "Start\n"
		file << "End\n"
		println(file.text)
	}
}
