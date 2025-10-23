package dsl.task5

import groovy.transform.ToString

@ToString
class Plugins {
	boolean java = false
	String springBoot

	def java() {
		java = true
		println("Adding java plugin")
	}

	def springBoot(String springBoot) {
		this.springBoot = springBoot
		println("Adding springBoot plugin with $springBoot version")
	}
}
