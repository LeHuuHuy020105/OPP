package TH02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double g=9.81;
        System.out.println("Nhap thoi gian roi: ");
        Double t=Double.parseDouble(sc.nextLine());
        System.out.println("Nhap van toc: ");
        Double vbd=Double.parseDouble(sc.nextLine());
        System.out.println("Nhap vi tri ban dau: ");
        Double vtbd=Double.parseDouble(sc.nextLine());
        Double vt=0.5*g*Math.pow(t, 2)+vbd*t+vtbd;
        System.out.println("Vi tri: "+vt);
        sc.close();
    }
}
