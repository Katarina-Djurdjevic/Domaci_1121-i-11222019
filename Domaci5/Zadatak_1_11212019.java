package zadatak2;

import java.util.Scanner;

public class Zadatak_1_11212019 {
	/*
	 * Korisnik ucitava niz od N elemenata niza (koristiti posebnu metodu).
		Napisati zasebno 2 metode
		Prva metoda ispisuje elemente niza koji su deljivi sa 3
		Druga metoda ispisuje elemente niza koji su deljivi sa 5
	 */
	public static int[] nizMetoda() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite zeljenu duzinu niza: ");
		int n = sc.nextInt();
			
		int[] niz= new int[n];
		System.out.println("Uneiste elemente niza: ");
		for(int i=0;i<niz.length;i++) {
			niz[i] = sc.nextInt();
		}
		return niz;
	}
	
	
	public static void deljivoSaTri(int[] niz) {
		System.out.println("Brojevi deljivi sa tri su: ");
		for(int i=0;i<niz.length;i++) {
			if(niz[i]%3 == 0) {
				System.out.print(niz[i] + " ");
			}
		}
	}
	public static void deljivoSaPet(int[] niz) {
		System.out.println("Brojevi deljivi sa pet su: ");
		for(int i=0;i<niz.length;i++) {
			if(niz[i]%5 == 0) {
				System.out.print(niz[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] niz = nizMetoda();
		deljivoSaTri(niz);
		System.out.println();
		deljivoSaPet(niz);
		

	}

}
