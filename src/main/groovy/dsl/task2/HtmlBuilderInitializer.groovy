package dsl.task2

class HtmlBuilderInitializer {
	static def html(@DelegatesTo(HtmlBuilder) Closure closure) {
		def builder = new HtmlBuilder()
		closure.delegate = builder
		closure()
	}
}
