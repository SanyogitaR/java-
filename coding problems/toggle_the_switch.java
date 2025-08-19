
// Problem statement
// There are 100 closed doors. A cage holding 100 monkeys is placed nearby. Every monkey that visits a door either opens a closed door or closes an open door. The first monkey that is let out of the cage visits and opens all the hundred doors. The second monkey that is released visits doors of the order 2, 4, 6, 8, 10…. . The third monkey released visits doors 3, 6, 9,12, 15……, and so on.
// After all the monkeys from the cage are released and have opened or closed at least one door, how many doors are left open?
// Approach
// Let us understand how to solve this problem by observing the activity of doors 13, 50, and 16. 13 is a prime number, 50 is a composite number, and 16 is a perfect square.

import java.util.*; 
public class toggle_the_switch {
   
        public static void main(String[] args) {
            int n=100;
            int count= (int) Math.sqrt(n);
            System.out.println("total open doors"+count);
            System.out.println("the doors are-");
            for(int i=1; i<=count; i++){
                System.out.println(i*i+ " ");
            }
        }
} 

