package assigment6;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a number : ");
        int n=s.nextInt();
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("facctorial of given number : " +fact);

    }
}
