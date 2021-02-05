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
        minMaxMin(array);
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

    public static int[] minMaxMin(int array[]) {        // метод нахождения 2-го по вличине числа в массиве
        int array1[] = in(array);                         // используем какой то массив и инициализируем его

        int a = 0;                                          // сортируем по возрастанию
        while (a == 0) {
            a = 1;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int t = array[i];
                    a = 0;
                    array[i] = array[i + 1];
                    array[i + 1] = t;
                }
            }
        }
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("Число которое меньше максимального ,но больше всех других элементов");
        System.out.println(array[array.length - 2]);
        return array1;
    }
}

