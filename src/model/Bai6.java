package model;

import java.util.Scanner;

public class Bai6 {
    public void cau6() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Bai6 bai6 = new Bai6();
        bai6.cau6();
    }
}
