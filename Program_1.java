
import java.util.Scanner;

public class Program_1 {

    public static  void  main(String args[]){
       Scanner scanner = new Scanner(System.in);

      System.out.print("Enter value of a: ");
       double a=scanner.nextDouble();
      System.out.print("Enter value of a: ");
       double b=scanner.nextDouble();
       scanner.nextLine(); // Consume newline
      System.out.print("Enter operation (Addition, Substraction, Multiplication, Division): ");
       String op = scanner.nextLine();
       double result=0.0;
         switch(op){
              case "Addition":
                result=a+b;
                break;
              case "Substraction":
                result=a-b;
                break;
              case "Multiplication":
                result=a*b;
                break;
              case "Division":
                if(b!=0){
                     result=a/b;
                } else {
                     System.out.println("Cannot divide by zero");
                }
                break;
              default:
                System.out.println("Invalid operation");
         }
         System.out.println("Result: " + result);
         scanner.close();

    }
}