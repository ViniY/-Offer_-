import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * This is a program for calculating the fibonacci series.
 * The input value indicates the i th number in the series.
 * And the returned value is the calculated value.
 **/
public class Q10Fibonacci {
    int n1 = 0;
    int n2 = 1;
    int n = 0;
    int barometer = 0;

    ArrayList<Integer> values = new ArrayList<>();
    public Q10Fibonacci(int i){
        values.clear();
        this.values.add(n1,n2);
        this.n = i;
    }
    public int fibRecur(int n ){
        this.barometer++;
        if (n<=0) return 0;
        if(n==1) return 1;
        return fibRecur(n-1) + fibRecur(n-2);
    }


    public int fibDP(int n){
        int f[] = new int[n+2];
        int i;
        f[0] = 0;
        f[1]= 1;
        for(i=2; i<=n; i++){
            this.barometer++;
            f[i] = f[i-1] + f[i-2];

        }


        return f[n];
    }

    public static void main(String[] args) {
        Q10Fibonacci q10 = new Q10Fibonacci(9);
        int result = q10.fibRecur(9);
        System.out.println("The final result is : " +  result);
        System.out.println("The barometer reports : " + q10.barometer);
        Q10Fibonacci q10DP = new Q10Fibonacci(9);

        int resultDP = q10DP.fibDP(9);
        System.out.println("The final result is : " +  resultDP);
        System.out.println("The barometer(DP) reports : " + q10DP.barometer);
    }
}
