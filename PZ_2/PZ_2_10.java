package PZ_2;

import java.util.Scanner;

public class PZ_2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите высоту шеста в метрах: ");
        int h = sc.nextInt();
        System.out.print("Введите на сколько улитка поднимается за день (метров): ");
        int a = sc.nextInt();
        System.out.print("Введите на сколько улитка опускатеся за ночь (метров): ");
        int b = sc.nextInt();
        
        System.out.println("Улитка, поднимаясь на " + a + " метров в день и опускаясь на " + b + " метров ночью, доползет до вершины шеста высотой " + h + " метров за " + ((h - b - 1) / (a - b) + 1) + " дней");
        sc.close();
    }
}
