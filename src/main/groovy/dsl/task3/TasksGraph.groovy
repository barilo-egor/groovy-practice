package dsl.task3

class TasksGraph {
	List<Task> tasks = []

	def task(String name) {
		Task task = new Task(name)
		tasks.add(task)
		return task
	}
}
