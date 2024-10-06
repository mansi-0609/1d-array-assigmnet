public class p15 {
    public static void main(String[] args) {
        int[] A = {1, 0, 0, 1, 0, 1, 1}; // Input array
        int n = A.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < n; j++) {
                if (A[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
                if (zeros == ones) {
                    count++; // Found a subarray
                }
            }
        }

        System.out.println(count); // Output the result
    }
}
