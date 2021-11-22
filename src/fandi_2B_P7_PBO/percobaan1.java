package fandi_2B_P7_PBO;

public class percobaan1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		try {
			a[5] = 100;
		} catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println("Indeks array melebihi batas");
		}
	}

}
