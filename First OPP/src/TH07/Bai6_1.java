package TH07;

public class Bai6_1 {
    public static String getLastWord(String s){
        String[] a=s.split(" ");
        return a[a.length-1];
    }
    public static String getFirstWord(String s){
        String []a = s.split(" ");
        return a[0];
    }
    public static void main(String[] args) {
        String s="le huu huy";
        System.out.println(getFirstWord(s));
        System.out.println(getLastWord(s));
    }
}
