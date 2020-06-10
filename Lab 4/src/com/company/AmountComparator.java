package com.company;

import java.util.Comparator;

public class AmountComparator implements Comparator<Furniture> {

    public int compare(Furniture furn1, Furniture furn2) {

        return Float.compare(furn1.amount, furn2.amount);

    }

}