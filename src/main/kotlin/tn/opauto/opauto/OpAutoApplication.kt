package tn.opauto.opauto

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpAutoApplication

fun main(args: Array<String>) {
    runApplication<OpAutoApplication>(*args)
}
