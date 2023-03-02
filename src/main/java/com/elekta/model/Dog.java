package com.elekta.model;

import com.elekta.enumclass.NumberOfLegs;
import lombok.Data;

/**
 * Class for representing Dogs in the pet store
 */
@Data
public class Dog extends Animal {
    /**
     * Constructor
     *
     * @param ownerName
     * @param petName
     * @param age
     */
    public Dog(String ownerName, String petName, int age) {
        super(ownerName, petName, age, NumberOfLegs.FOUR);
    }
}