import java.util.Scanner;

public class PROBLEM3 {

    public static boolean isPalindromic(String A) {
        StringBuilder rev = new StringBuilder(A).reverse(); // Reverses the user input
        return rev.toString().equals(A); // willcompare the reversed string to the previous string and will return
                                         // true otr false
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner obj

        System.out.print("Input: "); // inp from scanner
        String A = sc.nextLine(); // line sep
        System.out.println();

        boolean Palindrome = isPalindromic(A);

        if (Palindrome == true) {
            System.out.println("Output: True. It is a PALINDROME\n"); // print if true
        } else if (Palindrome == false) {
            System.out.print("Output: Not a PALINDROME\n"); // false print not a ""
        }
        sc.close(); // closed
    }
}
