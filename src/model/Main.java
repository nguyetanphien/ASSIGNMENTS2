package model;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    SinhVien sinhVien = new SinhVien();

    public void ThemTT() {
        sinhVien.setStudentcode(1);
        sinhVien.setStudentName("Phien");
        sinhVien.setStudentAge(21);
        sinhVien.setStudentSex("Nam");
    }
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("ID: ");
        sinhVien.setStudentcode(scanner.    nextInt());
        scanner.nextLine();
        System.out.printf("Name: ");
        sinhVien.setStudentName(scanner.nextLine());
        System.out.printf("Age: ");
        sinhVien.setStudentAge(scanner.nextInt());
        System.out.printf("Sex: ");
        scanner.nextLine();
        sinhVien.setStudentSex(scanner.nextLine());
    }

    public void XuatTT() {
        System.out.println("-------------------XUAT THONG TIN--------------");
        System.out.println("ID: " + sinhVien.getStudentcode());
        System.out.println("Name: " + sinhVien.getStudentName());
        System.out.println("Age: " + sinhVien.getStudentAge());
        System.out.println("Sex: " + sinhVien.getStudentSex());
    }

    public void Input2() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so sinh vien:");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            Input();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
//        main.ThemTT();
//        main.XuatTT();
//        main.Input();
        main.Input2();
    }
}