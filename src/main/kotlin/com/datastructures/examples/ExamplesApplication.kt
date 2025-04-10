package com.datastructures.examples

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication(exclude = [SecurityAutoConfiguration::class])
class ExamplesApplication

fun main(args: Array<String>) {
	runApplication<ExamplesApplication>(*args)
}
