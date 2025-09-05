package PZ_2;

import java.util.Scanner;

public class PZ_2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите стоимость в рублях: ");
        int a = sc.nextInt();
        System.out.print("Введите остаток копеек: ");
        int b = sc.nextInt();
        System.out.print("Введите количество пирожков: ");
        int n = sc.nextInt();
        
        System.out.println(n + " пирожков будет стоить: " + (a * n + b * n / 100) + " рублей " + (b * n) % 100 + " копеек");
        sc.close();
    }
}
