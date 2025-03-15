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
		System.out.println("input");
        int n = scanner.nextInt();
        scanner.close();  // Close scanner to avoid resource leaks
        
        int mid = n / 2;  // Calculate the middle point

        for (int i = 1; i <= n; i++) {
            if (i <= mid) {
                System.out.print((mid - i + 1) + " ");  // Print left side in reverse
            } else {
                System.out.print((i + 1) + " ");  // Print right side normally
            }
        }
    }
}
