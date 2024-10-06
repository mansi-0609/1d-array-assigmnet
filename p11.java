public class p11 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1}; // Input array
        int N = 4; // Number of elements
        int K = 6; // Target sum
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == K) { // Check if the sum equals K
                    count++;
                }
            }
        }

        System.out.println(count); // Output the result
    }
}
