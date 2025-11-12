
import java.util.Scanner;


public class Program_3{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter the value of a: ");
        int a=scanner.nextInt();
        if(a%2==0){
            a=a-1;       
         }
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