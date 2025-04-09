package com.datastructures.examples.services

import org.springframework.stereotype.Service
import kotlin.random.Random

@Service
class ArrayService {
    fun proccessArray(numbers: List<Int>) : Map<String, Any> {
        if (numbers.isEmpty()) {
            return mapOf("error" to "The array cannot be empty")
        }

        val sortedArray = numbers.sorted()
        val secondLargest = sortedArray.distinct().takeLast(2).firstOrNull() ?: "Not enough elements"

        val aleatoryNumber = Random.nextInt(1, numbers.size)

        val indexNumber = numbers.find { aleatoryNumber == it } ?: "It's not present the number $aleatoryNumber in the list"

        return mapOf(
            "originalArray" to numbers,
            "sortedArray" to sortedArray,
            "secondLargest" to secondLargest,
            "aleatory" to indexNumber
        )
    }

    fun n_random_numbers(numbers: List<Int>): Map<String, Any>{
        val mutableList: MutableList<Int> = numbers.toMutableList()
        val randomNumber = (1..20).random()

        var count = 1
        do {
            val nRandom = (1..20).random()
            mutableList.add(nRandom)
            count++
        } while (count <= randomNumber)

        return mapOf(
            "originalArray" to numbers,
            "Cantidad numeros" to randomNumber,
            "interted N random numbers" to mutableList.sorted()
        )
    }
}