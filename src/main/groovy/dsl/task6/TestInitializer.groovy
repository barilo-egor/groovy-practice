package dsl.task6

class TestInitializer {

	static def given(Closure closure) {
		def valueHolder = [:]
		valueHolder.with closure
		["when": { Closure whenClosure -> {
			valueHolder.with whenClosure
			["then": { Closure thenClosure -> {
				valueHolder.with thenClosure
			}}]
		}}]
	}
}
