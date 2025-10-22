package dsl.task2

class HtmlBuilder {
	def html(Closure closure) {
		println "<html>"
		closure.call()
		println "</html>"
	}

	def head(Closure closure) {
		println "<head>"
		closure.call()
		println "</head>"
	}

	def body(Closure closure) {
		println "<body>"
		closure.call()
		println "</body>"
	}

	def div(Closure closure) {
		println "<div>"
		closure.call()
		println "</div>"
	}

	def p(String text) {
		println "<p>$text</p>"
	}

	def title(String text) {
		println "<title>$text</title>"
	}
}
