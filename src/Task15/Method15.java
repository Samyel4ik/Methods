package Task15;

import java.util.Arrays;
import java.util.Scanner;

public class Method15 {
    //Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
    // Для решения задачи использовать декомпозицию.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество цифр числа:");
        int n = scanner.nextInt();
        int[] array = amountNum(n);
        System.out.println(Arrays.toString(array));
    }

    public static int amount(int n) {                   // длинна числа, количество цифр+ (из последовательности)
        int t = 0;
        while (n > 0) {
            t++;
            n = n / 10;
        }
        return t;
    }

    public static boolean checkNum(int n) {                      //забиваем число в массив по порядку!!! т е 123 масс = 1,2,3 +++(числоиз последовательности)
        int i = amount(n) - 1;
        int[] array = new int[amount(n)];
        while (n > 0) {
            array[i] = n % 10;
            n = n / 10;
            i--;
        }
        boolean t = true;
        for (int j = 0; j < array.length - 1; j++) {               // проверяем цифры числа на ворастание (из последовательности)
            if (array[j] + 1 != array[j + 1]) {
                t = false;
            }
        }
        return t;
    }

    public static int znak(int n) {                             // преобразование запрошенного n-значного числа (с клавиатуры)
        int x = 1;
        while (n > 0) {
            x = x * 10;
            n--;
        }
        return x;
    }

    public static int lineArray(int n) {                      // длинна массива чисел которые мы ищем
        int a = 0;
        for (int i = znak(n) / 10; i < znak(n); i++) {
            if (checkNum(i)) {
                a++;
            }
        }
        return a;
    }

    public static int[] amountNum(int n) {                      // последовательность n-начного числа
        int[] array = new int[lineArray(n)];
        int a = 0;
        for (int i = znak(n) / 10; i < znak(n); i++) {                  //проверка каждого числа на возрастающие число.
            if (checkNum(i)) {
                array[a] = i;
                a++;
            }
        }
        return array;
    }
}


