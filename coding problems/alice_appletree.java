// Imagine we have an apple tree centered at the origin (0,0) in a coordinate plane.

// The "area" where apples are placed forms four rectangles around the center, with the vertices at (r,r), (r,-r), (-r,r), and (-r,-r).

// Each of these rectangles has size r * (r+1).

// We then:

// Merge two blue matrices (apple distributions) together so that each tile now contains r + r + 1 apples.

// Merge two green matrices in the same way.

// The total apples are calculated using:

// Total apples
// =
// 𝑟
// 3
// ×
// 4
// +
// 𝑟
// 2
// ×
// 6
// +
// 𝑟
// ×
// 2
// Total apples=r
// 3
// ×4+r
// 2
// ×6+r×2

// (where r is a positive integer).

// Finally, the binary search part likely means:

// We are given a target number of apples N.

// We must find the smallest r such that total apples ≥ N.

// Approach 1 – Direct Iteration (Brute Force)

// Start with r = 1, compute apples using the formula, keep increasing r until apples ≥ N.

// Time complexity: O(r) (can be slow if N is large).

// Space complexity: O(1).

import java.util.Scanner;

public class alice_appletree {
    public static int totalApplesa(int r){
        return 4*r*r*r+6*r*r+2*r;

    }
    public static int find(int n){
        int r=0;
        while(totalApplesa(r)<=n){
            r++;
        }
        return r;
    }

    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("minimum r-"+find(n));
           
        }
    
}
