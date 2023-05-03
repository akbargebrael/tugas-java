package Pertemuan_4;

import java.sql.Date;

public class Pengunjung {

		private String nama;
		private int umur;
		private String number_ktp;
		private Date tanggalMasuk;

		public Pengunjung() {
		    	
	    }

		public Pengunjung(String nama, int umur, String number_ktp, Date tanggalMasuk) {
			super();
			this.nama = nama;
			this.umur = umur;
			this.number_ktp = number_ktp;
			this.tanggalMasuk = tanggalMasuk;
		}

		public String getNama() {
			return nama;
		}

		public void setNama(String nama) {
			this.nama = nama;
		}

		public int getUmur() {
			return umur;
		}

		public void setUmur(int umur) {
			this.umur = umur;
		}

		public String getNumber_ktp() {
			return number_ktp;
		}

		public void setNumber_ktp(String number_ktp) {
			this.number_ktp = number_ktp;
		}

		public Date getTanggalMasuk() {
			return tanggalMasuk;
		}

		public void setTanggalMasuk(Date tanggalMasuk) {
			this.tanggalMasuk = tanggalMasuk;
		}
}
