import java.util.Scanner;

public class Arrays {
    public static void main(String args[]){
        // int marks[] = new int[3];
        // int marks[] = {97,98,95};
        // marks[0] = 97; 
        // marks[1] = 98;
        // marks[2] = 95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.print("Enter the elements of the array : ");
        for (int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }



        //Check if an array is in sorted order or not

        boolean isAscending = true;
        for (int i = 0; i<numbers.length-1; i++){
            if(numbers[i]>numbers[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is in ascending order.");
        }
        else{
            System.out.println("The array is not in ascending order.");
        }



        //Find maximum and minimum number in an array of integers.

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // for (int i = 0; i<numbers.length; i++){
        //     if (numbers[i]<min){
        //         min = numbers[i];
        //     }
        //     if (numbers[i]>max) {
        //         max = numbers[i];
        //     }
        // }
        // System.out.println("Maximum number in the array is : "+max);
        // System.out.println("Minimum number in the array is : "+min);



        //Find a number x in an array 
        //Linear search

        // System.out.print("Which element you want to find : ");
        // int x = sc.nextInt();

        // for (int i = 0; i<size; i++){
        //     if (numbers[i]==x){
        //         System.out.print("The number x was at index "+i);
        //     }
        // }



        //Print the array elements

        // for (int i = 0; i<size; i++){
        //     System.out.print(numbers[i]+" ");
        // }
    }
}
