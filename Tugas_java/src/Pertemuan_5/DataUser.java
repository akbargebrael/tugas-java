package Pertemuan_5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DataUser {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	User user1 = new User();
	User user2 = new User();
	
	user1.setUsername("Gebran Akbar");
	user1.setPassword("12345");
	
	String tanggalString = "May 02, 2022";
	DateFormat format = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
	Date givenDate = null;
	try {
		givenDate = format.parse(tanggalString);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("Tanggal yang diinput :" + tanggalString);
	System.out.println("Tanggal yang diterima oleh Java : " + givenDate);
	
	SimpleDateFormat DateFormat2 = new SimpleDateFormat ("dd-MM-yyyy");
	String tanggalFinal = DateFormat2.format(givenDate);
	System.out.println("Tanggal sesuai Format yang kita inginkan : ");
	
	user1.setCreatedDate(givenDate);
	
	System.out.println("Username object 1 : " + user1.getUsername());
	System.out.println("Password Object 1 : " + user1.getPassword());
	System.out.println("Created Date object 1 : " + tanggalFinal);

	}
}

