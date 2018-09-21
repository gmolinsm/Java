package ITExercises;

import java.util.Scanner;

public class PowerSum {
	
	public static void main(String[] args) {
		int base;
		int exp;
		int sum;
		int baseActual;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter base: ");
		base = Integer.parseInt(scan.nextLine());
		System.out.println("Please enter exponent: ");
		exp = Integer.parseInt(scan.nextLine());
		
		baseActual = base;
		
		for(int i=0; i<(exp-1); i++) {
			sum = 0;
			for(int j=0; j<base; j++) {
				sum += baseActual;
			}
			System.out.println("Iteration " +(i+1) +" gave a sum equal to " +sum);
			baseActual = sum;
		}
		
		System.out.println(base +" to the power of " 
		+exp +" is equal to " +baseActual);
		scan.close();
	}
 
}
