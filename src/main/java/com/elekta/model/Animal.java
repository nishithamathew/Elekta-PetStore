package com.elekta.model;

import com.elekta.enumclass.NumberOfLegs;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Abstract class animal in the pet store
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Animal {
    protected String ownerName;
    protected String petName;
    protected int age;
    protected NumberOfLegs numberOfLegs;

    /**
     * Display the details of animals
     */
    public void display() {
        System.out.print(this.getClass().getSimpleName() + "\t | " + ownerName + "\t | " + petName + "\t | " + age + "\t | " + numberOfLegs.getLegs());
    }

}
