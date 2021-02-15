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

        System.out.println("Число которое меньше максимального ,но больше всех других элементов: " + minMaxMin(n));
    }

    public static int[] in(int n) {                       // метод инициализации
       int [] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static int minMaxMin(int n) {
        int [] array = in(n);
        boolean sorting = false;
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
       // System.out.println(Arrays.toString(array));
        return array[array.length - 2];
    }
}


