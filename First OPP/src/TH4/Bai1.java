package TH4;

import java.util.Scanner;

public class Bai1 {
    public static double tienLoi(int sotien, int songaygui,double laisuat){
        return sotien*laisuat/360*songaygui;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so tien: ");
        int sotien=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so ngay gui: ");
        int songaygui=Integer.parseInt(sc.nextLine());
        System.out.println("Nhap lai suat: ");
        double laisuat=Double.parseDouble(sc.nextLine());
        System.out.println("Tien Loi: "+ tienLoi(sotien,songaygui,laisuat));
        sc.close();
    }
}
