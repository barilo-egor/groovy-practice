package dsl.task3

import static dsl.task3.TasksInitializer.*
/**
 * Создайте DSL для определения зависимостей между задачами.
 * Задачи могут зависеть от других задач.
 */

def result = tasks {
	task "task1" dependsOn "123"
	task "task2" dependsOn "456"
	task "task3" dependsOn "789"
}
println(result)