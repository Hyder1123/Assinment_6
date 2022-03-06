package assigment6;
import java.util.Scanner;

public class UserChooise {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter a digite:");
        String chooise="";
        int sum=0,product=1,count=0;



        if(!chooise.equals("q")) {
            System.out.println("enter a i number for continue or 'q' for quit:");
            chooise = s.next();
            if (!chooise.equals("q")) {
                int num = Integer.parseInt(chooise);
                for(int i=0;i<=num;i++) {
                    sum = sum + num;
                    product = product * num;
                    count++;
                }
            }
        }
        System.out.println("Product is: "+product+"\nAverage is: "+((float)sum/count));



    }
}
