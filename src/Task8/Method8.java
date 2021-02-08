package Task8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Method8 {
    //Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5];
    //Пояснение. Составить метод(методы)
    // для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество числ массива:");
        int d = scanner.nextInt();
        System.out.print("Введите номер первого числа:");
        int k = scanner.nextInt();
        System.out.print("Введите номер второго числа:");
        int m = scanner.nextInt();
        int num1 = k - 1;
        int num2 = m - 1;

        int array[] = new int[d];
        initialization(array);
        System.out.println("Сумма последовательных чисел:");
        sumNumArray(array, num1, num2);
    }

    public static int[] initialization(int array[]) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int sumNumArray(int array[], int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += array[i];
        }
        System.out.println(sum);
        return sum;
    }
}
