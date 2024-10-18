import java.util.Scanner;

public class zd4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите час (от 0 до 23): ");
        int hour = scanner.nextInt();

        if (hour >= 0 && hour < 24) {
            if (hour >= 6 && hour < 10) {
                System.out.println("Это утро.");
            } else if (hour >= 10 && hour <= 18) {
                System.out.println("Это день.");
            } else if (hour > 18 && hour < 22) {
                System.out.println("Это вечер.");
            } else {
                System.out.println("Это ночь.");
            }
        } else {
            System.out.println("Ошибка: введите час от 0 до 23.");
        }

        scanner.close();
    }
}
