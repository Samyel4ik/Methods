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
        int array[] = new int[0];
        numArray(array, n);
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

    public static int[] numArray(int array[], int n) {      //заполняем массив простыми числами
        array = new int[lineArray(n)];

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
        System.out.println("Простые числа из данной последовательности:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] + 2 == array[i + 1]) {
                System.out.println("Близнецы:" + array[i] + " и " + array[i + 1]);
            }
        }
        return array;
    }
//    public static int  twins (int n){       // ищем в массиве заполненный числами простыми ..близнецы
//       numArray()
//
//        int t1 = 0;
//        int t2 = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == array[i+2]){
//                t1 =array[i];
//                t2 = array[i+2];
//                System.out.println("Близнецы:"+ t1 +t2);
//            }
//        }
//        return t1;
//    }
}
