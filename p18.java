public class p18 {
    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, -2, 5}; // Input array
        int N = Arr.length;
        int maxSum = Arr[0], currentSum = Arr[0];

        for (int i = 1; i < N; i++) {
            currentSum = Math.max(Arr[i], currentSum + Arr[i]); // Update current sum
            maxSum = Math.max(maxSum, currentSum); // Update max sum
        }

        System.out.println(maxSum); // Output result
    }
}
