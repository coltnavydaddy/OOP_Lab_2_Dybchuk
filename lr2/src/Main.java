import java.util.Scanner;


public class Main {
        private static boolean isEd (String input) {
            return input.endsWith("ed"); // метод endsWith перевіряює, чи закінчується стрінг на ed;
        }


        private static int DigitSum (String string) {
            int sum = 0;
            for (int i = 0; i < string.length(); i++) {
                    // рахуємо саме цифри (від 0 до 9)
                    if (string.charAt(i) <= '9' && string.charAt(i) >= '0') {
                        sum += string.charAt(i) - 48;
                    }
                }
            return sum;
        }

        private static int findBiggestBlock (String string) {
            char c = string.charAt(0); // знаходимо перший елемент і зберігаємо його у "c";
            int max = 0;
            int len = 1;
            for (int i = 1; i < string.length(); i++) {
                    if (string.charAt(i) == c) len++; // якщо-ітий елемент це "c" то збільшуємо змінну довжини,
                    else {
                        c = string.charAt(i); // в іншому випадку с = це інший ітий елемент,
                        len = 1; // і довжину знову робимо 1;
                    }
                // якщо довжина одних однакових елементів більша за ту, що була максимумом - переназначаємо змінні;
                    if (len > max) max = len;
                }
            return max;
            }

            public static void findWords(String string) {

            // ділимо стрінг "сплітом" через " " та зберігаємо у "words"
            String[] words = string.split(" ");
            System.out.println("Знайдені слова:");
            for (int i = 0; i < words.length; i++) {
                //виводимо слова поки вони є через Enter;
                System.out.println(words[i]);
                }
            }

        private static String getMixOfTwoStrings(String first, String second) {
            String shorter = first; // перший стрінг - коротший;
            boolean isLongerSecond = true;
            if (first.length() > second.length()) {
                shorter = second; // якщо другий стрінг коротше - то переназначаємо змінну;
                isLongerSecond = false;
            }
            StringBuilder builder = new StringBuilder(); // створюємо клас білдер для праці з символами;
            int i;
            // поки є елементи у меншої строки,
            for (i = 0; i < shorter.length(); i++) {
                // завдяки білдеру та його методу append виконуємо конкатенацію
                // після кожного першого елементу першої строки перший елемент другої строки;
                builder.append(first.charAt(i)).append(second.charAt(i));
            }
            // якщо перша строка більша,
            if (isLongerSecond)
                //  то з'єднуємо методом append те ще в нас вийшло та те, що залишилося від другої строки
                //  (через метод substring, який обрізує строку з якогось індексу і до кінця;
                 builder.append(second.substring(i));
            else builder.append(first.substring(i));
            return builder.toString(); // повертаємо нашу видозмінену строку;
        }



        public static void main (String [] args) {

            Scanner textString1 = new Scanner(System.in);
            System.out.println("№1 Введіть слово:");
            String userPhrase1 = textString1.next();
            System.out.println("Закінчується на ed?:");
            System.out.println(isEd(userPhrase1) );


            Scanner textString2 = new Scanner(System.in);
            System.out.println("№2 Введіть фразу:");
            String userPhrase2 = textString2.nextLine();
            System.out.println("Ваша фраза: " + userPhrase2);

            System.out.println("Cума цифр: " + DigitSum (userPhrase2) );

            System.out.println("№3 Введіть строку:");
            String userPhrase3 = new Scanner(System.in).nextLine();
            System.out.println("Довжина блоку: " + findBiggestBlock(userPhrase3) );

            System.out.println("№4 Введіть слова:");
            findWords(new Scanner(System.in).nextLine() );

            System.out.println("№5 Введіть першу строку:");
            String userPhrase5 = new Scanner(System.in).nextLine();
            System.out.println("№5 Введіть другу строку:");
            String userPhrase6 = new Scanner(System.in).nextLine();

            System.out.println("Результат:");
            System.out.println(getMixOfTwoStrings(userPhrase5, userPhrase6));
        }
    }
