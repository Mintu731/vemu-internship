package com.vehical;

import java.util.Comparator;

class SortByPrice implements Comparator<Vehicle> {
    public int compare(Vehicle v1, Vehicle v2) {
        return Integer.compare(v1.getPrice(), v2.getPrice());
    }
}