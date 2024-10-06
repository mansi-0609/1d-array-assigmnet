public class p21{
    public static void main(String[] args) {
        int[] A = {8, 3, 1, 2}; // Input array
        int N = A.length;
        
        int maxSum = 0, currentSum = 0;
        
        for (int i = 0; i < N; i++) {
            currentSum += i * A[i]; // Calculate the initial configuration sum
        }
        
        maxSum = currentSum;

        for (int i = 1; i < N; i++) {
            currentSum = currentSum - (A[N - i] * (N - 1)) + (A[N - i] * 0); // Rotate the array
            maxSum = Math.max(maxSum, currentSum); // Update maximum sum
        }

        System.out.println(maxSum); // Output the result
    }
}
