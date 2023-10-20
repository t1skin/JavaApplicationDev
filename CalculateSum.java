package Sample;

import java.util.Scanner;

public class CalculateSum {
	
	private int value1;
	private int value2;
	private String name;
	
	public void calcSum() {
		Scanner scanner = new Scanner(System.in);
		name = scanner.next();
		System.out.println("Enter the input: ");
		
		value1 = scanner.nextInt();
		value2 = scanner.nextInt();
		
		System.out.println(value1 + value2);
	}
}
