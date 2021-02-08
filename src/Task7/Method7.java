package Task7;

import java.util.Arrays;

public class Method7 {
    //Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

    public static int factorialNum(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {

            num *= i;
        }
        return num;
    }

    public static int sumFactorial(int array[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += factorialNum(array[i]);
        }
        return sum;
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 5, 7, 9};
        int n = array.length;
        System.out.println(Arrays.toString(array));
        System.out.println("Сумма факториалов данных чисел: " + sumFactorial(array, n));
    }
}
