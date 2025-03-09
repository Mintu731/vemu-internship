package com.thread;

import java.util.*;

class HeroThread extends Thread {
    private String hero;
    private String[] movies;

    public HeroThread(String hero, String... movies) {
        this.hero = hero;
        this.movies = movies;
    }

    @Override
    public void run() {
        System.out.println("- - - Enter Your Hero : " + hero);
        for (String movie : movies) {
            System.out.println(hero + " " + movie);
        }
    }
}

public class MovieBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To MovieBuzz");
        
        System.out.print("Please Enter your hero : ");
        String hero = scanner.next();
        
        if (hero.equals("chiru")) {
            new HeroThread(hero, "chiru 1", "chiru 2").start();
        } else if (hero.equals("bala")) {
            new HeroThread(hero, "bala 1", "bala 2", "bala 3").start();
        } else {
            System.out.println("No movies found for hero: " + hero);
        }
        
        scanner.close();
    }
}
