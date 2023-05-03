package Pertemuan_2;
import java.util.Scanner;

public class Soal_3 {

	public Soal_3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        
		 int[] arr = new int[100];
		    int arr_count, i, max_num;
		      
		    System.out.print("Input jumlah element array: ");
		    arr_count = scan.nextInt();
		      
		    System.out.println("Input "+arr_count+" angka (dipisah dengan enter):");
		      
		    // simpan setiap angka yang diinput ke dalam array
		    for(i = 0; i < arr_count; i++){
		      arr[i] = scan.nextInt();
		    }
		      
		    System.out.println();
		      
		    max_num = arr[0];
		    // proses mencari nilai terbesar
		    for(i = 0; i < arr_count; i++){
		      if(arr[i] > max_num){
		        max_num = arr[i];
		      }
		    }
		     
		    System.out.println("Angka terbesar adalah: " + max_num);
		      
		  }
		}
		
	


