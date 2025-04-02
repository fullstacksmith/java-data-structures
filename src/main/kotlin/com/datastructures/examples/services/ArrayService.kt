package com.datastructures.examples.services

import org.springframework.stereotype.Service

@Service
class ArrayService {
    fun proccessArray(numbers: List<Int>) : Map<String, Any> {
        if (numbers.isEmpty()) {
            return mapOf("error" to "The array cannot be empty")
        }

        val sortedArray = numbers.sorted()
        val secondLargest = sortedArray.distinct().takeLast(2).firstOrNull() ?: "Not enough elements"

        return mapOf(
            "originalArray" to numbers,
            "sortedArray" to sortedArray,
            "secondLargest" to secondLargest
        )
    }
}