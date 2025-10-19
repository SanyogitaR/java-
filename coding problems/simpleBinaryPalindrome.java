import java.util.*;

public class SimpleBinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        String binary = Integer.toBinaryString(n);   // Step 1: Convert to binary
        String reverse = new StringBuilder(binary).reverse().toString(); // Step 2: Reverse it
        
        if (binary.equals(reverse))  // Step 3: Compare
            System.out.println(n + " → Binary: " + binary + " is a Palindrome");
        else
            System.out.println(n + " → Binary: " + binary + " is NOT a Palindrome");
    }
}
