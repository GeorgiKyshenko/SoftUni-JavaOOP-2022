package _05_Polymorphism._03_WildFarm_excs.Animals;

import _05_Polymorphism._03_WildFarm_excs.Food;
import _05_Polymorphism._03_WildFarm_excs.Foods.Vegetable;
import _05_Polymorphism._03_WildFarm_excs.Mammal;

public class Mouse extends Mammal {

    public Mouse(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, "Mouse", animalWeight, livingRegion);
    }

    @Override
    protected void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    protected void eat(Food foodType) {
        if (foodType instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + foodType.getQuantity());
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
