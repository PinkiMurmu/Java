import java.util.*;
class HelloWorld{
    public static void main(String args[]) {
    
      //Butterfly Pattern
        // int n = 4;

        //Upper half
        // for (int i = 1; i<=n; i++){
            
            //Upper left half
            // for (int j = 1; j<=i; j++){
            //     System.out.print("*");
            // }
            // Spaces
            // int space = 2 * (n-i);
            // for (int j = 1; j<=space; j++){
            //     System.out.print(" ");
            // }

            // //Upper right half
            // for (int j = 1; j<=i; j++){
            //     System.out.print("*");
            // }
            // System.out.println();
        // }

        //Lower half
        // for (int i = n; i>=1; i--){
            
            //Lower left half
        //     for (int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     //Spaces
        //     int space = 2*(n-i);
        //     for (int j = 1; j<=space; j++){
        //         System.out.print(" ");
        //     }

        //     //Lower right half
        //     for (int j = 1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
        /*Print Rhombus
         *     *****
         *    *****
         *   *****
         *  *****
         * *****
         */

        // int n = 5;
        // for(int i = 1;i<=n; i++){
        //     for (int j = 1; j<=(n-i); j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<=n; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Print number pyramid
        // int n = 5;
        // for (int i = 1; i<=n; i++){
        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j<=i; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        //Palindromic number Pyramid
        // int n = 5;
        // for (int i = 1; i<=n; i++){
        //     for (int j = 1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for (int j = i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     for (int j = 2; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        
        //Diamond Pattern
        int n = 4; 
        for (int i = 1; i<=n; i++){
            //Upper half
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for (int j = 2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--){
            //Lower half
            for (int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            for (int j = 2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
} 
