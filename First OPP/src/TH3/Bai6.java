package TH3;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        int h=Integer.parseInt(sc.nextLine());
        for(int i=0;i<h;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
