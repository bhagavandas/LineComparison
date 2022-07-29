package lineComparison;

import java.util.Scanner;

public class LineComparisonProblem {
	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		UC1();
	}
	
	public static void UC1() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter x1 value: ");
		int x1=scan.nextInt();
		System.out.println("Enter x2 value: ");
		int x2=scan.nextInt();
		
		System.out.println("Enter y1 value: ");
		int y1=scan.nextInt();
		System.out.println("Enter y2 value: ");
		int y2=scan.nextInt();
		int r= ((int)Math.pow((x2-x1), 2)+(int)Math.pow((y2-y1), 2));
		double Length= Math.sqrt(r);
		System.out.println("Length of Line is: " + r);
		
	}
}
