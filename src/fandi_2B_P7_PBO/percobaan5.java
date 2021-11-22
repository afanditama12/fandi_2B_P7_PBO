package fandi_2B_P7_PBO;
import java.io.FileNotFoundException;
public class percobaan5 {
	
	public static void method1() throws FileNotFoundException {
		throw new FileNotFoundException("File tidak ada");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method1();
		} catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
	}
	

}
