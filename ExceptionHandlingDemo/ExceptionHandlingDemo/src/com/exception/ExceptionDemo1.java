package com.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionDemo1 {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("Simple.txt");

	}

}
