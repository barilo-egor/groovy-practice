package dsl.task2

class HtmlPage {
	Head head
	Body body

	def head(@DelegatesTo(Head) Closure closure) {
		this.head = new Head()
		head.with closure
	}

	def body(@DelegatesTo(Body) Closure closure) {
		this.body = new Body()
		body.with closure
	}

	static def html(@DelegatesTo(HtmlPage) Closure closure) {
		def html = new HtmlPage()
		html.with closure
	}
}
