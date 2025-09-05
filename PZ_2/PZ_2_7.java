package PZ_2;

import java.util.Scanner;

public class PZ_2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        
        System.out.println("Последняя цифра числа: " + n % 10);
        sc.close();
    }
}
