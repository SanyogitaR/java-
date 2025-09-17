
// 📌 Problem: Josephus Problem (Suicidal Game)

// Story version:

// Imagine n people standing in a circle (numbered 0 to n-1).

// Starting from person 0, we count k people (including the current one).

// The k-th person is removed (killed 😢).

// Then counting continues from the next person.

// This repeats until only one person survives.

// We want to find the position of the last survivor.

// 🔹 Example 1

// Input: n = 5, k = 2
// Circle: [0,1,2,3,4]

// Start at 0. Count 2 → Person 1 is removed.

// Now circle: [0,2,3,4]. Next start from 2.

// Count 2 → Person 3 is removed.

// Now circle: [0,2,4]. Next start from 4.

// Count 2 → Person 0 is removed.

// Now circle: [2,4]. Next start from 2.

// Count 2 → Person 4 is removed.

// 👉 Survivor = 2

// 🔹 Example 2

// Input: n = 7, k = 3
// Survivor = 3
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
    }
}


public class Josephus_trap {

    
    public static int josephus(int n, int k) {
        // Step 1: Create circular linked list of size n
        Node head = new Node(0);
        Node prev = head;
        for (int i = 1; i < n; i++) {
            Node newNode = new Node(i);
            prev.next = newNode;
            prev = newNode;
        }
        prev.next = head; // complete the circle
        
        // Step 2: Start eliminating
        Node curr = head;
        while (curr.next != curr) { // more than one node left
            // Move k-1 steps
            for (int i = 1; i < k - 1; i++) {
                curr = curr.next;
            }
            // Eliminate next node (k-th person)
            curr.next = curr.next.next;
            // Move to next starting point
            curr = curr.next;
        }
        
        return curr.data; // survivor
    }
    
    public static void main(String[] args) {
        System.out.println(josephus(5, 2)); // Output: 2
        System.out.println(josephus(7, 3)); // Output: 3
        System.out.println(josephus(10, 2)); // Output: 4
    }




    
}
