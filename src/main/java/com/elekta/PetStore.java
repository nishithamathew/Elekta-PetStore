package com.elekta;

import com.elekta.factory.AnimalFactory;
import com.elekta.model.Animal;
import com.elekta.model.Bird;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Class for displaying the animal details in the Pet Store
 */
public class PetStore {
    /**
     * Main method
     *
     * @param args
     */
    public static void main(String[] args) {
        PetStore petStore = new PetStore();
        petStore.addAnimalsIntoStore();
    }

    /**
     * Adding animals into the store
     */
    public void addAnimalsIntoStore() {
        AnimalFactory animalFactory = new AnimalFactory();
        List<Animal> animalList = new ArrayList<>();

        animalList.add(animalFactory.getAnimal("Dog", "John Smith", "Fido", 7));
        animalList.add(animalFactory.getAnimal("Cat", "John Doe", "Fluffy", 12));
        animalList.add(animalFactory.getAnimal("Bird", "Jane Doe", "Jonathon", 3));
        animalList.add(animalFactory.getAnimal("Snake", "Jack Sack", "Slitherer", 1));
        animalList.add(animalFactory.getAnimal("Dog", "Babu Duggan", "Richie", 14));
        animalList.add(animalFactory.getAnimal("Cat", "Cat Ross", "Rossie", 5));
        animalList.add(animalFactory.getAnimal("Bird", "Amar Nath", "Foofy", 4));
        animalList.add(animalFactory.getAnimal("Snake", "Yolk Shield", "Goofy", 6));

        operationsOnPetStore(animalList);
    }

    /**
     * Different operations in pet store
     *
     * @param animalList
     */
    public void operationsOnPetStore(List<Animal> animalList) {
        System.out.println("Displaying all Animals in the Pet Store \n");
        ;
        displayAllAnimals(animalList);

        System.out.println("Displaying all Animals Sort By Owner Name \n ");
        sortByOwnerName(animalList);

        System.out.println("Displaying all Birds in the Pet Store \n ");
        showBirds(animalList);

        System.out.println("Displaying all Animals in the Pet Store whose age 5 or more \n ");
        showAnimalsAgeAboveFive(animalList);
    }

    /**
     * Display all the animals in the pet store
     *
     * @param animalList
     */
    public void displayAllAnimals(List<Animal> animalList) {
        displayTableHeader();
        animalList.forEach(animal -> {
            animal.display();
            System.out.println();
        });
        System.out.println("\n");
    }

    /**
     * Sort Animals by Owner name in the pet store
     *
     * @param animalList
     */
    public void sortByOwnerName(List<Animal> animalList) {
        displayTableHeader();
        animalList.stream().sorted(Comparator.comparing(Animal::getOwnerName)).forEach(animal -> {
            animal.display();
            System.out.println();
        });
        System.out.println("\n");
    }

    /**
     * Display the Birds in the pet store
     *
     * @param animalList
     */
    public void showBirds(List<Animal> animalList) {
        displayTableHeader();
        animalList.stream().filter(animal -> animal instanceof Bird).forEach(animal -> {
            animal.display();
            System.out.println();
        });
        System.out.println("\n");
    }

    /**
     * Display Animals whose age 5 year or above
     *
     * @param animalList
     */
    public void showAnimalsAgeAboveFive(List<Animal> animalList) {
        displayTableHeader();
        animalList.stream().filter(animal -> animal.getAge() >= 5).forEach(animal -> {
            animal.display();
            System.out.println();
        });
        System.out.println("\n");
    }

    /**
     * Display the table header
     */
    public void displayTableHeader() {
        System.out.println("Animal \t | Owner Name \t | Pet Name \t | Age \t | Number Of Legs \t | Number Of Lives \n ----------------------------------------------------------------------------------------");
    }
}
