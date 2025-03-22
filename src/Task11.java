import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        String firstNumberStr = scanner.nextLine();

        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        int firstNumber = Integer.parseInt(firstNumberStr);

        int maxNumber = Math.max(firstNumber, secondNumber);
        int minNumber = Math.min(firstNumber, secondNumber);

        System.out.println("Большее число: " + maxNumber);

        double minNumberDouble = (double) minNumber;
        System.out.println("Меньшее число (double): " + minNumberDouble);

        scanner.close();
    }
}
