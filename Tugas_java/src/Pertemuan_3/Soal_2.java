package Pertemuan_3;
import java.util.Scanner;

public class Soal_2 {

	public Soal_2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {  
        try (Scanner scan = new Scanner(System.in)) {
			int fact = 1;  
			int i = 1;  
  
			 
			System.out.println("Bilangan : ");  
			int num = scan.nextInt();  
			do {  
			    fact = fact * i;   
			    i++;   
			} while( i <= num );  
  
    
			System.out.println("\nFactorial dari " + num + " yaitu " + fact);
		}  
    }  
}  


