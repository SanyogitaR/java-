public class Euclids {
    

    // Function to calculate GCD using recursion
    static int gcd(int a, int b) {
        if (b == 0) {
            return a; // base case: when second number is 0
        }
        return gcd(b, a % b); // recursive call
    }

    public static void main(String[] args) {
        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));

        // More examples
        System.out.println("GCD of 101 and 103 is: " + gcd(101, 103));
        System.out.println("GCD of 36 and 60 is: " + gcd(36, 60));
    }
}


