package dsl.task5

class Builder {

	static def build(@DelegatesTo(BuildConfig) Closure closure) {
		def buildConfig = new BuildConfig()
		buildConfig.with closure
		return buildConfig
	}
}
