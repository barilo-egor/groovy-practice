package dsl.task1

import static dsl.task1.ServerConfigBuilder.*

serverConfig {
	name "some server"
	port 8080
	environment "some env"
	hosts "1.2.3.4", "5.4.3.2:8081"
}
