package com.datastructures.examples.controllers

import com.datastructures.examples.models.ArrayRequest
import com.datastructures.examples.services.ArrayService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/arrays")
class ArrayController(private val arrayService: ArrayService) {

    @PostMapping("/process")
    fun processArray(@RequestBody request: ArrayRequest): ResponseEntity<Map<String, Any>> {
        val response = arrayService.proccessArray((request.numbers))
        return ResponseEntity.ok(response)
    }

    @PostMapping("/n_numbers")
    fun n_numbers_procesor(@RequestBody request: ArrayRequest): ResponseEntity<Map<String, Any>> {
        return ResponseEntity.ok(arrayService.n_random_numbers((request.numbers)))
    }


}

