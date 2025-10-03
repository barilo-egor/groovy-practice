package ifelse

import java.time.Period

/**
 * Задача:
 * Напишите метод, который принимает объект и возвращает строку:
 * - "EMPTY", если объект пустой (null, пустая строка, пустая коллекция или false)
 * - "NOT EMPTY", иначе.
 *
 * Подсказка: В Groovy if-условия работают не только с boolean,
 * но и с "truthy/falsy" значениями.
 */
class Task1 {

	static void main(String[] args) {
		assert isEmpty(null) == "EMPTY"
		assert isEmpty("") == "EMPTY"
		assert isEmpty([]) == "EMPTY"
		assert isEmpty(0) == "EMPTY"
		assert isEmpty(false) == "EMPTY"
		assert isEmpty(new Object()) == "NOT EMPTY"
		assert isEmpty([1,2,3]) == "NOT EMPTY"
		assert isEmpty("str") == "NOT EMPTY"
		Person person = new Person()
		person.age = 19
		assert isEmpty(person) == "NOT EMPTY"
		person.age = 5
		assert isEmpty(person) == "EMPTY"
	}

	static String isEmpty(obj) {
		if (obj) {
			return "NOT EMPTY"
		} else {
			return "EMPTY"
		}
	}

	static class Person {
		int age;

		boolean asBoolean() {
			return age >= 18
		}

	}
}
