package strings

/**
 * Объединить две строки через GString
 */
class Task5 {

	static void main(String[] args) {
		def str1 = "part1"
		def str2 = "part2"
		assert "part1part2" == "$str1$str2"
	}
}
