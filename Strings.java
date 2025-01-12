import java.util.*;

public class Strings {
    public static void main(String[] args){

        //Strings are immutable


        // String firstName = "Tony";
        // String lastName = "Stark";
        // String fullName = firstName +"@"+ lastName; //@ will get deleted from the memory after execution of this line .
        // System.out.println(fullName);
        // System.out.println(fullName.length());

        //Printing all the characters
        // for (int i = 0; i<fullName.length(); i++){
        //     System.out.print(fullName.charAt(i)+" "); //In array we used arrayName[i]
        // }


        
        //Reversing a string

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string : ");
        // String a = sc.next();
        // String rev = "";

        // for (int i = a.length()-1; i>=0; i--){
        //     rev += a.charAt(i);
        // }
        // System.out.println(rev);



        //Comparing two strings

        // String name1 = "Tony";
        // String name2 = "Tony";

        //compareTo function does three things
        //1 s1 > s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1 < s2 : -ve value

        // if (name1.compareTo(name2)==0){ // You also can use equals in place of compareTo
        //     System.out.println("Strings are equal .");
        // }
        // else{
        //     System.out.println("Strings are not equal .");
        // }


        //Substring

        // String sentence = "My name is Tony";
        // String name = sentence.substring(11);
        // System.out.println(name);


        //Parsint(Changes a string of integers to a integer)

        // String str = "123";
        // int number = Integer.parseInt(str);
        // System.out.println(number);
        
        //toString(Changes an integer to a string)

    //     int num = 1234;
    //     String str1 = Integer.toString(num);
    //     System.out.println(str1.length());


    // Questions
    //1 Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter size of the array : ");
    // int size = sc.nextInt();
    // String arr[] = new String[size];
    // System.out.print("Enter "+size+" string elements : ");

    // int total = 0;
    // for (int i = 0; i<size; i++){
    //     arr[i] = sc.next();
    //     total = total + arr[i].length();
    // }
    // System.out.println(total);


    //2 Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
    // Example : original = "eabcdef" result = "iabcdif"
    // original = "xyz" result = "xyz"

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a string : ");
    // String a = sc.next();
    // String result = "";

    // for (int i = 0; i<a.length(); i++){
    //     if (a.charAt(i)=='e'){
    //         result += 'i';
    //     }
    //     else{
    //         result += a.charAt(i);
    //     }
    // }
    // System.out.println(result);
    


    // 3. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
    // Example : email = "apnaCollegeJava@gmail.com" ; username = "apnaCollegeJava"
    //email  = "helloWorld123@gmail.com" ; username = "helloWorld123"

    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter an email : ");
    // String email = sc.next();
    // String user = "";

    // System.out.print("The username is : ");
    // for (int i = 0; i<email.length(); i++){
    //     if (email.charAt(i)=='@'){
    //         break;
    //     }
    //     else{
    //         user += email.charAt(i);
    //     }
    // }
    // System.out.print(user);


    

    //String Builder



    // StringBuilder sb = new StringBuilder("Tony");
    // System.out.println(sb);

    //char at index 0

    // System.out.println(sb.charAt(0));


    //set char at index 0 

    // sb.setCharAt(0, 'P');
    // System.out.println(sb);


    //insert a character

    // sb.insert(0, 'O');
    // System.out.println(sb);
    // sb.insert(2, 'n');
    // System.out.println(sb);


    // Delete the extra 'n' we inserted

    // sb.delete(2, 3);
    // System.out.println(sb);


    //Append

    // StringBuilder sb = new StringBuilder("h");
    // sb.append("e");
    // sb.append("l");
    // sb.append("l");
    // sb.append("o");
    // System.out.println(sb.length());



    //Reversing a string with the help of stringbuilder

    StringBuilder sb = new StringBuilder("hello");
    
    for (int i = 0; i<sb.length()/2; i++){
        int front = i;
        int back = sb.length() - 1 - i;

        char frontChar = sb.charAt(front);
        char backChar = sb.charAt(back);

        sb.setCharAt(front, backChar); //It set the value in the given index .
        sb.setCharAt(back, frontChar);
    }
    System.out.println(sb); 
    // Time complexity of this code is O(n/2) .

    }
}
