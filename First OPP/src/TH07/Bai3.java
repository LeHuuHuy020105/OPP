package TH07;

public class Bai3 {
    public static int compare2String(String s1, String s2,int n){
        int kq=0;
        if(n==0){
            kq=s1.compareToIgnoreCase(s2); // khong phan biet hoa thuong
        }
        else{
            kq=s1.compareTo(s2);
        }
        if(kq<0){
            kq=-1;
        }
        if(kq>0){
            kq=1;
        }
        return kq;
    }
    public static void main(String[] args) {
        String s1="le huu huy";
        String s2="le huu thang";
        System.out.println(compare2String(s1, s2, 0));
    }
}
