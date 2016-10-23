package Task1;

import java.util.Scanner;

/**
 * Created by Влад on 13.10.2016.
 */
public class task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("НОК заданных чисел " + nok(a, b));
        System.out.println("НОД заданных чисел " + nod(a, b));
        sc.close();


    }

    public static int nod(int a, int b) {
        if (b == 0)
            return a;
        else
            return nod(b, a % b);
    }

    public static int nok(int a, int b) {
        return a * b / (nod(a, b));
    }
}