import java.util.*;

public class Recursion {

    // public static void printNum(int n){
    //     if (n == 6 ){
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printNum(n+1);
    // }

    // public static void printSum(int n, int s,int sum){
        
    //     if (n==s){
    //         sum += n;
    //         System.out.println(sum);
    //         return;
    //     }
    //     sum += n;
    //     printSum(n+1,s,sum);
    // }

    public static int printFactorial(int n){
        int f = 1;
        if (n==1 || n==0) {
            return 1 ;
        }
        int fact_n = printFactorial(n-1);
        int fact = n*fact_n;
        return fact;
    }

    public static void main(String[] args){
        // int n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int s = sc.nextInt();
        // int sum = 0;
        // printSum(n,s,sum);

        int factorial = printFactorial(s);
        System.out.println(factorial);
    }
}
