package dsl.task4

import groovy.transform.ToString

@ToString
class Logging {
	String level
	Map<String, String> appenders = [:]
	String format

	def level(String level) {
		this.level = level
	}

	void appender(String appender, String filePath) {
		appenders[appender] = filePath
	}

	void appender(String appender) {
		appenders[appender] = null
	}

	void format(String format) {
		this.format = format
	}
}
