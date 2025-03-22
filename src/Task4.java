import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (x): ");
        int x = scanner.nextInt();
        System.out.println("Введите второе число (y): ");
        int y = scanner.nextInt();
        System.out.println("Введите третье число (z): ");
        int z = scanner.nextInt();

        double average = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое: " + average);

        double halfAverage = Math.floor(average / 2);
        System.out.println("Среднее арифметическое, разделённое на 2 и округлённое в меньшую сторону: " + halfAverage);

        if (halfAverage > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
