public class EulerPhi {
    
    
    // Function to calculate phi(n)
    static int phi(int n) {
        int result = n;   // Start with n
        int num = n;      // Copy of n for factorization
        
        // Check all possible prime factors up to √n
        for (int p = 2; p * p <= num; p++) {
            if (num % p == 0) {   // p is a prime factor
                // Remove all factors of p
                while (num % p == 0) {
                    num /= p;
                }
                // Apply formula: result -= result / p
                result -= result / p;
            }
        }
        
        // If num is still > 1, then num is prime
        if (num > 1) {
            result -= result / num;
        }
        
        return result;
    }
    
    // Main function to test
    public static void main(String[] args) {
        System.out.println("phi(9) = " + phi(9));    // 6
        System.out.println("phi(36) = " + phi(36));  // 12
        System.out.println("phi(10) = " + phi(10));  // 4
        System.out.println("phi(1) = " + phi(1));    // 1
    }
}


