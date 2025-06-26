package net.klps

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LicenseApiApplication

fun main(args: Array<String>) {
    runApplication<LicenseApiApplication>(*args)
}
