public class p10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Input array
        int N = arr.length;
        int last = arr[N - 1]; // Store the last element

        // Shift all elements to the right
        for (int i = N - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last; // Place last element at the front

        for (int num : arr) {
            System.out.print(num + " "); // Output the rotated array
        }
    }
}
