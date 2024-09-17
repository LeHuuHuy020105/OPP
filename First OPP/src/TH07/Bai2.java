package TH07;

public class Bai2 {
    public static String Connect2String(String s1, String s2, int n){
        if(n==0){
            return s1+s2;
        }
        else{
            return s2+s1;
        }
    }
    public static void main(String[] args) {
        String s1="Hello";
        String s2="World";
        System.out.println(Connect2String(s1, s2, 0));
    }
}
