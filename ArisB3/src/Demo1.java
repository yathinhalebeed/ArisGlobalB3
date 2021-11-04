import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Age:");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Major");
		}else {
			System.out.println("Minor");
		}

	}

}
