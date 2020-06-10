package com.company;
import java.util.Comparator;

public class PriceComparator implements Comparator<Furniture> {

    public int compare(Furniture furn1, Furniture furn2) {

        return Float.compare(furn2.price, furn1.price);

    }

}
