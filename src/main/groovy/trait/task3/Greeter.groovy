package trait.task3

trait Greeter {
	abstract String getName()

	void greet() {
		println("Hello $name")
	}
}