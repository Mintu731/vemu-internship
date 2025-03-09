package com.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class ExceptionDemo {

	public static void main(String[] args) {
    int a = 10, b = 0;
    try {
    System.out.println("Division Value Is :" +(a/b));
    }
    catch(Exception e) {
    	FileOutputStream fos = null;
    	
    	try {
			 fos = new FileOutputStream("exceptioninfo.txt");
			 byte b1[] = e.toString().getBytes();
			 Date d = new Date();
			 byte b2[] = d.toString().getBytes();
			 fos.write(b1);
			 fos.write(b2);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	finally {
    		if(fos != null) {
    			try {
					fos.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		}
    	}
    	e.printStackTrace();
    	
    }
    System.out.println("Hi");
	}

}
