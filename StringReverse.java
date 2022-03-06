package assigment6;
public class StringReverse
 {
    public static void main(String[] args) {
        String str = "my name is khan";
        String word[]=str.split("\\s");
        String rev = "";
        for (int i = 0;i<word.length;i++) {
            String Word=word[i];
            String reverseword="";
            for(int j=Word.length()-1;j>=0;j--){
                reverseword=reverseword+Word.charAt(j);
            }
            rev=rev+reverseword+" ";
        }
        System.out.println(rev);
    }


}
