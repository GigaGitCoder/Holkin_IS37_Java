package PZ_2;

import java.util.Scanner;

public class PZ_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите время движения (Секунды): ");
        int time = sc.nextInt();
        System.out.print("Введите второе число (м/c): ");
        int speed = sc.nextInt();
        
        System.out.println("За " + time + " секунд при скорости " + speed + " м/c вы бы прошли " + time * speed + " метров");
        sc.close();
    }
}
