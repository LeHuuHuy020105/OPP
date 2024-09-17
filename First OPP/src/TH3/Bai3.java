package TH3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int h=Integer.parseInt(sc.nextLine());
        for(int i=0;i<h;i++){
            for(int j=0;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        sc.close();
    }
}
