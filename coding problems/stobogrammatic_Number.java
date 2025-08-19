//🔹 Problem Statement

//A strobogrammatic number is a number that looks the same when rotated 180 degrees (upside down).

// 🔹 Approach

// Use a mapping of valid strobogrammatic digit pairs:

// 0 ↔ 0, 1 ↔ 1, 6 ↔ 9, 8 ↔ 8, 9 ↔ 6.

// Traverse the number from both ends towards the middle.

// For each pair of digits:

// Check if both are in the mapping.

// Ensure they map correctly (e.g., left digit = 6 → right digit must be 9).

// If all pairs match, the number is strobogrammatic. Otherwise, it’s not.

// ⏱ Time Complexity: O(n) (where n = length of number)
// 💾 Space Complexity: O(1)


// import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;
import java.util.*; 

public class stobogrammatic_Number {
    public static boolean isstobo(String num){
        Map<Character,Character> map=new HashMap<>();
       
        map.put('6', '9');
        map.put('9', '6');
        map.put('1', '1');
        map.put('0', '0');
        map.put('8', '8');

        // int l=0;
        // int r=n-1;  here n is the length of num string
        int left = 0, right = num.length() - 1;

        while(left<=right){
            char leftchar=num.charAt(left);
            char rightchar=num.charAt(right);
            if(!map.containsKey(leftchar)){
                return false;
            }
            if(map.get(leftchar)!=rightchar){
                return false;
            }
             // If left digit is not in map or doesn't match right digit → false
            // if (!map.containsKey(l) || map.get(l) != r) {
            //     return false;
            // }
            left++;
            right--;

        }
        return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
          if (isstobo(num)) {
            System.out.println(num + " is Strobogrammatic!");
        } else {
            System.out.println(num + " is NOT Strobogrammatic.");
        }
    
        
    }
}