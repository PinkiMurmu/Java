import java.util.*;

class HelloWorld{
    public static void main(String args[]) {
        // System.out.println("Hello World");

        //String concatenation

        // String name1 = "Aman";
        // String name2 = "Akku";
        // String name3 = name1 + name2;
        // System.out.println(name3);

        //Print the character of the index given 

        // String name = "Aman";
        // System.out.println(name.charAt(0));
        // System.out.println(name.length());
        // String newName = name.replace('a', 'b');
        // System.out.println(newName);

        // String newName1 = "Aman and Akku";
        // System.out.println(newName1.substring(5, 8));

        // Array

        // int age = 30;
        // int physics = 97;
        // int chem = 98;
        // int eng = 95;

        // int[] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;

        // Another way of initializing an array
        // int[] marks={97,98,95};

        // System.out.println(marks[0]);
        // System.out.println(marks.length);

        // Arrays.sort(marks);
        // System.out.println(marks[0]);

        // 2D arrays

        // int[][] finalMarks={{97,98,95},{95,95,99}};
        // System.out.println(finalMarks[0][0]);

        //Casting

        // double price = 100.00;
        // double finalPrice = price + 18;

        // System.out.println(finalPrice);

        // int P = 100;
        // int fP =  P + (int)18.18;
        // System.out.println(fP);

        // int age=  30;
        // age = 31;
        // age = 32;
        // System.out.println(age);

        // final float PI = 3.14F;
        // PI = 4.12F;

        // System.out.println(Math.max(5,6));
        // System.out.println(Math.min(2,9));

        // System.out.println((int)(Math.random()*10)); //The value random returns is always less than 1 


        //HOW TO TAKE INPUT
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Input your age: ");
        // Float age = sc.nextFloat();
        // System.out.println(age);

        //Exercise
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a+b;
        // System.out.println(sum);

        //Conditional statements 
        //If-else
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age>=18){
        //     System.out.println("Adult");
        // }
        // else{
        //     System.out.println("Not adult");
        // }

        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();

        // if (num%2==0){
        //     System.out.println("It is even");
        // }
        // else{
        //     System.out.println("It is odd");
        // }


        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a==b){
        //     System.out.println("Equal");
        // }
        // else if(a>b){
        //     System.out.println(" a is Greater");
        // }
        // else{
        //     System.out.println("a is Lesser");
        // }

        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // switch (button) {
        //     case 1:
        //         System.out.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namaste");
        //         break;
        //     case 3:
        //         System.out.println("Bonjour");
        //         break;
        //     default:
        //         System.out.println("Wrong input");
        //         break;
        // }

        //For loop
        // for(int counter = 0;counter<100; counter++){
        //     System.out.println(counter+" Hello World");
        // }

        //While Loop
        // int i = 0;
        // while(i<11){
        //     System.out.println(i);
        //     i++;
        // }

        //Do-while Loop
        // int i = 0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<11);

        //Qeustions
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number: ");
        // int n = sc.nextInt();
        // int sum = 0;

        // for(int i=1; i<=n; i++){
        //     sum = sum +i;
        // }
        // System.out.println("Sum of first "+n+" natural numbers is : "+sum);

        // for(int i = 1; i<=10; i++){
        //     System.out.println(n+"*"+i+"="+n*i);
        // }

        //Patterns printing
        // int n = 4;
        // int m = 5;
        // for(int i = 0; i<n; i++){
        //     for(int j=0; j<m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //Hollow rectengle
        // for(int i = 1; i<=n; i++){
        //     for(int j= 1; j<=m; j++){
        //         if (i==1 || j==1 || i==n || j==m){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        //Half pyramid from left side
        // int n = 4;
        // for (int i= 1; i<=n; i++){
        //     for (int j=1;j<=i; j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //Numbers
        // int n = 5;
        // for (int i= 1; i<=n; i++){
        //     for (int j=1;j<=i; j++ ){
        //         System.out.print(j+" ");
        //     }
        //     System.out.print("\n");
        // }

        //Half pyramid from right side
        // for (int i = 1; i<=n; i++){
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Inverted half pyramid
        // for (int i= n; i>=1; i--){
        //     for (int j=i;j>=1; j-- ){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }
        
        //Inverted numbers
        // int n = 5;
        // for (int i= n; i>=1; i--){
        //     for (int j=1;j<=i; j++ ){
        //         System.out.print(j+" ");
        //     }
        //     System.out.print("\n");
        // }

        /*Print
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
        */
        // int n = 5;
        // int num = 1;
        // for (int i = 1; i<=n; i++){
        //     for (int j=1; j<=i; j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.println();
        // }

        /*Print
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */
        int n = 5;
        for (int i=0; i<=n; i++){
            for (int j = 1; j<=i; j++){
                if ((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }

    }
} 
