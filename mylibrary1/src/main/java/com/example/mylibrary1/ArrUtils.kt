package com.example.mylibrary1

object ArrUtils {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sumByClass(a: Int, b: Int): Int {
        return ArrClass().sum(a, b)
    }
}