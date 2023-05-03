package Pertemuan_1;

import java.util.Scanner;

public class Soal_2 {

	public Soal_2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int tarif = 3000;
		int jam;
		int biaya;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lama Parkir (Jam) : ");
		jam = scan.nextInt();

		
		
		
		if (jam == 1 ) {
			System.out.printf("Biaya Parkir adalah %d", tarif);
		}
		else if (jam == 2) {
			System.out.printf("Biaya Parkir adalah %d", tarif);
		}
		else if(jam >= 3) { 
			biaya = tarif + (1000*(jam-2)); 
			System.out.printf("Biaya Parkir adalah %d", biaya);

		}
		

	}
	
}
