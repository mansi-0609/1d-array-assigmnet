public class p7 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 7, 5}; // Input array
        int N = 5; // Size of array
        int S = 12; // Given sum
        int start = 0, end = -1, currentSum = 0;

        for (int i = 0; i < N; i++) {
            currentSum += A[i]; // Add current element to sum
            
            while (currentSum > S && start <= i) {
                currentSum -= A[start]; // Remove elements from start
                start++;
            }

            if (currentSum == S) {
                end = i; // Found the end index
                break;
            }
        }

        if (end != -1) {
            System.out.println((start + 1) + " " + (end + 1)); // Output positions
        } else {
            System.out.println("No subarray found");
        }
    }
}
