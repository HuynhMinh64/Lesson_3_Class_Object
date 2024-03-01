package example.myapp

import kotlin.math.PI

open class Aquarium (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
//    var width: Int = 20
//    var height: Int = 40
//    var length: Int = 100
//    val volume: Int
//        get() = width * height * length / 1000

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"

    open var water: Double = 0.0
        get() = volume * 0.9

    init {
        println("aquarium initializing")
    }
    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")

//        println("Volume: $volume liters")
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1

        height = (tank / (length * width)).toInt()
    }



}

