package Task3;

import java.util.Scanner;

public class Method3 {
   //Вычислить площадь правильного шестиугольника со стороной а,
    // используя метод вычисления площади треугольника.

    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
       System.out.print("Введите значение стороны многоугольника: ");
       int a  = num.nextInt();
       double polygonArea = 6 * triangleArea(a);
       System.out.println("Площадь правильного многоугольника с данной стороной: " + polygonArea);
   }
   public static  double triangleArea (int a){
       return  ( Math.sqrt(3) * Math.pow(a,2))/4;
   }
}


