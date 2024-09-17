package TH07;

public class Bai4 {
    public static String getLeft(String s, int n){
        if(s.length()>=n){
            return s.substring(0, n);
        }
        else{
            return s.substring(0, s.length());
        }
    }
    public static void main(String[] args) {
        String s="le huu huy";
        System.out.println(getLeft(s, 4));
    }
}
