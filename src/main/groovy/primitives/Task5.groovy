package primitives

/**
 * Сравнение чисел
 * Объявите три переменные x, y, z. Найдите максимальное и минимальное число среди них.
 * Результаты сохраните в переменные max и min и выведите их.
 */
class Task5 {

	static void main(String[] args) {
		def x = 456456
		def y = 568
		def z = 789789789
		def max = x
		if (y > max) {
			max = y
		}
		if (z > max) {
			max = z
		}
		def min = x
		if (y < min) {
			min = y
		}
		if (z < min) {
			min = z
		}
		println "Из чисел $x $y $z минимальным является $min, а максимальным $max"
	}
}
