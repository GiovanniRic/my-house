package config

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class MyHouseApplication

fun main(args: Array<String>) {
    runApplication<MyHouseApplication>(*args)
}
