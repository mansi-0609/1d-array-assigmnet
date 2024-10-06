import java.util.HashSet;

public class p20 {
    public static void main(String[] args) {
        int[] a = {2, 6, 1, 9, 4, 5, 3}; // Input array
        int N = a.length;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(a[i]); // Add all elements to a set
        }

        int maxLength = 0;

        for (int i = 0; i < N; i++) {
            if (!set.contains(a[i] - 1)) { // Check if it is the start of a sequence
                int currentNum = a[i];
                int currentLength = 1;

                while (set.contains(currentNum + 1)) { // Count consecutive numbers
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength); // Update maximum length
            }
        }

        System.out.println(maxLength); // Output the result
    }
}
