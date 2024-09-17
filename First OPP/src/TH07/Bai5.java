package TH07;

public class Bai5 {
    public static String myTrim (String s){
        String [] word_array=s.split(" ");
        String s_trim="";
        for(int i=0;i<word_array.length;i++)
        {
        System.out.print(word_array[i] );
        if(!word_array[i].equals("")){
        System.out.println(word_array[i]);
        s_trim=s_trim+word_array[i] + " ";
        }
        }
        return s_trim;
        }
        public static void main(String[] args) {
            String s="le huu huy";
            System.out.println(myTrim(s));
        }
}
