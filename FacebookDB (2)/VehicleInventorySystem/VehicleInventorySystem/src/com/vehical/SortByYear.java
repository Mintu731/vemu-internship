package com.vehical;

import java.util.Comparator;

class SortByYear implements Comparator<Vehicle> {
    public int compare(Vehicle v1, Vehicle v2) {
        return Integer.compare(v1.getYear(), v2.getYear());
    }
}