package mop

class Dog {

	void methodMissing(String name, args) {
		println("Method $name with $args is missing")
	}

	def propertyMissing(String name) {
		return "N/A"
	}
}
