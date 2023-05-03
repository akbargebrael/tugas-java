package Pertemuan_2;
import java.util.Scanner;

public class Soal_4 {

	public Soal_4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int nilai, A, B, C, D, E;
		
		System.out.println("NIlai Mahasiswa : ");
		nilai = scan.nextInt();
		System.out.println("Nilai ini mendapatkan "+ " " + nilai);
		
		if(nilai >= 80) {
			System.out.println("Grade A");
		} else if (nilai >= 80 ) {
			System.out.println("Grade B");
		} else if (nilai >= 65) {
			System.out.println("Grade C");
		} else if (nilai >= 50 ) {
			System.out.println("Grade D");
		} else if (nilai <= 41) {
			System.out.println("Grade E");
		}
		
		
	}

}
