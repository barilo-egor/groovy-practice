package dsl.task5

import groovy.transform.ToString

@ToString
class BuildConfig {
	Dependencies dependencies
	Plugins plugins
	Repositories repositories

	def dependencies(@DelegatesTo(Dependencies) Closure closure) {
		def dependencies = new Dependencies()
		dependencies.with closure
		this.dependencies = dependencies
	}

	def plugins(@DelegatesTo(Plugins) Closure closure) {
		def plugins = new Plugins()
		plugins.with closure
		this.plugins = plugins
	}

	def repositories(@DelegatesTo(Repositories) Closure closure) {
		def repositories = new Repositories()
		repositories.with closure
		this.repositories = repositories
	}
}
