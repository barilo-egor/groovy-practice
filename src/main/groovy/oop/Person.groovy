package oop

import groovy.transform.ToString
import groovy.transform.TupleConstructor

@ToString
@TupleConstructor
class Person implements Colorable {
	String firstName
	String lastName
	int age
}
