package io.github.mikaojk


fun main() {

    val pi = 3.14

    var radius = 5.2

    fun circumference(radius: Double) = 2 * pi * radius

    val circumferenceOfSmallCircle = circumference(radius)

    radius = 6.7
    val circumferenceOfMediumCircle = circumference(radius)
    println("circumferenceOfMediumCircle: $circumferenceOfMediumCircle")

    radius = 10.0
    val circumferenceOfLargeCircle = circumference(radius)
    println("circumferenceOfLargeCircle: $circumferenceOfLargeCircle")

    println("circumferenceOfSmallCircle: $circumferenceOfSmallCircle")

    val text = "This is a string"

    println("text: $text")
    // https://typealias.com/start/kotlin-functions/
}