package com.datastructures.examples.models

data class ArrayResponse (
    val originalArray: List<Int>,
    val sortedArray: List<Int>,
    val secondLargest: Int
)