package Task9;

import java.util.Scanner;

public class Method9 {
    // Даны числа X, Y, Z, Т — длины сторон четырехугольника.
    // Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение первой  стороны четырехугольника которая образует прямой угол:");
        int x = scanner.nextInt();
        System.out.print("Введите значение стороны второй четырехугольника которая образует прямой угол:");
        int y = scanner.nextInt();
        System.out.print("Введите значение третьей  стороны четырехугольника:");
        int z = scanner.nextInt();
        System.out.print("Введите значение четвертой стороны четырехугольника:");
        int t = scanner.nextInt();
        System.out.println("Площадь заданного по данным сторонам четырехуголинка:" + areaQuadrangle(x, y, z, t));

    }

    public static double areaQuadrangle(int a, int b, int c, int d) {
        double areaS1 = (a * b) / 2;
        double gip = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        double semiPerimeter = (gip + c + d) / 2;
        double areaS2 = Math.sqrt(semiPerimeter * (semiPerimeter - gip) * (semiPerimeter - c) * (semiPerimeter - d));
        double area = areaS1 + areaS2;
        return area;
    }
}
