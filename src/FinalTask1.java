import java.util.Scanner;
import java.text.DecimalFormat;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Введите текущий курс доллара:");
        double exchangeRate = scanner.nextDouble();
        System.out.println("Введите количество рублей:");
        double rubles = scanner.nextDouble();

        double dollars = rubles / exchangeRate;

        String result = df.format(dollars);

        System.out.println("Итого: " + result + " долларов");

        scanner.close();
    }
}
