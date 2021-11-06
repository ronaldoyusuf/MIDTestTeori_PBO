import java.util.Scanner;
public class MidTest_teori {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		String nama;
		char huruf;
		int tugas1, tugas2, tugas3, mid, uas, ratatugas, nilaiakhir;
		
		System.out.print("Masukkan nama : ");
		nama = input.nextLine();
		System.out.print("Masukkan nilai tugas 1 : ");
		tugas1 = input.nextInt();
		System.out.print("Masukkan nilai tugas 2 : ");
		tugas2 = input.nextInt();
		System.out.print("Masukkan nilai tugas 3 : ");
		tugas3 = input.nextInt();
		System.out.print("Masukkan nilai MID : ");
		mid = input.nextInt();
		System.out.print("Masukkan nilai Final : ");
		uas = input.nextInt();
		
		ratatugas = (tugas1 + tugas2 + tugas3)/3;
		nilaiakhir = (ratatugas*30/100) + (mid*30/100) + (uas*40/100);
		
		if (nilaiakhir >=80 && nilaiakhir <=100){
			huruf ='A';
		} else if (nilaiakhir >=60 && nilaiakhir <=79) {
			huruf ='B';
		} else if (nilaiakhir >=50 && nilaiakhir <=59) {
			huruf ='C';
		} else if (nilaiakhir >=40 && nilaiakhir <=49) {
			huruf ='D';
		} else{
			huruf ='E';
		}
		
		System.out.println("Nama : " +nama);
		System.out.println("Nilai Akhir : " +nilaiakhir);
		System.out.println("Nilai Huruf : " +huruf);
	}
}