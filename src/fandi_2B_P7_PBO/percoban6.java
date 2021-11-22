package fandi_2B_P7_PBO;
import java.util.Scanner;
public class percoban6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Masukan angka : ");
			int num = sc.nextInt();
			if (num > 10)
				throw new Exception();
				System.out.println("Angka kurang dari atau sama dengan 10");
			} catch(Exception s) {
				System.out.println("Angka lebih dari 10");
				System.out.println("Selesai");
			}
		}
	}

