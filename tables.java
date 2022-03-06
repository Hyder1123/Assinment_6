package assigment6;
import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       System.out.print("enter the number of table : ");
        int n=s.nextInt();
        for(int i=1;i<=10;i++){

             System.out.println(+n+"*"+i+"="+n*i);
        }

    }
}
