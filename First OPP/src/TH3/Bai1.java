package TH3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap nam: ");
        int nam=Integer.parseInt(sc.nextLine());
        if(nam%400==0 || (nam%4==0 && nam%100!=0)){
            System.out.println(nam+" la nam nhuan");
        }
        else{
            System.out.println(nam+" khong phai la nam nhuan");
        }
        sc.close();
    }
}
