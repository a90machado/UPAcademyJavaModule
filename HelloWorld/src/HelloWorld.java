import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int inputUser = scanner.nextInt();
		scanner.close();
		System.out.println(checkYear(inputUser));
	}
	
	private static boolean checkYear(int year){
		if (year%4==0 && year%100!=0 || year%400==0){
			return true;
		} else {return false;}
	}
}
