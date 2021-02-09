package Task10;

import java.util.Arrays;
import java.util.Scanner;

public class Method10 {
    //Дано натуральное число N.
    // Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение: ");
        int n = scanner.nextInt();
        int array[] = arrayNum(n);
        System.out.println(Arrays.toString(array));
    }

    public static int num(int n) {                 // узнаем длинну массива
        int t = 0;
        while (n > 0) {
            t++;
            n = n / 10;
        }
        return t;
    }

    public static int[] arrayNum(int n) {             // переделываем в массив

        int[] array = new int[num(n)];

        for (int i = 0; i < array.length; i++) {
            if (n > 0) {
                array[i] = n % 10;
                n = n / 10;
            }
        }
        return array;
    }
}
