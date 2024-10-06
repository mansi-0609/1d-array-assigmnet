public class p13 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5}; // Input array
        int N = arr.length;
        int firstRepeating = -1;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    firstRepeating = arr[i]; // Found first repeating
                    break;
                }
            }
            if (firstRepeating != -1) {
                break; // Stop if found
            }
        }

        System.out.println(firstRepeating); // Output the result
    }
}
