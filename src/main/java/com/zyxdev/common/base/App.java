package com.zyxdev.common.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(App.class, args);
    }
   
    public void printHello() {
		// TODO Auto-generated method stub

    	System.out.println("good night");
	}
}
