package example.myapp

class Plecostomus (fishColor: FishColor = AquariumFish.GoldColor):
    FishAction by AquariumFish.PrintingFishAction("eat algae"),
    FishColor by fishColor