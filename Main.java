import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Выведите на экран надпись "Your time is limited, so
        //don’t waste it living someone else’s life" Steve Jobs на разных
        //строках.
        /*
        String sentence1 = "Your time is limited,";
        String sentence2 = "so don’t waste it";
        String sentence3 = "living someone else’s life";
        String sentence4 = "Steve Jobs";
        System.out.println(sentence1 + "\n" + sentence2 + "\n" + sentence3 + "\n" + sentence4 + "\n end task #1");
         */
        //2. Пользователь вводит с клавиатуры два числа. Первое
        //число — это значение, второе число процент, который
        //необходимо посчитать. Например, мы ввели с клавиатуры
        //50 и 10. Требуется вывести на экран 10 процентов от 50.
        //Результат: 5
        /*
        int num1;
        double num2;
        System.out.println("Введите число");
        num1 = scanner.nextInt();
        System.out.println("Введите процент");
        num2 = scanner.nextDouble();
        double result;
        result = (num2 / 100) * num1;
        System.out.println(num2 +"% от " + num1 + " равно: " + result);
         */
        //3. Пользователь вводит с клавиатуры три цифры. Необходимо создать число, содержащее эти цифры. Например,
        //если с клавиатуры введено 7, 3, 8, тогда нужно сформировать число 738.
        int num1;
        int num2;
        int num3;
        int num4;
        System.out.print("Введите первую цифру: ");
        num1 = scanner.nextInt();
        System.out.print("Введите вторую цифру: ");
        num2 = scanner.nextInt();
        System.out.print("Введите третью цифру: ");
        num3 = scanner.nextInt();
        System.out.print("Введите четвертую цифру: ");
        num4 = scanner.nextInt();
        int result = num1 * 1000 + num2 * 100 + num3 * 10 + num4;
        System.out.println("Число: " + result);
    }
}
