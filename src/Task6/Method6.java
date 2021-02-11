package Task6;

import java.util.Scanner;

public class Method6 {
    //Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Введите значение первого числа: ");
        int a = num.nextInt();
        System.out.print("Введите значение второго числа: ");
        int b = num.nextInt();
        System.out.print("Введите значение третьего числа: ");
        int c = num.nextInt();
        int nod = noD(a, b, c);
        if (nod == 1) {
            System.out.println("Являются взаимно простыми");
        } else {
            System.out.println("Не являются взаимно простыми");
        }
    }

    public static int noD(int a, int b, int c) {
        int nod = 0;
        for (int i = 1; i <= a && i <= b && i <= c; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                nod = i;
            }
        }
        return nod;
    }
}