package model;

import java.util.Scanner;

public class Bai5 {

    public void cau5(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("*");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Bai5 bai5=new Bai5();
        bai5.cau5();
    }
}
