package assigment6;

public class trancateString {
    public static void mai(String[] arg) {


        String listOfWords ="hello how are you contestant";
        String[] b = listOfWords.split("\\s+");
        String lastWord = b[b.length - 1];
        System.out.print(lastWord);
    }
}
