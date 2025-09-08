package strings.singleQuoted

/**
 * Создайте две переменные: name = "Анна" и age = 30. Создайте простую строку (в одинарных кавычках),
 * которая будет содержать текст: 'Меня зовут $name, мне $age лет.'.
 * Выведите эту строку на экран.
 */
class Task1 {
    static void main(String[] args) {
        def name = 'Анна'
        def age = 30
        def result = 'Меня зовут ' + name + ', мне ' + age + ' лет'
        assert 'Меня зовут Анна, мне 30 лет' == result
        print result
    }
}
