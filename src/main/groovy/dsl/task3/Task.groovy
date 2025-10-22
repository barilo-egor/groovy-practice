package dsl.task3

import groovy.transform.ToString

@ToString
class Task {
	String name
	String dependsOn

	Task(String name) {
		this.name = name
	}

	def dependsOn(String dependsOn) {
		this.dependsOn = dependsOn
	}
}
