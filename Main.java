import java.util.Random;
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
        /*
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
         */
        //4. Пользователь вводит шестизначное число. Необходимо
        //поменять в этом числе первую и шестую цифры, а также
        //вторую и пятую цифры.
        //Например, 723895 должно превратиться в 593827.
        //Если пользователь ввел не шестизначное число требуется вывести сообщение об ошибке.
        /*
        int num;
        System.out.println("Введите шестизначное число");
        num = scanner.nextInt();
        if (num >= 100000 && num <= 999999){
            int num1 = (num / 100000);
            int num2 = (num / 10000) - num1 * 10;
            int num3 = (num / 1000) - (num1 * 100 + num2 * 10);
            int num4 = (num / 100) - (num1 * 1000 + num2 * 100 + num3 * 10);
            int num5 = (num / 10) - (num1 * 10000 + num2 * 1000 + num3 * 100 + num4 * 10);
            int num6 = num - (num1 * 100000 + num2 * 10000 + num3 * 1000 + num4 * 100 + num5 * 10);
            int result = num6 * 100000 + num5 * 10000 + num3 * 1000 + num4 * 100 + num2 * 10 + num1;
            System.out.println("Результат: " + result);
        }else {
            System.out.println("Число не соответствует требованиям повторите попытку позже.");
        }
         */
        //5. Пользователь вводит с клавиатуры номер месяца (от
        //1 до 12). В зависимости от полученного номера месяца
        //программа выводит на экран надпись: Winter (если введено
        //значение 1,2 или 12), Spring (если введено значение от 3
        //до 5), Summer (если введено значение от 6 до 8), Autumn
        //(если введено значение от 9 до 11).
        //Если пользователь ввел значение не в диапазоне от 1
        //до 12 требуется вывести сообщение об ошибке.
        int month;
        System.out.println("Enter the month in numeric format");
        month = scanner.nextInt();
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        } else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Fall");
        } else {
            System.out.println("You entered a number not in the range from 1 to 12.");
        }
    }
}
