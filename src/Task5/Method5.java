package Task5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Method5 {
    //Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число
    // , которое меньше максимального элемента массива,но больше всех других элементов).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длинну массива:");
        int n = scanner.nextInt();
        int array[] = new int[n];
        in(array);
        int minMax = minMaxMin(array);
        System.out.println("Число которое меньше максимального ,но больше всех других элементов: " + minMax);
    }

    public static int[] in(int[] array) {                       // метод инициализации
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) - 50;
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int minMaxMin(int array[]) {
        boolean sorting = true;
        while (!sorting) {
            sorting = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                    sorting = false;
                }
            }
        }
        int num = array[array.length - 2];
        return num;
    }
}


