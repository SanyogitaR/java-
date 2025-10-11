public class SieveMain {
    public static void simpleSieve(int limit) {
        boolean[] prime = new boolean[limit + 1];  // Step 1: create boolean array
        for (int i = 2; i <= limit; i++) {
            prime[i] = true;  // assume all are prime initially
        }

        // Step 2 & 3: Mark multiples of each prime
        for (int p = 2; p * p <= limit; p++) {
            if (prime[p]) { // if still prime
                for (int i = p * p; i <= limit; i += p) { // mark all multiples as false
                    prime[i] = false;
                }
            }
        }

        // Step 4: print remaining primes
        for (int p = 2; p <= limit; p++) {
            if (prime[p]) {
                System.out.print(p + " ");
            }
        }
    }

    public static void main(String[] args) {
        simpleSieve(50);
    }
}
