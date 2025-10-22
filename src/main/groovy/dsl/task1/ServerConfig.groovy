package dsl.task1

class ServerConfig {
	String name
	int port
	String environment
	List<String> hosts = []

	def name(String name) {
		this.name = name
	}

	def port(int port) {
		this.port = port
	}

	def environment(String environment) {
		this.environment = environment
	}

	def hosts(String... hosts) {
		this.hosts += hosts.toList()
	}
}
