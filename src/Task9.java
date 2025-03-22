import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        double[] array = new double[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / size;

        System.out.println("Массив, умноженный на среднее арифметическое (" + average + "):");
        for (double num : array) {
            System.out.println(num * average);
        }

        scanner.close();
    }
}
