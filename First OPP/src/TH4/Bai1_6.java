package TH4;

import java.util.Scanner;

public class Bai1_6 {
    public static boolean testAST(int AST){
        if(20<=AST && AST<=40 ){
            return false;
        }
        return true;
    }
    public static boolean testALT(int ALT){
        if(20<=ALT && ALT<=40){
            return false;
        }
        return true;
    }
    public static boolean testALP(int ALP){
        if(35<=ALP && ALP<=115){
            return false;
        }
        return true;
    }
    public static boolean testGGT(int GGT){
        if(3<=GGT && GGT<=60){
            return false;
        }
        return true;
    }
    public static void xetNghiem(int AST,int ALT,int GGT,int ALP){
        if(testALP(ALP) || testALT(ALT) || testAST(AST) || testGGT(GGT)){
            System.out.println("Men gan cao");
        }
        else{
            System.out.println("Binh thuong");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ALP=Integer.parseInt(sc.nextLine());
        int ALT=Integer.parseInt(sc.nextLine());
        int AST=Integer.parseInt(sc.nextLine());
        int GGT=Integer.parseInt(sc.nextLine());
        xetNghiem(AST, ALT, GGT, ALP);
        sc.close();;
    }
}
