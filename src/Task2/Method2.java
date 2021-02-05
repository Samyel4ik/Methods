package Task2;

import java.util.Scanner;

public class Method2 {
    // Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите значение первого числа: ");
        int a = num.nextInt();
        System.out.print("Введите значение второго числа: ");
        int b = num.nextInt();
        System.out.print("Введите значение третьего числа: ");
        int c = num.nextInt();
        System.out.print("Введите значение четвертого числа: ");
        int d = num.nextInt();
        System.out.println();
        System.out.println("Наибольший общий делитель 4-ч чисел: " + noDivider(a, b, c, d));
    }

    public static int noDivider(int a, int b, int c, int d) {
        int nod = 1;
        for (int i = 1; i <= a && i <= b && i <= c && i <= d; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}
