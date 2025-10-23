package dsl.task6

import static dsl.task6.TestInitializer.given

given {
	a = 6
	b = 2
} when {
	result = a + b
} then {
	if (result == 7) {
		println("Test success.")
	} else {
		println("Test failed")
	}
}