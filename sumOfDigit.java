package assigment6;
//import

public class sumOfDigit {
    public static void main(String[] args) {
        int n=671;
        int sum=0,digte;
        for(int i=0;i<=n;i++){
           digte =n%10;
            sum=sum+digte;
            n=n/10;

        }

        System.out.print(sum+n);
    }
}
