package dsl.task5

import static dsl.task5.Builder.build

/**
 * Создайте DSL для настройки сборки проекта.
 * Должны поддерживаться: зависимости, плагины, репозитории.
 */

def result = build {
	dependencies {
		compile "org.springframework:spring-core:5.3.0"
		test "junit:junit:4.13"
	}
	plugins {
		java()
		springBoot "2.5.0"
	}
	repositories {
		mavenCentral()
	}
}
println(result)

