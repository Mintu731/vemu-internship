package com.thread;

public class Chiru extends Thread {
    public void run() {
        String[] movies = {
            "Khaidi", "Challenge", "Vijetha", "Pasivadi Pranam", "Rudraveena", "Yamudiki Mogudu",
            "Athaku Yamudu Ammayiki Mogudu", "Jagadeka Veerudu Athiloka Sundari", "Kodama Simham", "Rowdy Alludu",
            "Gang Leader", "Gharana Mogudu", "Mutamestri", "Hitler", "Bavagaru Bagunnara?",
            "Indra", "Tagore", "Shankar Dada MBBS", "Stalin", "Waltair Veerayya"
        };

        for (int i = 0; i < movies.length; i++) {
            System.out.println("Chiru Movie " + (i + 1) + ": " + movies[i]);
        }
    }

    public static void main(String[] args) {
        Chiru chiruThread = new Chiru();
        chiruThread.start();
    }
}
