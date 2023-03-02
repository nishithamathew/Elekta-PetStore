package com.elekta;

import lombok.Data;

/**
 * Class for representing Birds in the pet store
 */
@Data
public class Bird extends Animal {
    /**
     * Constructor
     *
     * @param ownerName
     * @param petName
     * @param age
     */
    public Bird(String ownerName, String petName, int age) {
        super(ownerName, petName, age, NumberOfLegs.TWO);
    }
}
