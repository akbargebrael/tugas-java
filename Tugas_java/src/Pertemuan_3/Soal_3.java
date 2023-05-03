package Pertemuan_3;
import java.util.*;
public class Soal_3 {

	public Soal_3() {
		// TODO Auto-generated constructor stub
	}
	
	 private static String kata[] = new String[1000];  
	 private static String newkata[] = new String[1000];  
	 
	 public static boolean cekKata(int n, String x)  
	 {  
	     boolean ketemu=false;  
	   
	     for (int i=0; i <n; i++)  
	     {  
	        if (kata[i].equalsIgnoreCase(x))  
	        {  
	           ketemu=true;  
	           break;  
	        }       
	     }  
	     return ketemu;  
	 }  
	  
	 public static void main (String args[])  
	 {     
	    int jumkata[] = new int[1000];  
	    int indeks[] = new int[1000];  
	   
	    String teks, temp="";  
	    boolean ketemu=false;  
	    int a, k, n, m, count=0, jum;  
	
	    System.out.print("Masukkan kalimat = ");  
	    Scanner obj = new Scanner(System.in);  
	    teks = obj.nextLine();  
	  
	    for (int i = 0; i<teks.length(); i++)  
	    {  
	       //jika ditemukan spasi  
	       if (teks.charAt(i)==' ')  
	       {  
	         count+=1;  
	         temp="";  
	       }  
	       else  
	       {  
	         temp = temp + teks.charAt(i);  
	         kata[count] = temp;  
	       }  
	   }  
	  
	   n=count+1;
	  
	   k=0; a=0;  
	   for (int i=0; i < n; i++)  
	   {  
	      if (!cekKata(a, kata[i]))  
	      { 
	           newkata[k] = kata[i];  
	           k++;  
	      }  
	      a++;  
	    }  
	    m=k;
	    
	    for (int i=0; i < m; i++)  
	    {  
	        jum=0;  
	        for (int j=0; j < n; j++)  
	        {  
	       if (newkata[i].equalsIgnoreCase(kata[j]))  
	          jum+=1;  
	        }  
	        System.out.println("kata = " + newkata[i] + " jumlahnya "+jum);  
	     }  
	     
	   }  
	}




