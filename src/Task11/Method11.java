package Task11;

import java.util.Scanner;

public class Method11 {
    //Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число:");
        int a = scanner.nextInt();
        System.out.print("Введите второе число:");
        int b = scanner.nextInt();
        sumMax(a,b);

    }
    public static int sumNum (int a){
        int sum=0;                          // количество чисел в исходном числе
        while (a>0){
            sum++;
            a= a/10;
        }

        return sum;
    }
    public static int sumMax (int a,int b){     // сравниваем количество чисел с помощью метода выше
       int maxNum = 0;
        if (sumNum(a)>sumNum(b)){
            maxNum = sumNum(a);
            System.out.println("В данном числе цифр больше: " + a);
        }else {
            maxNum = sumNum(b);
            System.out.println("В данном числе цифр больше: " + b);
        }

        return maxNum;
    }
}
