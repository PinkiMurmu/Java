import java.util.Scanner;

public class Multiplication {
    public static int mulOfTwo(int a,int b){
        return a*b;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 =  sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        
        System.out.print("Product is : "+mulOfTwo(num1,num2));
    }
}
