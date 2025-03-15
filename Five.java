// Reverse the left and right numbers like
// You must use only a loop
// input  9
// output 4 3 2 1 5 9 8 7 6

// input 13
// output 6 5 4 3 2 1 7 13 12 11 10 9 8

import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();  // Close scanner to avoid resource leaks
        
        int mid = n / 2;  // Calculate the middle point

        // Use one loop to handle all parts: left side, middle, and right side
        for (int i = 1; i <= n; i++) {
            if (i <= mid) {
                // Print the left side in reverse (mid to 1)
                System.out.print((mid - i + 1) + " ");
            } else if (i == mid + 1) {
                // Print the middle number (only once)
                System.out.print((mid + 1) + " ");
            } else {
                // Print the right side in reverse order (n to mid + 2)
                System.out.print((n - i + mid + 1) + " ");
            }
        }
    }
}
