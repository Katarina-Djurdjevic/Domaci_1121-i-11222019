package zadatak1;

import java.util.Scanner;

public class Zadatak_2_11222019 {

	/*
	 * Napisati program koji ucitava niz od n celih brojeva i dve metode.
	 *  Prva metoda vraca proizvod elemenata na neparnim pozicijama, 
	 *  a druga vraca zbir parnih elemenata niza.
	 */
	public static int proizvodNeparnih(int[] niz) {
		int proizvod = 1;
		for(int i=1;i<niz.length;i=i+2) {
			proizvod = proizvod * niz[i];
		}
		return proizvod;
	}
	public static int zbirParnih(int[] niz) {
		int zbir = 0;
		for(int i=0;i<niz.length;i=i+2) {
			zbir = zbir + niz[i];
		}
		return zbir;
	}
	
	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			System.out.print("Unesite duzinu niza: " );
			int n = sc.nextInt();
			if (n<0) {
				System.out.println("Molimo unesite pozitivan broj!");
			}
			else {
			int[] niz = new int[n];
			for(int i=0;i<niz.length;i++) {
				niz[i] = sc.nextInt();
			}
			System.out.println("Proizvod neparnih brojeva je: " + proizvodNeparnih(niz));
			System.out.println("Zbir parnih brojeva je: " + zbirParnih(niz));
		
		}

	}
}


