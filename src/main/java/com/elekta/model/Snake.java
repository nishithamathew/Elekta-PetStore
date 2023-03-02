package com.elekta.model;

import com.elekta.enumclass.NumberOfLegs;
import com.elekta.model.Animal;
import lombok.Data;

/**
 * Class for representing Snakes in the pet store
 */
@Data
public class Snake extends Animal {
    /**
     * Constructor
     *
     * @param ownerName
     * @param petName
     * @param age
     */
    public Snake(String ownerName, String petName, int age) {
        super(ownerName, petName, age, NumberOfLegs.ZERO);
    }
}
