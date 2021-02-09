package Task12;

import java.util.Arrays;
import java.util.Scanner;

public class Method12 {
    //Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
    // элементами которого являются числа,
    // сумма цифр которых равна К и которые не большее N.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение числа: ");
        int n = scanner.nextInt();
        System.out.print("Введите значение суммы цифр: ");
        int k = scanner.nextInt();
        int array[] = numArray(n, k);
        System.out.println(Arrays.toString(array));

    }

    public static int arrayLength(int n, int k) {
        int t = 0;                              // длинна массива или количесвто чисел сумма которых ==а

        for (int i = 1; i <= n; i++) {
            int sum = i % 10 + i / 10;
            if (sum == k) {
                t++;
            }
        }
        return t;
    }

    public static int[] numArray(int n, int k) {
        int[] array = new int[arrayLength(n, k)];
        int i = 0;                                  //через переменную инициализирую массив ...

        for (int j = 1; j <= n; j++) {
            int sum = j % 10 + j / 10;
            if (sum == k) {
                array[i] = j;
                i++;
            }
        }
        return array;
    }
}


