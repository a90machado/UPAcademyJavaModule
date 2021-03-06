package io.altar.example;

import java.util.Scanner;

public class ScannerUtils {

	// Attributes:
	private Scanner scanner = new Scanner(System.in);
	
	// Get valid Int from Scanner
	public int getValidIntFromScanner (String mensage, int max){
		int result;
		do {
			result= getIntFromScanner(mensage);
			if (result > max) {
				System.out.println("Value must be under the " + max);
			}
		} while (result > max);
		return result;
	}
	
	public int getValidIntFromScanner (String mensage, int[] values){
		boolean validInt = false;
		int result;
		do{
			result = getIntFromScanner(mensage);
			for (int i : values) {
				if (i==result) {
					validInt = true;
				}
			}
			if (!validInt){
				String validString = "";
				for (int i : values) {
					validString += " " + i;
				}
				System.out.println("Must be one of this values: " + validString);
			}
		}while (!validInt);
		
		return result;
	}
	
	// Get INT from Scanner
	public int getIntFromScanner (String mensage, boolean isNull){
		String input;
		do{
			System.out.println(mensage);
			input = scanner.nextLine();
			if(isNull && input.equals("")){
				return -1;
			}
		} while (!isType(input, "Integer"));
		
		return Integer.parseInt(input);
	}
	
	public int getIntFromScanner (String mensage){
		return getIntFromScanner(mensage, false);
	}
	
	// Get FLOAT from Scanner
	public float getFloatFromScanner (String mensage){
		String input;
		do{
			System.out.println(mensage);
			input = scanner.nextLine();
		} while (!isType(input, "Float"));
		
		return Float.parseFloat(input);
	}
	
	private boolean isType (String input, String type){
		switch (type){
		case "Integer":
			try{
				Integer.parseInt(input);
				return true;
			}catch (NumberFormatException e){
				System.out.println("Wrong value, please repeat: ");
				return false;
			}
		case "Float":
			try{
				Float.parseFloat(input);
				return true;
			}catch (NumberFormatException e){
				System.out.println("Wrong value, please repeat: ");
				return false;
			}
		default:
			return false;
		}
	}
	
}
