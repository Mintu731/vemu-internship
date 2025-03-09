package com.vehical;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserImplementation userService = new UserImplementation();
        VehicleImpl vehicleService = new VehicleImpl(); 
        
        System.out.println("🚗 Welcome to AUTOSHOP WORLD!!! 🚗");
        System.out.println("Please signup with your details:");
        
        System.out.print("First Name: ");
        String firstName = sc.next();
        System.out.print("Last Name: ");
        String lastName = sc.next();
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
        
        userService.register(new User(firstName, lastName, username, password));
        
        System.out.println("\n🔑 Please sign in with your details:");
        System.out.print("Username: ");
        String loginUser = sc.next();
        System.out.print("Password: ");
        String loginPass = sc.next();
        
        if (userService.login(loginUser, loginPass)) {
            System.out.println("\n✅ Login successful!");
            vehicleService.displayVehicles();
            
            System.out.print("\nEnter sorting criteria (mfgyear/price): ");
            String criteria = sc.next();
            vehicleService.sortBy(criteria); // Make sure sortBy method exists in VehicalImplementation
        } else {
            System.out.println("❌ Login failed! Incorrect username or password.");
        }

        sc.close();
    }
}
