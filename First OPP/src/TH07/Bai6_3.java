package TH07;

public class Bai6_3 {
    public static String FindAndReplace(String s1, String findwhat, String replacewith, int n){
        if(n==1){
            return s1.replace(findwhat, replacewith);
        }
        else{
            String[]a = s1.split(" ");
            StringBuilder s=new StringBuilder();
            for(int i=0;i<a.length;i++){
                if(a[i].equalsIgnoreCase(findwhat)){
                    a[i]=replacewith;
                }
                s.append(a[i]);
                if(i<a.length-1){
                    s.append(" ");
                }
            }
            return s.toString();
        }
    }
    public static void main(String[] args) {
        String s1="le Huu huy";
        String findwhat="huu";
        String replace ="aaaa";
        System.out.println(FindAndReplace(s1, findwhat, replace, 0));
    }
}
