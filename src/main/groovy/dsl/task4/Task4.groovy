package dsl.task4

import static dsl.task4.LoggingInitializer.*

/**
 * Создайте DSL для настройки системы логирования.
 * Должны поддерживаться: уровень логирования, аппендеры, формат.
 */

def result = logging {
	level "INFO"
	appender "FILE", "/var/log/app.log"
	appender "CONSOLE"
	format "%d{yyyy-MM-dd} %m%n"
}
println(result)