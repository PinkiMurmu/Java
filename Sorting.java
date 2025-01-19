import java.util.*;
public class Sorting {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter "+size +" elements : ");
        for (int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        


        //Bubble sort
        //time complexity = O(n^2)
        
        // for (int i = 0; i<size-1; i++){
        //     for (int j = 0; j<size-i-1; j++){
        //         if (arr[j]>arr[j+1]) {
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
            
        // }
        // System.out.println("After sorting the array would be : ");
        // for (int i = 0; i<arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();



        //Selection sort
        //time complexity = O(n^2)
        
        // for (int i = 0; i<size-1; i++){
        //     int smallest = i;
        //     for (int j = i+1; j<size; j++){
        //         if (arr[smallest] > arr[j]){
        //             smallest = j;
        //         }
        //     }
        //     int temp = arr[smallest];
        //     arr[smallest] = arr[i];
        //     arr[i] = temp;
        // }

        // for (int i = 0; i<size; i++){
        //     System.out.print(arr[i]+" ");
        // }



        //Insertion sort
        //time complexity = O(n^2)

        for (int i = 1; i<size; i++){
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && current< arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }

        for (int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
