import java.util.Random;

public class Task14 {
    public static void main(String[] args) {
        final int SIZE = 15;
        final int MIN = -20;
        final int MAX = 20;

        Random random = new Random();
        int[] array = new int[SIZE];

        for (int i = 0; i < SIZE; i++) {
            array[i] = random.nextInt((MAX - MIN) + 1) + MIN;
        }

        System.out.println("Элементы массива:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Минимальный элемент массива: " + min);

        int maxAbs = Math.abs(max) > Math.abs(min) ? max : min;

        System.out.println("Наибольшее по модулю значение: " + maxAbs);
    }
}
