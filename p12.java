public class p12 {
    public static void main(String[] args) {
        int[] A = {1, 5, 10, 20, 40, 80}; // First array
        int[] B = {6, 7, 20, 80, 100}; // Second array
        int[] C = {3, 4, 15, 20, 30, 70, 80, 120}; // Third array
        int n1 = A.length, n2 = B.length, n3 = C.length;
        
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2 && k < n3) {
            if (A[i] == B[j] && B[j] == C[k]) {
                System.out.print(A[i] + " "); // Print common element
                i++; j++; k++; // Move all pointers
            } else if (A[i] < B[j]) {
                i++;
            } else if (B[j] < C[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
