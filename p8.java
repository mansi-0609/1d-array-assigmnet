public class p8 {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6}; // Input array
        int N = arr.length;
        int[] result = new int[N];
        int posIndex = 0;

        // First, copy all positive numbers
        for (int i = 0; i < N; i++) {
            if (arr[i] >= 0) {
                result[posIndex++] = arr[i];
            }
        }

        // Then, copy all negative numbers
        for (int i = 0; i < N; i++) {
            if (arr[i] < 0) {
                result[posIndex++] = arr[i];
            }
        }

        for (int num : result) {
            System.out.print(num + " "); // Output the rearranged array
        }
    }
}
