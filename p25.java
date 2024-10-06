public class p25 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Input array
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i]; // Swap elements
            arr[n - 1 - i] = temp;
        }

        System.out.println("Reversed array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
