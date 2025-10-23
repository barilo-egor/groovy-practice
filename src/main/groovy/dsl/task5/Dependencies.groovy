package dsl.task5

import groovy.transform.ToString

@ToString
class Dependencies {
	List<String> compiles = []
	List<String> tests = []

	def compile(String compile) {
		println("Adding new compile dependency \"$compile\"")
		compiles << compile
	}

	def test(String test) {
		println("Adding new test dependency \"$test\"")
		tests << test
	}
}
