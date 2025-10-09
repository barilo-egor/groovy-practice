package trait.task6

/**
 * Задача:
 * Создайте trait MathTools с константой PI = 3.14
 * и методом circleArea(r), возвращающим площадь круга.
 */
class Task6 {

	static void main(String[] args) {
		def circle = new Circle()
		println(circle.circleArea(5))
	}
}
