package model;

import java.util.Scanner;

public class Bai7 {
    public void cau7(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n: ");
        n = scanner.nextInt();

        for(int i=1;i<=n;i++){

            for (int j=1;j<=(n-i);j++)
                System.out.printf(" ");
            for(int k=1;k<=(2*i-1);k++)
                System.out.printf("*");
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Bai7 bai7=new Bai7();
        bai7.cau7();
    }
}
