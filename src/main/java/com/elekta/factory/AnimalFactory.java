package com.elekta.factory;

import com.elekta.model.*;

/**
 * Factory class for accessing the different animals in the pet store
 */
public class AnimalFactory {
    /**
     * return animals
     *
     * @param animalType
     * @param ownerName
     * @param petName
     * @param age
     * @return
     */
    public Animal getAnimal(String animalType, String ownerName, String petName, int age) {
        if (animalType == null) {
            return null;
        }
        if (animalType.equalsIgnoreCase("Dog")) {
            return new Dog(ownerName, petName, age);
        } else if (animalType.equalsIgnoreCase("Cat")) {
            int numberOfLives = (int) (Math.random() * 8) + 1;
            return new Cat(ownerName, petName, age, numberOfLives);
        } else if (animalType.equalsIgnoreCase("Bird")) {
            return new Bird(ownerName, petName, age);
        } else if (animalType.equalsIgnoreCase("Snake")) {
            return new Snake(ownerName, petName, age);
        }
        return null;
    }
}
