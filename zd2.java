import java.util.Scanner; 

public class zd2 {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter trehznach chislo: ");
    int number = scanner.nextInt();
    
    if (number >= 100 && number <= 999) {
         int firstDigit = number / 100;
         int lastDigit = number % 10;
         
         if (firstDigit == lastDigit) {
             
             System.out.println("sim");
         } else {
             System.out.println("notsim");
         }
         
         
        
    } 
        scanner.close();
}

}