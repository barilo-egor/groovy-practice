package dsl.task4

class LoggingInitializer {

	static def logging(@DelegatesTo(Logging.class) Closure closure){
		def logging = new Logging()
		logging.with closure
		return logging
	}
}
