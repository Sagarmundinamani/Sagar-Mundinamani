import java.util.LinkedHashMap;
import java.util.Map;

public class Program_4 {

    public static void main(String[] args) { 
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] divisors = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Map<Integer, Integer> counts = new LinkedHashMap<>();
        for (int divisor : divisors) {
            int count = 0;
            for (int number : input) {
                if (number % divisor == 0) {
                    count++;
                }
            }
            counts.put(divisor, count);
        }
        StringBuilder output = new StringBuilder("{");
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            
            output.append(entry.getKey());  
            output.append(": ");          
            output.append(entry.getValue()); 
            if (i < counts.size() - 1) {
                output.append(", ");
            }
            i++;
        }
        
        output.append("}"); // Close the string
        
        System.out.println(output.toString());
    }
}