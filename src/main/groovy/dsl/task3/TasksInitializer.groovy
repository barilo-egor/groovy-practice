package dsl.task3

class TasksInitializer {

	static def tasks(@DelegatesTo(TasksGraph) Closure closure) {
		def graph = new TasksGraph()
		graph.with closure
		return graph.tasks
	}
}
