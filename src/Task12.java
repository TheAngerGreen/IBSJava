public class Task12 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        boolean containsJava = str.contains("Java");
        System.out.println("Содержит 'Java': " + containsJava);

        boolean startsWithILike = str.startsWith("I like");
        System.out.println("Начинается с 'I like': " + startsWithILike);

        boolean endsWithExclamations = str.endsWith("!!!");
        System.out.println("Заканчивается на '!!!': " + endsWithExclamations);

        if (containsJava && startsWithILike && endsWithExclamations) {
            System.out.println("Строка в верхнем регистре: " + str.toUpperCase());
        }

        String replacedString = str.replace('a', 'o');
        String substringJovo = replacedString.substring(replacedString.indexOf("Jovo"), replacedString.indexOf("Jovo") + 4);
        System.out.println("Подстрока 'Jovo': " + substringJovo);
    }
}
