import java.util.*;

public class PracticeTillNow {
    
    // public static int sumToNum(int n){
    //     //2. 
    //     if (n<1){
    //         System.out.println("Invalid number.");
    //     }
    //     int sum = 0;
    //     for (int i = 1; i<=n; i++){
    //         if (i%2!=0){
    //             sum = sum+i;
    //         }
    //     }
    //     return sum;
    // }

    // public static void maxOfTwo(int a, int b){
    //     //3.
    //     if (a>b){
    //         System.out.println(a+" is greater.");
    //     }
    //     else if (a==b){
    //         System.out.println(a+" and "+b+" are equal.");
    //     }
    //     else{
    //         System.out.println(b+" is greater.");
    //     }
    //     return;
    // }

    // public static double circumference(double rad){
    //     //4.
    //     double c = 2 * 3.14 * rad;
    //     return c;
    // }

    // public static void eligibleForVote(int a){
    //     //5.
    //     if (a>=18){
    //         System.out.println("Eligible for vote.");
    //         return;
    //     }
    //     else if (a<1){
    //         System.out.println("Wrong age entry ...");
    //         return;
    //     }
    //     else {
    //         System.out.println("Not eligible for vote.");
    //         return;
    //     }
    // }

    // public static int power(int x,int n){
    //     //8.
    //     int result = 1;
    //     for (int i = 0; i<n; i++){
    //         result = result * x;
    //     }
    //     return result;
    // }

    public static void commonDivisor(int n1,int n2){
        //9.
        while (n1 != n2){
            if (n1>n2){
                n1 = n1-n2;
            }
            else{
                n2 = n2-n1;
            }
        }
        System.out.println("Greatest common divisor is : "+n2);
    }


    public static void main(String args[]){

        //10. (BONUS) Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .... In the the Fibonacci series, a number is the sum of the previous 2 numbers that came before .

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int n = sc.nextInt();

        // int a = 0,b = 1;
        // System.out.print(a+" ");
        // if(n > 1) {
        //     for(int i=2; i<=n; i++) {
        //         System.out.print(b+" ");
        //         int temp = b;
        //         b = a + b;
        //         a = temp;
        //     }
        //     System.out.println();
        // }
 


        //9. (BONUS) Write a function that calculates the Greatest Common Divisor of 2 numbers.
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        commonDivisor(a,b);



        //8. Two numbers are entered by the user, x and n. Write a function(power) to find the value of one number raised to the power of another i.e. x^n .

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter two numbers : ");
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // int result = power(x, n);
        // System.out.println("Result is : "+result);



        //7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered .

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Press 1 to continue and 0 to stop . ");
        // System.out.print("Enter your choice : ");
        // int choice = sc.nextInt();
        // int pos = 0, neg = 0, zero = 0;
        // while (choice==1) {
        //     System.out.print("Enter number : ");
        //     int input = sc.nextInt();
        //     if (input>1){
        //         pos +=1;
        //     }
        //     else if (input==0){
        //         zero+=1;
        //     }
        //     else{
        //         neg+=1;
        //     }
        //     System.out.println("Press 1 to continue and 0 to stop . ");
        //     System.out.print("Enter choice : ");
        //     choice = sc.nextInt();
        // }
        // System.out.println("Positive = "+pos);
        // System.out.println("Negative = "+neg);
        // System.out.println("Zeros = "+zero);
        


        //6. Write an infinite loop using do while condition.

        // do{
        //     System.out.println("Hello World!");
        // }while(true);



        //5. Write a function that takes in age as input and returns if that person is eligible to vote or not . A person of age>18 is eligible to vote . 

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter age : ");
        // int age = sc.nextInt();
        // eligibleForVote(age);



        //4. Write a function that takes in the radius as input and returns the circumference of a circle.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // float r = sc.nextInt();
        // double c = circumference(r);
        // System.out.println("Circumference of the circle is : "+c);


        
        //3. Write a function(maxOfTwo) which takes in 2 no.s and returns the greater of those two .

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter two numbers : ");
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // maxOfTwo(num1, num2);



        //2. Write a function(sumToNum) to print the sum of all odd numbers from 1 to n :

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();

        // int sum = sumToNum(num);
        // System.out.print("Sum of all odd numbers till "+num+" is : "+sum);



        //1. Enter 3 no.s from the user & make a function to print their average :

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter three numbers : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // int avg = (a+b+c)/3;
        // System.out.println("Average is : "+avg);
    }
}
