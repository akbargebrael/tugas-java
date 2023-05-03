package Pertemuan_4;

import java.sql.Date;

public class DataPengunjung {

	public DataPengunjung() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pengunjung DataPengunjung1 = new Pengunjung();
		Pengunjung DataPengunjung2 = new Pengunjung();
		Pengunjung DataPengunjung3 = new Pengunjung();
		
		
		DataPengunjung1.setNama("Gebran");
		DataPengunjung1.setUmur(21);
		DataPengunjung1.setNumber_ktp("31737072110011003");
		DataPengunjung1.setTanggalMasuk(new Date(0));
		
		System.out.println("Nama Pengunjung 1 : " + DataPengunjung1.getNama());
		System.out.println("Nomor Induk Kependudukan 1 : " + DataPengunjung1.getNumber_ktp());
		System.out.println("Umur Pengunjung 1 : " + DataPengunjung1.getUmur());
		System.out.println("Tanggal Login : " + DataPengunjung1.getTanggalMasuk());
		System.out.println();
		
		DataPengunjung2.setNama("Nauval");
		DataPengunjung2.setUmur(20);
		DataPengunjung2.setNumber_ktp("65113165521315163");
		DataPengunjung2.setTanggalMasuk(new Date(0));
		
		System.out.println("Nama Pengunjung 2 : " + DataPengunjung2.getNama());
		System.out.println("Umur Pengunjung 2 : " + DataPengunjung2.getUmur());
		System.out.println("Nomor Induk Kependudukan 2 : " + DataPengunjung2.getNumber_ktp());
		System.out.println("Tanggal Login : " + DataPengunjung2.getTanggalMasuk());
		System.out.println();
		
		DataPengunjung3.setNama("Rinov");
		DataPengunjung3.setUmur(25);
		DataPengunjung3.setNumber_ktp("15616166546351611");
		DataPengunjung3.setTanggalMasuk(new Date(0));

		System.out.println("Nama Pengunjung 3 : " + DataPengunjung3.getNama());
		System.out.println("Umur Pengunjung 3 : " + DataPengunjung3.getUmur());
		System.out.println("Nomor Induk Kependudukan 3 : " + DataPengunjung3.getNumber_ktp());
		System.out.println("Tanggal Login : " + DataPengunjung3.getTanggalMasuk());
		System.out.println();


	}

}
