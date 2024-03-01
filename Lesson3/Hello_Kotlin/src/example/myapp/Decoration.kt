package example.myapp

//data class Decoration(val rocks: String) {
//}

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF);
}

class Choice {
    companion object {
        var name: String = "lyric"
        fun showDescription(name:String) = println("My favorite $name")
    }
}

fun main() {
//    val equipment = "fish net" to "catching fish"
//    println("${equipment.first} used for ${equipment.second}")

//    val numbers = Triple(6, 9, 42)
//    println(numbers.toString())
//    println(numbers.toList())

    val equipment2 = ("fish net" to "catching fish") to "equipment"
    println("${equipment2.first} is ${equipment2.second}\n")
    println("${equipment2.first.second}")

    val equipment = "fish net" to "catching fish"
    val (tool, use) = equipment
    println("$tool is used for $use")

    val numbers = Triple(6, 9, 42)
    val (n1, n2, n3) = numbers
    println("$n1 $n2 $n3")

    val list = listOf(1, 5, 3, 4)
    println(list.sum())

    val list2 = listOf("a", "bbb", "cc")
    println(list2.sumBy { it.length })

    println(Choice.name)
    Choice.showDescription("pick")
    Choice.showDescription("selection")
}