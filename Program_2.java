
import java.util.Scanner;


public class Program_2{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter the value of a: ");
        int a=scanner.nextInt();
        int count=0;
        for(int i=1; count<a; i+=2){
            System.out.print(i);
            count++;
            if(count< a){
                System.out.print(", ");
            }
           
        }
        scanner.close();
    }
}