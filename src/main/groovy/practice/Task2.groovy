package practice

class Task2 {

	static void main(String[] args) {
		use (IntegerMethods) {
			println(3.cm + 1.m - 25.mm)
		}
	}

	@Category(Integer)
	static class IntegerMethods {
		def getMm() {
			return this
		}

		def getCm() {
			return this * 10
		}

		def getM() {
			return this * 1000
		}
	}
}
