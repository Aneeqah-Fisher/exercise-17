import java.util.Scanner;

public class SortedListChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of elements and the elements themselves
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        int[] list = new int[n];

        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list[i] = scanner.nextInt();
        }

        // Check if the list is sorted and display the result
        System.out.println(isSorted(list) ?
                "The list is sorted in increasing order." :
                "The list is not sorted in increasing order."
        );

        scanner.close();
    }

    // Method to check if the list is sorted in increasing order
    public static boolean isSorted(int[] list) {
        for (int i = 1; i < list.length; i++) {
            if (list[i] < list[i - 1]) {
                return false; // Not sorted
            }
        }
        return true; // Sorted
    }
}