package strings.singleQuoted

/**
 * Создайте две строки:

 В одинарных кавычках: 'Стоимость: $price'

 В двойных кавычках: "Стоимость: $price" (предположим, price = 100)

 Сравните их с помощью операторов == и .equals().
 */
class Task3 {

    static void main(String[] args) {
        def price = 100
        def singleQuotedStringWithPlaceHolder = 'Стоимость: $price'
        def singleQuotedStringWithoutPlaceHolder = 'Стоимость: 100'
        def doubleQuotedGString = "Стоимость: $price"
        def doubleQuotedString = "Стоимость: 100"
        assert singleQuotedStringWithPlaceHolder instanceof String
        assert singleQuotedStringWithoutPlaceHolder instanceof String
        assert doubleQuotedGString instanceof GString
        assert doubleQuotedString instanceof String

        assert singleQuotedStringWithPlaceHolder !== singleQuotedStringWithoutPlaceHolder
        assert singleQuotedStringWithPlaceHolder !== doubleQuotedGString
        assert singleQuotedStringWithPlaceHolder !== doubleQuotedString
        assert singleQuotedStringWithoutPlaceHolder !== doubleQuotedGString
        assert singleQuotedStringWithoutPlaceHolder === doubleQuotedString // String pool
        assert doubleQuotedGString !== doubleQuotedString

        assert singleQuotedStringWithPlaceHolder != doubleQuotedGString
        assert singleQuotedStringWithoutPlaceHolder == doubleQuotedGString
        assert doubleQuotedGString == doubleQuotedString

    }
}
