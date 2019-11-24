package zadatak2;

import java.util.Scanner;

public class Zadatak_2_11212019 {
	/*
	 * Korisnik ucitava niz od N elemenata niza, kao i neki broj K za deljivost. 
	 * Napisati metodu koja ispisuje elemente niza deljive brojem K.
	 */
	public static void deljivoSaK(int[] niz, int k) {
		System.out.println("Deljivi sa k su: " );
		for(int i=0;i<niz.length;i++) {
			if(niz[i] % k == 0) {
				System.out.print(" " +  niz[i]);
				
			}
		}
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite zeljenu duzinu niza: ");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Molimo unesite pozitivan broj!");
		}
		else {
		int[] niz = new int[n];
		for(int i=0;i<niz.length;i++) {
			System.out.println("Unesite elemente niza: ");
			niz[i] = sc.nextInt();
			
		}
		System.out.print("Unesite broj k: ");
		int k = sc.nextInt();
		if(k<0) {
			System.out.println("Molimo unesite pozitivan broj!");
		}
		else {
			deljivoSaK(niz,k);
		}
		}
		
	}

}
