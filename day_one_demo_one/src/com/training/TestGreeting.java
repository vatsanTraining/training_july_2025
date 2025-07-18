package com.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TestGreeting {

	public static void main(String[] args) {
		
		Greeting grtObj = new Greeting();
		
		System.out.println(grtObj.getMessage());
		
		
        URL url;
		try {
			url = new URL("https://www.example.com");
			
	        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        String line;
	        while ((line = reader.readLine()) != null) {
	            System.out.println(line);
	        }
	        reader.close();

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Replace with your URL
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

				
	}
}
