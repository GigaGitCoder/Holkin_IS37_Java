package PZ_2;

import java.util.Scanner;

public class PZ_2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое натуральное число: ");
        int n = sc.nextInt();
        
        System.out.println("Следующее четное число: " + ((n | 1) + 1));
        sc.close();
    }
}
