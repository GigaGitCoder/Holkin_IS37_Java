package PZ_2;

import java.util.Scanner;

public class PZ_2_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = sc.nextInt();
        
        System.out.println(num1 + " * " + num2 + " * " + num3 + " = " + num1 * num2 * num3);
        sc.close();
    }
}
