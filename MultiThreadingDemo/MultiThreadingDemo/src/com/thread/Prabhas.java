package com.thread;

public class Prabhas extends Thread {
    public void run() {
        String[] movies = {
            "Varsham", "Chatrapathi", "Billa", "Darling", "Mr. Perfect", "Mirchi",
            "Baahubali: The Beginning", "Baahubali: The Conclusion", "Saaho", "Radhe Shyam",
            "Adipurush", "Salaar", "Rebel", "Raghavendra", "Ek Niranjan",
            "Yogi", "Pournami", "Munna", "Bujjigadu", "The Return of Rebel"
        };

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Prabhas Movie " + (i + 1) + ": " + movies[i]);
        }
    }
}
