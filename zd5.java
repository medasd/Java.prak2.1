import java.util.Scanner;

public class zd5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое положительное число: ");
        int x = scanner.nextInt();

        if (x <= 0) {
            System.out.println("Ошибка: введите положительное число.");
        } else {
            for (int i = -(x - 1); i < x; i++) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
