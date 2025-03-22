import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i =0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;
        for (int i =0; i< numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int sum = numbers[0] + numbers[numbers.length / 2];
        System.out.println("Сумма первого и среднего элемента: " + sum);
    }
}

