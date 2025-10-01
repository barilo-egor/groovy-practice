package primitives

/**
 * Конвертер валют (с вводом данных)
 * Используйте System.console().readLine() для ввода данных от пользователя.
 * Запросите у пользователя сумму в рублях.
 * Запросите текущий курс доллара.
 * Рассчитайте эквивалентную сумму в долларах.
 * Выведите результат, округленный до двух знаков после запятой.
 */
class Task7 {

	static void main(String[] args) {
		def reader = new BufferedReader(new InputStreamReader(System.in))
		println "Введите сумму в рублях:"
		double rub = reader.readLine() as double
		println "Введите текущий курс:"
		double rubUsdCourse = reader.readLine() as double
		BigDecimal result = BigDecimal.valueOf(rub / rubUsdCourse).round(2)
		println "$rub рублей по курсу $rubUsdCourse равны $result долларам"
	}
}
