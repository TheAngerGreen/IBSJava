import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк:");
        int n = scanner.nextInt();
        scanner.nextLine();

        String maxDistinctString = "";
        int maxDistinctCount = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Введите строку " + i + ":");
            String input = scanner.nextLine();

            Set<Character> uniqueChars = new HashSet<>();
            for (char ch : input.toCharArray()) {
                uniqueChars.add(ch);
            }

            if (uniqueChars.size() > maxDistinctCount) {
                maxDistinctCount = uniqueChars.size();
                maxDistinctString = input;
            }
        }

        System.out.println("Строка с максимальным количеством различных символов: " + maxDistinctString);

        scanner.close();
    }
}
