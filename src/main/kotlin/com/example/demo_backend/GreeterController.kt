package com.example.demo_backend

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("greeter")
class GreeterController {
    @GetMapping("hello")
    fun hello(
        @RequestParam("name") name: String,
    ): HelloResponse = HelloResponse("Hello $name")

    @GetMapping("/hello/{name}")
    fun helloPathValue(
        @PathVariable("name") name: String,
    ): HelloResponse = HelloResponse("Hello $name")
}

data class HelloResponse(
    val message: String,
)
