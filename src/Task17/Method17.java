package Task17;

import java.util.Scanner;

public class Method17 {
    //Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
    // Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение числа:");
        int n = scanner.nextInt();

        System.out.println("Количество вычитанй которое приведет к нулю: " + howMuch(n));

    }

    public static int numberDigits(int n) {
        int t = 0;                                 //количество чисел
        while (n > 0) {
            t++;
            n = n / 10;
        }
        return t;
    }

    public static int sumNumber(int n) {                // массив данного числа!!! заполнили цифрами числа.
        int array[] = new int[numberDigits(n)];
        for (int i = 0; i < array.length; i++) {
            if (n > 0) {
                array[i] = n % 10;
                n = n / 10;
            }
        }
        int sum = 0;                                       // сумма цифр числа
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int howMuch(int n) {
        int t = 0;
        while (n > 0) {
            n = n - sumNumber(n);
            t++;
        }
        return t;
    }
}
