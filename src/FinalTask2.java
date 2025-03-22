import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите уравнение:");
        String equation = scanner.nextLine();

        if (equation.length() != 5) {
            System.out.println("Уравнение должно содержать 5 символов");
            return;
        }

        char first = equation.charAt(0);
        char operator = equation.charAt(1);
        char second = equation.charAt(2);
        char equals = equation.charAt(3);
        char third = equation.charAt(4);

        if (operator != '+' && operator != '-') {
            System.out.println("Некорректный оператор. Используйте '+' или '-'");
            return;
        }

        if (equals != '=') {
            System.out.println("Уравнение должно содержать символ '=' на четвертой позиции");
            return;
        }

        int a = 0, b = 0, c = 0;
        boolean foundX = false;

        if (first == 'x') {
            foundX = true;
            b = Character.getNumericValue(second);
            c = Character.getNumericValue(third);
        } else if (second == 'x') {
            foundX = true;
            a = Character.getNumericValue(first);
            c = Character.getNumericValue(third);
        } else if (third == 'x') {
            foundX = true;
            a = Character.getNumericValue(first);
            b = Character.getNumericValue(second);
        }

        if (!foundX) {
            System.out.println("Уравнение должно содержать неизвестную x");
            return;
        }

        int result = 0;

        if (first == 'x') {
            if (operator == '+') {
                result = c - b;
            } else if (operator == '-') {
                result = c + b;
            }
        } else if (second == 'x') {
            if (operator == '+') {
                result = c - a;
            } else if (operator == '-') {
                result = a - c;
            }
        } else if (third == 'x') {
            if (operator == '+') {
                result = a + b;
            } else if (operator == '-') {
                result = a - b;
            }
        }

        System.out.println("Решение: x = " + result);

        scanner.close();
    }
}
