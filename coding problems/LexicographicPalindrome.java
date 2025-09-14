// 1) Problem explained simply

// Input: a string s (like "aabbcc", "abc", "racecar").

// Output: the lexicographically smallest palindrome string that can be formed using all characters of s.

// If it’s not possible to form a palindrome, return "Not Possible".

// 👉 A palindrome is only possible if at most one character has an odd frequency.
// Example:

// "aabb" → possible → "abba".

// "abc" → not possible (all frequencies odd).

// 2) Approach

// Count frequency of each character (use an array of size 26 for lowercase letters).

// Check palindrome condition:

// At most one character can have an odd count.

// If more → Not possible.

// Build left half of palindrome:

// For each character from 'a' to 'z', add (freq[ch] / 2) copies to the left half string.

// Decide middle part:

// If there’s a character with odd frequency, that goes in the middle.

// Right half is just the reverse of left half.

// Concatenate → left + middle + reverse(left).

// 3) Algorithm (step by step, beginner-friendly)

// Create an array freq[26] to store frequency of characters.

// Loop through the string and fill freq.

// Count how many characters have odd frequency.

// If more than 1 → return "Not Possible".

// Create a StringBuilder left = "".

// For each character a to z:

// Append (freq[ch] / 2) copies into left.

// If there’s an odd frequency character → middle = that character. Else middle = "".

// right = reverse(left).

// Answer = left + middle + right.


public class LexicographicPalindrome {

    public static String smallestPalindrome(String s) {
        int[] freq = new int[26];

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Step 2: Check palindrome possibility
        int oddCount = 0;
        char oddChar = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 == 1) {
                oddCount++;
                oddChar = (char) (i + 'a');
            }
        }
        if (oddCount > 1) {
            return "Not Possible";
        }

        // Step 3: Build left half
        StringBuilder left = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / 2; j++) {
                left.append((char) (i + 'a'));
            }
        }

        // Step 4: Middle part (if odd char exists)
        String middle = (oddCount == 1) ? String.valueOf(oddChar) : "";

        // Step 5: Right half = reverse(left)
        String right = left.reverse().toString();

        // Step 6: Final palindrome
        return left.reverse().toString() + middle + right;
    }

    public static void main(String[] args) {
        System.out.println(smallestPalindrome("aabb"));     // abba
        System.out.println(smallestPalindrome("racecar"));  // racecar
        System.out.println(smallestPalindrome("abc"));      // Not Possible
        System.out.println(smallestPalindrome("aabbcc"));   // abccba
    }
}
