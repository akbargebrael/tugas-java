package Pertemuan_2;

import java.util.Scanner;

public class Soal_2 {

	public Soal_2() {
		// TODO Auto-generated constructor stub
	}  
	public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int bilangan;
        
        System.out.print("Masukan Bilangan = ");
        bilangan=scan.nextInt();
        
//        if (bilangan<0){
//	        System.out.println("bilangan " +bilangan+ " adalah bilangan negatif");
//
//	    }
//	    if (bilangan>0){
//	        System.out.println("bilangan " +bilangan+ " adalah bilangan positif");
//	    }
//	    if (bilangan==0){
//	        System.out.println("bilangan " +bilangan+ " adalah bukan positif atau negatif");
//	    }
        
        if (bilangan%2==0){
            System.out.println("Bilangan "+bilangan+" adalah bilangan genap");
        }else{
             System.out.println("Bilangan "+bilangan+" adalah bilangan ganjil");
        }
     }
}

	



