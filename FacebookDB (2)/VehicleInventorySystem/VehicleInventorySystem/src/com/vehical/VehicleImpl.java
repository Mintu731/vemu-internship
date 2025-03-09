package com.vehical;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class VehicleImpl implements IVehicle {
    private List<Vehicle> vehicleList;
    
    public VehicleImpl() {
        vehicleList = new LinkedList<>();
        vehicleList.add(new Vehicle("Toyota", 2019, 5000));
        vehicleList.add(new Vehicle("Suzuki", 2016, 3500));
        vehicleList.add(new Vehicle("Benz", 2021, 6000));
        vehicleList.add(new Vehicle("Kia", 2020, 4500));
    }
    
    public void displayVehicles() {
        System.out.println("List of Available Vehicles:");
        System.out.println("Brand\tYear\tPrice");
        for (Vehicle v : vehicleList) {
            System.out.println(v.getBrand() + "\t" + v.getYear() + "\t" + v.getPrice());
        }
    }
    
    public void sortBy(String criteria) {
        if (criteria.equalsIgnoreCase("mfgyear")) {
            Collections.sort(vehicleList, new SortByYear());
        } else if (criteria.equalsIgnoreCase("price")) {
            Collections.sort(vehicleList, new SortByPrice());
        }

        System.out.println("\nSorted Vehicles by " + criteria + ":");
        displayVehicles();
    }
}