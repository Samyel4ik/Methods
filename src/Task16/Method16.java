package Task16;

import java.util.Arrays;
import java.util.Scanner;

public class Method16 {
    // Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
    //определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество цифр числа:");
        int n = scanner.nextInt();
        int[] array = numArray(n);
        System.out.println("Все " + n + "-x" + " значные числа в которых цифры нечетные:");
        System.out.println(Arrays.toString(array));
        System.out.println("Их сумма:");
        System.out.println(sumNum(n));
        System.out.println("Количество четных числе в сумме:" + evenNum(n));


    }

    public static int lineNum(int n) {                                 //длинна вводимого числа +
        int x = 1;
        while (n > 0) {
            x = x * 10;
            n--;
        }
        return x;
    }

    // разделение числа на массив и проверка его цифр на нечетные !!
    public static int num(int i) {                                  // длинна числа +
        int t = 0;
        while (i > 0) {
            t++;
            i = i / 10;
        }
        return t;
    }

    public static boolean primeNum(int n) {                         // проверка нечетное число ли число

        if (n % 2 != 0) {
            return false;
        }
        return true;
    }

    public static boolean check(int i) {

        int t = num(i) - 1;                                          //число в массив
        int[] array = new int[num(i)];

        while (i > 0) {
            array[t] = i % 10;
            i = i / 10;
            t--;
        }
        // проверяем цифы числа на нечетность
        for (int j = 0; j < array.length; j++) {
            if (primeNum(array[j])) {
                return false;
            }
        }
        return true;
    }

    public static int lineArray(int n) {                // узнаем количесвто таких чисел для создание под них массива
        int t = 0;
        for (int i = lineNum(n) / 10; i < lineNum(n); i++) {
            if (check(i)) {
                t++;
            }
        }
        return t;
    }

    public static int[] numArray(int n) {                       // последовательность n-знаных чисел
        int[] array = new int[lineArray(n)];
        int i = 0;
        for (int j = lineNum(n) / 10; j < lineNum(n); j++) {
            if (check(j)) {
                array[i] = j;
                i++;
            }
        }
        return array;
    }


    public static int sumNum(int n) {
        int sum = 0;

        for (int i = lineNum(n) / 10; i < lineNum(n); i++) {
            if (check(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int evenNum(int n) {                                  //узнаем количестов четных чисел в сумме.
        int zam = sumNum(n);
        int[] array = new int[num(zam)];
        int t = 0;
        while (zam > 0) {
            array[t] = zam % 10;
            zam = zam / 10;
            t++;
        }
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}



