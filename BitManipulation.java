import java.util.*;
public class BitManipulation {
    public static void main(String []args){

        //Bit manipulation


        //Get bit

        // int n = 5;  //0101
        // int pos = 1; 
        // int bitMask = 1<<pos;

        // if ((bitMask & n )==0){
        //     System.out.println("Bit was zero.");
        // }
        // else{
        //     System.out.println("Bit was one.");
        // }




        //Set bit (It will set the bit to 1)

        // int n = 5;
        // int pos = 1;
        // int bitMask = 1<<pos;

        // int newNumber = bitMask | n;
        // System.out.println(newNumber);



        //Clear bit (It will clear the bit or set it to 0)

        // int n = 5; 
        // int pos = 2;
        // int bitMask = 1<<pos;

        // int newNumber = (~bitMask & n);
        // System.out.println(newNumber);
        


        // Update Bit

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt(); // If oper=1 : set; oper=0 : clear
        int n = 5; 
        int pos = 1;
        int bitMask = 1<<pos;

        if (oper == 1) {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else {
            int newNumber = ((~bitMask) & n);
            System.out.println(newNumber);
        }
        
         
    }
}
