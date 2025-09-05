package PZ_2;

import java.util.Scanner;

public class PZ_2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int n = sc.nextInt();
        
        System.out.println("Сумма цифр числа " + n + " -> " + (n / 100 + n / 10 % 10 + n % 10));
        sc.close();
    }
}
