package lists

/**
 * Задача:
 * Создайте список и добавьте туда элементы 1, 2, 3.
 * Удалите 2 и верните итоговый список.
 */
class Task2 {

	static void main(String[] args) {
		def list = []
		1.step(4, 1) {
			list += it
		}
		list -= 2
		println list
		assert list == [1,3]

		list = []
		list << 1
		list << 2
		list << 3
		list.remove(1)
		println list
		assert list == [1,3]

		list = []
		list.push(3)
		list.push(2)
		list.pop()
		list.push(1)
		println list
		assert list == [1,3]
	}
}
