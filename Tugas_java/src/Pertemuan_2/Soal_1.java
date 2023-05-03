package Pertemuan_2;
import java.util.Scanner;

public class Soal_1 {

	public Soal_1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[]args)
	{
	    Scanner scan = new Scanner(System.in);

	    int bilangan;
	 
	    System.out.println("Masukkan bilangan : ");
	    bilangan=scan.nextInt();
	    
	    if (bilangan<0){
	        System.out.println("bilangan " +bilangan+ " adalah bilangan negatif");

	    }
	    if (bilangan>0){
	        System.out.println("bilangan " +bilangan+ " adalah bilangan positif");
	    }
	    if (bilangan==0){
	        System.out.println("bilangan " +bilangan+ " adalah bukan positif atau negatif");
	    }
	  }
}
		
