def value = System.getenv("LESSON_ENV_VAR") ?: "default"
println "value: ${value}"
