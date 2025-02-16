import java.util.*;
public class Questions {
    public static void main(Strings args[]){

        // Make a menu driven program. The user can enter 2 numbers, either 1 or 0. If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter 1 to input a number and 0 to exit : ");
        // int n = sc.nextInt();
        // if (n==1) {
        //     do {
        //         System.out.print("Enter the marks of the student : ");
        //         int marks = sc.nextInt();
        //         if (marks>=90 && marks<=100){
        //             System.out.println("This is good.");
        //         }
        //         else if (marks>=60 && marks<=89){
        //             System.out.println("This is also good.");
        //         }
        //         else if (marks>=0 && marks<=59){
        //             System.out.println("You could do better, keep going..");
        //         }
        //         System.out.print("Enter 1 to continue and 0 to exit.. ");
        //         n = sc.nextInt();
        //     } while (n==1);
        // }




        // Print if a number n is prime or not (Input n from the user).

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = sc.nextInt();
        // boolean isPrime = true;
        // if (num==1) {
        //     System.out.println("This is neither prime nor composite.");
        // }
        // else if (num>1){
        //     for (int i = 2; i<=num/2; i++){
        //         if (num%i==0){
        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if (isPrime){
        //         System.out.println("This is a prime number.");
        //     }
        //     else{
        //         System.out.println("This is not a prime number.");
        //     }
        // }
        // else{
        //     System.out.println("This is 0 or negative number.");
        // }




        //Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	    // 1 : + (Addition) a + b
        // 2 : - (Subtraction) a - b
        // 3 : * (Multiplication) a * b
        // 4 : / (Division) a / b
        // 5 : % (Modulo or remainder) a % b
        // Calculate the result according to the operation given and display it to the user.

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter two numbers : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulo or remainder");
        // System.out.print("Enter your choice : ");
        // int n = sc.nextInt();
        // switch (n) {
        //     case 1:
        //         System.out.println(a+b);
        //         break;
        //     case 2:
        //         System.out.println(a-b);
        //         break;
        //     case 3:
        //         System.out.println(a*b);
        //         break;
        //     case 4:
        //         System.out.println(a/b);
        //         break;
        //     case 5:
        //         System.out.println(a%b);
        //         break;
        //     default:
        //         break;
        // }




        //Ask the user to enter the number of the month & print the name of the month. For eg - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number : ");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Wrong month entry ..");
                break;
        }
    }
}
