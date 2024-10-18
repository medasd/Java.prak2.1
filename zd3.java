import java.util.Scanner; 

public class zd3 {
    public static void main(String[]args) {
        Scanner scanner = new
        Scanner(System.in);
        // proverka s klavy na celoe chislo 
        System.out.print("celoe chislo: ");
        
        int IntegerNumber = scanner.nextInt();
        // proverka na chetnost
        if (IntegerNumber % 2 == 0) {
            // esli chetnoe schityvaem drobnoe chislo
            System.out.print("vvedite drobnoe chislo: ");
            double decimalNumber = scanner.nextDouble();
            // vyvodim proizvedenie 2 chisel 
            double product = IntegerNumber * decimalNumber;
            
            System.out.println("proizvedenie chisel: " + product);
            
        } else {
            // esli chislo nechetnoe schityvaem drugoe celoe xhislo
            System.out.print("vvedite drugoe chislo: ");
            
            int anotherInteger = 
            scanner.nextInt();
            
            // vyvodim summu 2 chisle
            
            int sum = IntegerNumber + anotherInteger;
            System.out.println("summa chisel: " + sum);
            
        }
        scanner.close();
}
}