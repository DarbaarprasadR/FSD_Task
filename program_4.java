import java.util.LinkedHashMap;
import java.util.Map;

public class program_4{
    public static void main(String[] args) {
        int[] sampleNumbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        Map<Integer, Integer> divisorCountMap = new LinkedHashMap<>();
        for (int divisor = 1; divisor <= 9; divisor++) {
            divisorCountMap.put(divisor, 0);
        }

        for (int num : sampleNumbers) {
            for (int divisor : divisorCountMap.keySet()) {
                if (num % divisor == 0) {
                    divisorCountMap.put(divisor, divisorCountMap.get(divisor) + 1);
                }
            }
        }

        System.out.println("Divisibility results: " + divisorCountMap);
    }
}
