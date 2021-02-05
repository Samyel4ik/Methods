package Task1;

import java.util.Scanner;

public class Method1 {
    //Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел:
    public static void main(String args[]) {

        Scanner num = new Scanner(System.in);
        System.out.print("Введите значение первого числа: ");
        int a = num.nextInt();
        System.out.print("Введите значение второго числа: ");
        int b = num.nextInt();
        System.out.println();
        System.out.println("Наибольший общий делитель двух чисел: " + noDivider(a, b));
        System.out.println("Наименьшее общее кратное двух чисел: " + noK(a, b));

    }

    public static int noDivider(int a, int b) {
        int nod = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    public static int noK(int a, int b) {
        int nok = (a * b) / noDivider(a, b);
        return nok;
    }
}


