package Pertemuan_3;

import java.util.Scanner;

public class Soal_1 {

	public Soal_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n1,n2,n3;
		  
	    System.out.print("Bilangan : ");
	    n1 = scan.nextInt();
	    
	    System.out.println();
	    
	    for(n2=1; n2<=n1; n2++) {
	      for(n3=1; n3<=n1; n3++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    	}
		}
	}
