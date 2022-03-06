package assigment6;

public class primenumbers {
    public static void main(String[] args) {
        int j=0 ,n = 100, count = 0;
        for (int i = 2; i <= n - 1; i++) {
            for (j = 2; j <= n; j++)
                if (i % j == 0) {
                    count = count + 1;

                }
        }
        if (count == 2) {
            System.out.println("prime numbers from 1-100 : " + j + " ");
        }

    }

}