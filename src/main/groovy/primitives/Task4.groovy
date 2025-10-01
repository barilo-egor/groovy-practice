package primitives

/**
 * Расчет площади и периметра
 * Объявите переменные length и width для прямоугольника.
 * Рассчитайте и выведите его площадь (length * width) и периметр (2 * (length + width)).
 */
class Task4 {

	static void main(String[] args) {
		def length = 20
		def width = 25
		def square = length * width
		def perimeter = 2 * (length + width)
		println "Для квадрата с длиной $length и шириной $width площадь равна $square, а периметр $perimeter"
	}
}
