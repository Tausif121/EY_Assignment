package work;
import java.util.HashMap;
import java.util.Map;

public class Mapprograms{
    public static void main(String[] args) {
        Map<String, Integer> calendar = new HashMap<>();
        calendar.put("January", 1);
        calendar.put("February", 2);
        calendar.put("March", 3);
        calendar.put("April", 4);
        calendar.put("May", 5);

        System.out.println("Key-value pairs are:");
        for (Map.Entry<String, Integer> entry : calendar.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        String keyUpdate = "April";
        int valueUpdate = 14; 
        calendar.put(keyUpdate, valueUpdate);
        
        System.out.println("\nAfter Update:");
        for (Map.Entry<String, Integer> entry : calendar.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}