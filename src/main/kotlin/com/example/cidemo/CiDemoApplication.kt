package com.example.cidemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CiDemoApplication

fun main(args: Array<String>) {
    runApplication<CiDemoApplication>(*args)
}
