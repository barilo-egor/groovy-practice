package dsl.task1

class ServerConfigBuilder {

	static def serverConfig(@DelegatesTo(ServerConfig) Closure closure) {
		def serverConfig = new ServerConfig()
		serverConfig.with closure
	}
}
