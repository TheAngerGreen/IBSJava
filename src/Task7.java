import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int X = 5;
        final int Y = 10;
        final int Z = 15;

        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        boolean found = false;
        for (int value : array) {
            if (value == X || value == Y || value == Z) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Данное значение отсутствует в константах");
        }

        scanner.close();
    }
}
