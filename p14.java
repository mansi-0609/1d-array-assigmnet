public class p14 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2}; // Input array
        int N = arr.length;
        int firstNonRepeating = 0;

        for (int i = 0; i < N; i++) {
            boolean isRepeating = false;
            for (int j = 0; j < N; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isRepeating = true; // Found repeating
                    break;
                }
            }
            if (!isRepeating) {
                firstNonRepeating = arr[i]; // Found non-repeating
                break;
            }
        }

        System.out.println(firstNonRepeating); // Output the result
    }
}
