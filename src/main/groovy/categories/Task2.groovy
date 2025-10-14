package categories

/**
 * Создать категорию ListCategory с методами:
 * - second(): Object - возвращает второй элемент списка
 * - penultimate(): Object - возвращает предпоследний элемент
 */
class Task2 {

	static void main(String[] args) {
		def list = [0,1,2,3,4,5,6,7]
		use(ListCategory) {
			println(list.second())
			println(list.penultimate())
		}
	}

	@Category(List.class)
	static class ListCategory {

		def second() {
			return this.get(1)
		}

		def penultimate() {
			return this.get(this.size() - 2)
		}
	}
}
