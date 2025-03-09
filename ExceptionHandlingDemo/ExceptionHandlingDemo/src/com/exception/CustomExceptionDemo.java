package com.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class GreaterMarksException extends Exception {
    // Custom exception for marks greater than 100
}

public class CustomExceptionDemo {
    Student s1 = new Student(1001, "sai", 102);

    void result() {
        System.out.println(s1.getMarks());
        try {
            if (s1.getMarks() > 100) {
                throw new GreaterMarksException();
            }
        } catch (Exception e) {
            // Get current date and time
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String timestamp = now.format(formatter);

            // Log the exception to a file
            try (PrintWriter writer = new PrintWriter(new FileWriter("error.log", true))) {
                writer.println("[" + timestamp + "] Exception Occurred: " + e.toString());
                e.printStackTrace(writer);
                writer.println("-------------------------------------------------");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CustomExceptionDemo ce = new CustomExceptionDemo();
        ce.result();
    }
}
