public class p24 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; // Input array

        if (arr.length > 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1]; // Swap first and last
            arr[arr.length - 1] = temp;
        }

        System.out.println("Array after swapping first and last elements:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

