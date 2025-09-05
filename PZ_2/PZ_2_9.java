package PZ_2;

import java.util.Scanner;

public class PZ_2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = 109;
        System.out.print("Введите скорость автомобиля (V -> км/час): ");
        float v = sc.nextFloat();
        System.out.print("Введите время поездки (t -> часов): ");
        float t = sc.nextFloat();
        
        System.out.println("За " + t + " часов, со скоростью " + v + " км/час, на трассе длиной " + s + " километров, автомобиль был бы на отметке: " + (v * t - v * t % 1));
        sc.close();
    }
}
