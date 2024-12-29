import java.util.Scanner;

public class Factorial {
    public static void printFactorial(int a){
        if (a<0){
            System.out.println("Invalid number.");
            return ;
        }
        int fact = 1;
        for (int i  = 1; i<=a; i++){
            fact = fact*i;
        }
        System.out.println("Factorial is : "+fact);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        printFactorial(num);
    }
}
