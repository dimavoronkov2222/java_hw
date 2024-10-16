import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Выведите на экран надпись "Your time is limited, so
        //don’t waste it living someone else’s life" Steve Jobs на разных
        //строках.
        String sentence1 = "Your time is limited,";
        String sentence2 = "so don’t waste it";
        String sentence3 = "living someone else’s life";
        String sentence4 = "Steve Jobs";
        System.out.println(sentence1 + "\n" + sentence2 + "\n" + sentence3 + "\n" + sentence4);
        //2. Пользователь вводит с клавиатуры два числа. Первое
        //число — это значение, второе число процент, который
        //необходимо посчитать. Например, мы ввели с клавиатуры
        //50 и 10. Требуется вывести на экран 10 процентов от 50.
        //Результат: 5
        int num1;
        double num2;
        System.out.println("Введите число");
        num1 = scanner.nextInt();
        System.out.println("Введите процент");
        num2 = scanner.nextDouble();
        double result;
        result = (num2 / 100) * num1;
        System.out.println(num2 +"% от " + num1 + " равно: " + result);
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
        //4. Пользователь вводит шестизначное число. Необходимо
        //поменять в этом числе первую и шестую цифры, а также
        //вторую и пятую цифры.
        //Например, 723895 должно превратиться в 593827.
        //Если пользователь ввел не шестизначное число требуется вывести сообщение об ошибке.
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
        //6. Пользователь вводит с клавиатуры количество метров. В зависимости от выбора пользователя программа
        //переводит метры в мили, дюймы или ярды.
        double meters;
        double miles = 1609.34;
        System.out.println("Введите метры");
        meters = scanner.nextInt();
        double result = meters / miles;
        System.out.println("Результат: " + result);
        //7. Пользователь вводит с клавиатуры два числа. Нужно
        //показать все нечетные числа в указанном диапазоне. Если
        //границы диапазона указаны неправильно требуется произвести нормализацию границ. Например, пользователь
        //ввел 20 и 11, требуется нормализация, после которой
        //начало диапазона станет равно 11, а конец 20.
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        int start, end;
        if (num1 < num2) {
            start = num1;
            end = num2;
        } else {
            start = num2;
            end = num1;
        }
        System.out.println("Диапазон: " + start + " до " + end);
        System.out.println("Нечетные числа в диапазоне:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        //8. Показать на экран таблицу умножения в диапазоне,
        //указанном пользователем. Например, если пользователь
        //указал 3 и 5, таблица может выглядеть так:
        //3*1 = 3 3*2 = 6 3*3 = 9 ………… 3* 10 = 30
        //……………………………………………………
        //5*1 = 5 5 *2 = 10 5 *3 = 15 ………….
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();
        System.out.println("Таблица умножения для " + num1 + ":");
        for (int j = 1; j <= 10; j++) {
            System.out.println(num1 + " * " + j + " = " + (num1 * j));
        }
        System.out.println();
        System.out.println("Таблица умножения для " + num2 + ":");
        for (int j = 1; j <= 10; j++) {
            System.out.println(num2 + " * " + j + " = " + (num2 * j));
        }
        //9. В одномерном массиве, заполненном случайными
        //числами, определить минимальный и максимальный
        //элементы, посчитать количество отрицательных элементов, посчитать количество положительных элементов, посчитать количество нулей. Результаты вывести
        //на экран.
        Random rand = new Random();
        int size;
        size = rand.nextInt(50);
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++){
            numbers[i] = rand.nextInt(20) - 10;
        }
        int min = numbers[0], max = numbers[0];
        int countNegative = 0, countPositive = 0, countZeros = 0;
        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
            if (num < 0) countNegative++;
            else if (num > 0) countPositive++;
            else countZeros++;
        }
        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Количество отрицательных элементов: " + countNegative);
        System.out.println("Количество положительных элементов: " + countPositive);
        System.out.println("Количество нулей: " + countZeros);
        //10.Есть одномерный массив, заполненный случайными
        //числами. На основании данных этого массива нужно:
        //■ Создать одномерный массив, содержащий только
        //четные числа из первого массива;
        //■ Создать одномерный массив, содержащий только
        //нечетные числа из первого массива;
        //■ Создать одномерный массив, содержащий только
        //отрицательные числа из первого массива;
        //■ Создать одномерный массив, содержащий только
        //положительные числа из первого массива.
        Random rand = new Random();
        int size;
        size = rand.nextInt(50);
        int[] numbersoriginal = new int[size];
        for (int i = 0; i < size; i++){
            numbersoriginal[i] = rand.nextInt(20) - 10;
        }
        System.out.print("Исходный массив: ");
        for (int num : numbersoriginal) {
            System.out.print(num + " ");
        }
        System.out.println();
        int evenCount = 0, oddCount = 0, positiveCount = 0, negativeCount = 0;
        for (int num : numbersoriginal) {
            if (num % 2 == 0) evenCount++;
            if (num % 2 != 0) oddCount++;
            if (num > 0) positiveCount++;
            if (num < 0) negativeCount++;
        }
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];
        int[] positiveArray = new int[positiveCount];
        int[] negativeArray = new int[negativeCount];
        int e = 0, o = 0, p = 0, n = 0;
        for (int num : numbersoriginal) {
            if (num % 2 == 0) {
                evenArray[e++] = num;
            }
            if (num % 2 != 0) {
                oddArray[o++] = num;
            }
            if (num > 0) {
                positiveArray[p++] = num;
            }
            if (num < 0) {
                negativeArray[n++] = num;
            }
        }
        System.out.print("Четные числа: ");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Нечетные числа: ");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Положительные числа: ");
        for (int num : positiveArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Отрицательные числа: ");
        for (int num : negativeArray) {
            System.out.print(num + " ");
        }
        //11. Напишите метод, который отображает горизонтальную или вертикальную линию из некоторого символа.
        //Метод принимает в качестве параметра: длину линии,
        //направление, символ.
        System.out.print("Введите длину линии: ");
        int length = scanner.nextInt();
        System.out.println("Выберите направление:");
        System.out.println("1 - горизонтальная линия");
        System.out.println("2 - вертикальная линия");
        int directionChoice = scanner.nextInt();
        System.out.print("Введите символ для линии: ");
        char symbol = scanner.next().charAt(0);
        if (directionChoice == 1) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        } else if (directionChoice == 2) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Некорректный выбор направления. Укажите 1 для горизонтальной линии или 2 для вертикальной линии.");
        }
        //12. Напишите метод, сортирующий массив по убыванию или возрастанию в зависимости от выбора пользователя.
        int[] array = {5, 3, 8, 1, 4, 2, 7, 6};
        System.out.println("Выберите способ сортировки:");
        System.out.println("1 - По возрастанию");
        System.out.println("2 - По убыванию");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println("Массив отсортирован по возрастанию:");
        } else if (choice == 2) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println("Массив отсортирован по убыванию:");
        } else {
            System.out.println("Некорректный выбор.");
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
