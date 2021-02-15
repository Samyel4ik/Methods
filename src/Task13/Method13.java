package Task13;

import java.util.Arrays;
import java.util.Scanner;

public class Method13 {
    //Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
    // Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
    // Для решения задачи использовать декомпозицию.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите начало отрезка:");
        int n = scanner.nextInt();
        int x = n * 2;
        System.out.println("Простые числа из последовательности:");
        int[] array = numArray(n);
        System.out.println(Arrays.toString(array));
        twins(array);

    }

    public static int lineArray(int n) {            //длинна массива равна количеству простых чисел .
        int t = 0;
        for (int i = n; i < n * 2; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                t++;
            }
        }
        return t; // t= количству простых чисел .
    }

    public static int[] numArray(int n) {      //заполняем массив простыми числами
        int[] array = new int[lineArray(n)];

        int k = 0;

        for (int i = n; i < n * 2; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                array[k] = i;
                k++;
            }
        }
        return array;
    }

    public static int twins(int [] array) {                // ищем в массиве заполненный числами простыми ..количество блиблизнецы
        int t = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 2 == array[i + 1]) {
                t++;
                System.out.println("Близнецы:" + array[i] + " и " + array[i + 1]);
            }
        }
        return t;
    }
}

