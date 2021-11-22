package fandi_2B_P7_PBO;

public class percobaan3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka = 15;
		try {
			System.out.println(angka/0);
		} catch(ArithmeticException e) {
			System.out.println("Terjadi exception kerena tidak boleh " + "membagi bilangan dengan 0");
		} catch(Exception e) {
			System.out.println("Terdapat error");
		}
	}

}
