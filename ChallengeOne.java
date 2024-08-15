import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChallengeOne {
    public static List<Integer> processList(List<Integer> list, int S) {
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            StringBuilder filteredDigits = new StringBuilder();
            for (char c : String.valueOf(num).toCharArray()) {
                int digit = Character.getNumericValue(c);
                if (digit < S) {
                    filteredDigits.append(digit);
                }
            }
            if (filteredDigits.length() > 0) {
                result.add(Integer.parseInt(filteredDigits.toString()));
            }
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> numbers2 = List.of(10, 20, 30, 40);
        List<Integer> numbers3 = List.of(6);
        List<Integer> numbers4 = List.of(66);
        List<Integer> numbers5 = List.of(65);
        List<Integer> numbers6 = List.of(6, 2, 1);
        List<Integer> numbers7 = List.of(60, 6, 5, 4, 3, 2, 7, 7, 29, 1);

        int S = 1;  // Valor obtenido del hash MD5
        System.out.println(processList(numbers1, S));
        System.out.println(processList(numbers2, S));
        System.out.println(processList(numbers3, S));
        System.out.println(processList(numbers4, S));
        System.out.println(processList(numbers5, S));
        System.out.println(processList(numbers6, S));
        System.out.println(processList(numbers7, S));
    }
}
