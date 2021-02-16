package Task4;

import java.util.Arrays;
import java.util.Scanner;

public class Method4 {
    // На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
    // Указание. Координаты точек занести в массив.

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите количество точек:");
        int n = num.nextInt();
        double array[][] = new double[n][2];                                    // массив

        for (int i = 0; i < n; i++) {                                           // с помощью цилка запускаем счетчик количества точек
            System.out.printf("Введите координаты %s точки:", i + 1);
            System.out.println();
            array[i] = arrayRead(num);
        }

        System.out.println(distanse(array));
    }

    public static double[] arrayRead(Scanner num) {  //
        double array[] = new double[2];
        array[0] = num.nextInt();
        array[1] = num.nextInt();
        return array;
    }
    
    public static double distanceCalculation(double x1, double y1, double x2, double y2) {  //формула подсчета растояния между двумя точками.
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double distanse(double[][] array) {
        double arrayN1[] = array[0];
        double arrayN2[] = array[0];
        double distanseMax = distanceCalculation(array[0][0], array[0][1], array[1][0], array[1][1]);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                double distanse = distanceCalculation(array[i][0], array[i][1], array[j][0], array[j][1]);
                if (distanseMax < distanse) {
                    arrayN1 = array[i];
                    arrayN2 = array[j];
                    distanseMax = distanse;
                }
            }
        }
        System.out.println("Координата первой точки: ");
        System.out.println(Arrays.toString(arrayN1));
        System.out.println("Координата второй точки: ");
        System.out.println(Arrays.toString(arrayN2));
        System.out.println("Самое большое расстояни между данными двумя точками составило:");
        return distanseMax;
    }
}
