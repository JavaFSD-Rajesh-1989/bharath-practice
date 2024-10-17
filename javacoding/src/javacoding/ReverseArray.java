package javacoding;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    // Rotates the array to the right by the given order using the reverse technique
    public static void rotate(int[] arr, int order) {
        if (arr == null || arr.length == 0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        // If the order is greater than the length of the array, calculate the effective rotations
        if (order > arr.length) {
            order = order % arr.length;
        }

        // Length of the first part to be reversed
        int a = arr.length - order;

        // Reverse the first part
        reverse(arr, 0, a - 1);

        // Reverse the second part
        reverse(arr, a, arr.length - 1);

        // Reverse the entire array
        reverse(arr, 0, arr.length - 1);
    }

    // Helper method to reverse elements in an array between two indices
    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1) {
            return; // Handle cases with null or a single element
        }

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Main method to test the rotate method with user inputs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array size from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create the array and take user input for its elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get the rotation order from the user
        System.out.print("Enter the number of rotations: ");
        int order = scanner.nextInt();

        // Display the original array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Rotate the array
        rotate(arr, order);

        // Display the rotated array
        System.out.println("Rotated array: " + Arrays.toString(arr));

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}