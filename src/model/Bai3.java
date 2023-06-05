package model;

import java.util.Scanner;

public class Bai3 {
    int a, b;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhap a>0: ");
            a = scanner.nextInt();
        } while (a <= 0);
        do {
            System.out.print("Nhap b>0: ");
            b = scanner.nextInt();
        } while (b <= 0);
    }

    public int greatestCommonDivisor() {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static void main(String[] args) {
        Bai3 bai3 = new Bai3();
        bai3.input();
        System.out.println("UCLN : " + bai3.greatestCommonDivisor());
    }
}
