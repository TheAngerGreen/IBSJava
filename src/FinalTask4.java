import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctAnswer = "Заархивированный вирус";
        String hint = "Это что-то, что может быть на вашем компьютере и часто скрыто в файлах";

        int attempts = 3;
        boolean usedHint = false;

        while (attempts > 0) {
            System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
            System.out.println("У вас " + attempts + " попытки");

            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase("Подсказка")) {
                if (attempts == 3) {
                    System.out.println("Подсказка: " + hint);
                    usedHint = true;
                    attempts = 1;
                } else {
                    System.out.println("Подсказка уже недоступна");
                }
            } else if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Правильно!");
                break;
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println("Обидно, приходи в другой раз");
                } else {
                    System.out.println("Подумай еще!");
                }
            }
        }

        if (usedHint && attempts == 0) {
            System.out.println("Обидно, приходи в другой раз");
        }

        scanner.close();
    }
}
