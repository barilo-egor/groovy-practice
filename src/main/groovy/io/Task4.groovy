package io

/**
 * Задача:
 * Создайте файл log.txt и добавьте туда 3 строки с помощью withWriter().
 */
/**
 * Задача:
 * Используйте withReader, чтобы прочитать только первую строку файла.
 */
class Task4 {

	static void main(String[] args) {
		def file = new File("buffer/task4.txt")
		file.withWriter {
			it.writeLine("line 1")
			it.writeLine("line 2")
			it.writeLine("line 3")
		}
		file.withReader {
			println(it.readLine())
			println(it.readLine())
		}
	}
}
