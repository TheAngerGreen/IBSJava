import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт");
            int unit = scanner.nextInt();
            System.out.println("Введите количество выбранных единиц:");
            double amount = scanner.nextDouble();

            if (unit == 1) {
                System.out.println("Килограммы: " + amount);
                System.out.println("Фунты: " + amount * 2.20462);
            } else if (unit == 2) {
                System.out.println("Фунты: " + amount);
                System.out.println("Килограммы: " + amount / 2.20462);
            } else {
                System.out.println("Неверный выбор единицы измерения");
            }
        } else if (choice == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int unit = scanner.nextInt();
            System.out.println("Введите количество выбранных единиц:");
            double amount = scanner.nextDouble();

            switch (unit) {
                case 1:
                    System.out.println("Метры: " + amount);
                    System.out.println("Мили: " + amount * 0.000621371);
                    System.out.println("Ярды: " + amount * 1.09361);
                    System.out.println("Футы: " + amount * 3.28084);
                    break;
                case 2:
                    System.out.println("Мили: " + amount);
                    System.out.println("Метры: " + amount / 0.000621371);
                    System.out.println("Ярды: " + amount * 1760);
                    System.out.println("Футы: " + amount * 5280);
                    break;
                case 3:
                    System.out.println("Ярды: " + amount);
                    System.out.println("Метры: " + amount / 1.09361);
                    System.out.println("Мили: " + amount * 0.000568182);
                    System.out.println("Футы: " + amount * 3);
                    break;
                case 4:
                    System.out.println("Футы: " + amount);
                    System.out.println("Метры: " + amount / 3.28084);
                    System.out.println("Мили: " + amount * 0.000189394);
                    System.out.println("Ярды: " + amount / 3);
                    break;
                default:
                    System.out.println("Неверный выбор единицы измерения");
                    break;
            }
        } else {
            System.out.println("Неверный выбор");
        }

        scanner.close();
    }
}

