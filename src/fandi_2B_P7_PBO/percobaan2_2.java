package fandi_2B_P7_PBO;

public class percobaan2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka = 10;
		try {
			System.out.println(angka/0);
		} catch(ArithmeticException obj) {
			System.out.println("Tidak boleh membagi bilangan dengan 0");
		}
	} 
}
