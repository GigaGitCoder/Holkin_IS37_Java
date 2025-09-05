package PZ_2;

import java.util.Scanner;

public class PZ_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сторону A: ");
        int sideA = sc.nextInt();
        System.out.print("Введите сторону B: ");
        int sideB = sc.nextInt();
        
        System.out.println("По введённым данным (A: " + sideA + ", B: " + sideB + ")");
        System.out.println("Периметр (2A + 2B): " + (2 * sideA + 2 * sideB));
        System.out.println("Периметр (A * B): " + sideA * sideB);
        sc.close();
    }
}
