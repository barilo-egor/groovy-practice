package dsl.task5

import groovy.transform.ToString

@ToString
class Repositories {
	boolean mavenCentral = false

	def mavenCentral() {
		mavenCentral = true
		println("Adding mavenCentral repository")
	}
}
