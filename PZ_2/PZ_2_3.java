package PZ_2;

import java.util.Scanner;

public class PZ_2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        
        System.out.println("The next number for the number " + num + " is " + (num + 1));
        System.out.println("The previous number for the number " + num + " is " + (num - 1));
        sc.close();
    }
}
