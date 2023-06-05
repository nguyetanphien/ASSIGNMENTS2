package model;

public class Bai4 {
    public void bCC(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Bai4 bai4=new Bai4();
        bai4.bCC();
    }
}
