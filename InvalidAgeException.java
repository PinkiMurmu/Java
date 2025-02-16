// public class StringIndexOutOfIndexExample {
//     public static void main(String[] args) {
//         String str = "Hello, world!";
        
//         // Attempting to access an invalid index (index 20, which is out of bounds)
//         try {
//             char ch = str.charAt(20);  // This will throw StringIndexOutOfBoundsException
//         } catch (StringIndexOutOfBoundsException e) {
//             System.out.println("Caught exception: " + e);
//         }
//     }
// }

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        System.out.println(msg);
    }
}

class test {
    public static void main(String args[]) {
        try {
            vote(20);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible for voting");
        } else {
            System.out.println("Eligible for voting");
        }
    }
}