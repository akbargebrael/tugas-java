package Pertemuan_1;

import java.util.Scanner;

public class Soal_1 {

	public Soal_1() {
		// TODO Auto-generated constructor stub
	}
	 public static void main(String [] argh)
	    {
	        // Buat variabel perhitungan
	        float waktu;
	        int jarak, kecepatan, Waktu;
	        

	        // Input dari keyboard
	        Scanner scan = new Scanner(System.in);

	        System.out.print("Jarak : ");
	        jarak = scan.nextInt();

	        System.out.print("Kecepatan : ");
	        kecepatan = scan.nextInt();


	        // Hitung waktu yang dibutuhkan
	        waktu = (float)jarak / kecepatan;
	 

	        // Tampilkan hasil perhitungan
	        System.out.printf("waktu yang ditempuh : %,.2f", waktu);
	    }
	}


