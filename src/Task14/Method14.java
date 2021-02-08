package Task14;

import java.util.Arrays;
import java.util.Scanner;

public class Method14 {
    // Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
    // Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите до какого числа запустить проверку:");
        int n = scanner.nextInt();
        int array[] = new int[0];
        numArmstrong(array,n);

    }

    public static int amountNum(int n) {
        int t = 0;                                 //количество чисел числа либо длинна массива числа  !!!!
        while (n > 0) {
            t++;
            n = n / 10;
        }
        return t;
    }

    public static int sumNum(int n) {                // массив данного числа!!! заполнили цифрами числа.
        int array[] = new int[amountNum(n)];
        for (int i = 0; i < array.length; i++) {
            if (n > 0) {
                array[i] = n % 10;
                n = n / 10;
            }
        }
        int sum = 0;                                       // сумма цифр числа воведенная в степень
        for (int i = 0; i < array.length; i++) {
            sum = (int) (sum + Math.pow(array[i], amountNum(array[i])));
        }
        return sum;
    }

    public static int amountArmstrong(int n) {        // количество таких чисел в моей последовательности!!!
        int a = 0;

        for (int i = 1; i < n; i++) {
            if (i == sumNum(i)) {
                a++;
            }
        }
        return a;
    }

    public static int[] numArmstrong(int array[], int n) {        // забиваю числа аpмстронга в массив.

        array = new int[amountArmstrong(n)];
        int a = 0;
        for (int i = 1; i < n; i++) {
            if (i == sumNum(i)) {
                array[a] = i;
                a++;
            }
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}


