import java.util.Scanner;

public class zd1 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("vvedite imya: ");
		String name = scanner.nextLine();

		System.out.println("hello, " + name + "!");

		scanner.close();
	}
}