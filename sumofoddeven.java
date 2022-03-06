package assigment6;
import java.util.Scanner;
public class sumofoddeven {
    public static void main(String[] args) {
        int Esum=0,Osum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the range : ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                Esum=Esum+i;
            }
            else{
                Osum=Osum+i;
            }
        }
        System.out.println("sum of even numbers are : " +Esum);
        System.out.println("sum of odd numbers are : " +Osum);
    }

}
