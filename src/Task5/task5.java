package Task5;

import java.util.Scanner;

/**
 * Created by Nixon on 24.10.2016.
 */
public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = sc.nextInt();
        System.out.print("Введите число b: ");
        int b = sc.nextInt();
        System.out.println(a % b);
        if (b == 0) {
            try {
                System.out.println(b % 0);
            } catch (ArithmeticException e) {
                System.out.println("Произошла недопустимая арифметическая операция");
            }
        }
    }
}


