package example.myapp

class Shark: AquariumFish(),FishAction , FishColor{
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}