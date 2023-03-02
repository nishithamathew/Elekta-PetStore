package com.elekta.model;

import com.elekta.enumclass.NumberOfLegs;
import lombok.Data;

/**
 * Class for representing Cats in the pet store
 */
@Data
public class Cat extends Animal {
    private int numberOfLives;

    /**
     * Constructor
     *
     * @param ownerName
     * @param petName
     * @param age
     * @param numberOfLives
     */
    public Cat(String ownerName, String petName, int age, int numberOfLives) {
        super(ownerName, petName, age, NumberOfLegs.FOUR);
        this.numberOfLives = numberOfLives;
    }

    /**
     * Display the details with number of lives
     */
    @Override
    public void display() {
        super.display();
        System.out.print(" | " + numberOfLives);
    }
}
