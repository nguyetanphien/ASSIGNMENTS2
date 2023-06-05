package model;

import java.util.Scanner;

public class Bai2 {
    public void Day() {
        int date = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            do {
                System.out.printf("Nhập Tháng: ");
                date = scanner.nextInt();

            } while (date < 1 || date > 12);
        } catch (Exception e) {
            System.out.println(e);
        }
        switch (date) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + date + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + date + " có 30 ngày");
                break;
            default:
                System.out.println("Nhập năm: ");
                int nam = scanner.nextInt();
                if ((nam % 100 != 0 && nam % 4 == 0) || nam % 400 == 0)
                    System.out.println("Tháng 2  có 29 ngày");
                else System.out.println("Tháng 2  có 28 ngày");
        }
    }

    public static void main(String[] args) {
        Bai2 main = new Bai2();
        main.Day();
    }
}
