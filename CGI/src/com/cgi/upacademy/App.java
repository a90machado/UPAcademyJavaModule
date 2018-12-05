package com.cgi.upacademy;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int max = 100; //default maximum
		ArrayList<String> toShow = new ArrayList<String>();
		System.out.println("Insert maximum value: ");
		try{
			max = scanner.nextInt();
			scanner.close();
		}catch (Exception e){
			System.out.println("Not a number! ERROR! Default maximum select 100!");
		}
		
		for (int i = 1; i <= max; i++) {
			if ((i%3==0)&&(i%5==0)){
				toShow.add("BigBang");
				
			} else if (i%5==0){
				toShow.add("Bang");
				
			} else if (i%3==0){
				toShow.add("Big");
				
			} else { toShow.add(i+""); }
		}
		System.out.println("Andre Machado");
		System.out.println();
		System.out.println(toShow.toString());

	}

}
