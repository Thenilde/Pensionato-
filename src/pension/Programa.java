package pension;

import java.util.Scanner;

import entites.Rent;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------Welcome to Borges Hostel-----------");
		System.out.println();
		System.out.print("How many rooms will rented?");
		int n = sc.nextInt();
		
		Rent[] vec = new Rent[10];	
		for (int i=1; i<=n; i++) {
			

		System.out.println();
		System.out.println("Rent #" + i + ":");
		System.out.print("The tenent name is:");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("The tenent email:");
		String email = sc.nextLine();

		System.out.print("Tenent room:");
		int room=sc.nextInt();
			
			vec[room]=new Rent(name,email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i=0; i<10; i++) {
		if (vec[i] != null) {
		System.out.println(i + ": " + vec[i]);
			}
		}

		sc.close();

	}

}
