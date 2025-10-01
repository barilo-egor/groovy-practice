package primitives

/**
 * Напишите программу, которая рассчитывает итоговую стоимость товара с учетом скидки.
 * Объявите переменные price (начальная цена) и discount (процент скидки, например, 15).
 * Рассчитайте сумму скидки (discountAmount).
 * Рассчитайте итоговую цену (finalPrice).
 * Выведите все этапы расчета в виде: "Цена: 100 руб, Скидка: 15%, Сумма скидки: 15 руб, Итог: 85 руб."
 */
class Task6 {

	static void main(String[] args) {
		def price = 2000
		def discount = 20
		def discountAmount = price * (discount / 100)
		def finalPrice = price - discountAmount
		println "Цена: $price, Скидка: $discount%, Сумма скидки: $discountAmount, Итог: $finalPrice"
	}
}
