package com.nyhouse

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class NyHouseApplication

fun main(args: Array<String>) {
    runApplication<NyHouseApplication>(*args)
}
