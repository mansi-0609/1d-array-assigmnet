public class p26 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 40, 15}; // Input array
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest
            }
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }
}
