package zadatak1;

import java.util.Scanner;

public class Zadatak_1_11222019 {
	/*
	 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve metode(u mainu). 
	 * Prva metoda vraca proizvod unetih brojeva. Druga metoda ispisuje najmanji od unesenih brojeva.
	 */
	
	public static double proizvod(double a,double b,double c) {
		return  a * b * c;
	}
	public static double minimum(double a,double b,double c) {
		double min = a;
		if(b<min) {
			min = b;
		}
		if (c<min) {
			min=c;
		}
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Unesite prvi broj: ");
		double a = sc.nextDouble();
		System.out.print("Unesite drugi broj: ");
		double b = sc.nextDouble();
		System.out.print("Unesite treci broj: ");
		double c = sc.nextDouble();
		
		System.out.println("Proizvod brojeva je: " + proizvod(a,b,c));
		System.out.println("Najmanji od unetih brojeva je: " + minimum(a,b,c));
	

	}

}
