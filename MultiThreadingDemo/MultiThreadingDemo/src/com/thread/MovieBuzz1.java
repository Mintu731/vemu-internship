package com.thread;

import java.util.Scanner;
public class MovieBuzz1 extends Thread {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Chiru c = new Chiru();
        Balayya b = new Balayya();
        Prabhas p = new Prabhas();

        System.out.println("Enter movie name");
        String op = sc.next();
        
        if (op.equalsIgnoreCase("chiru")) {
            c.start();
        } else if (op.equalsIgnoreCase("balayya")) {
            b.start();
        } else if (op.equalsIgnoreCase("prabhas")) {
            p.start();
        } else {
            c.start();
            b.start();
            p.start();
        }
    }
}
