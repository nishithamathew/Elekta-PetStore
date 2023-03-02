package com.elekta;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum for representing Number Of Legs
 */
@AllArgsConstructor
@Getter
public enum NumberOfLegs {
    ZERO(0), TWO(2), FOUR(4);
    private final int legs;
}
