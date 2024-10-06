public class p32 {
    public static void main(String[] args) {
        int[] A = {3, 2, 1, 7, 6, 3};
        int[] B = {9, 3, 5, 6, 2, 8, 10};
        int M = A.length;
        int N = B.length;
        int[] C = new int[M + N];
        int index = 0;

        // Copy even numbers from A
        for (int i = 0; i < M; i++) {
            if (A[i] % 2 == 0) {
                C[index++] = A[i];
            }
        }
        
        // Copy odd numbers from A in reverse order
        for (int i = M - 1; i >= 0; i--) {
            if (A[i] % 2 != 0) {
                C[index++] = A[i];
            }
        }
        
        // Copy even numbers from B
        for (int i = 0; i < N; i++) {
            if (B[i] % 2 == 0) {
                C[index++] = B[i];
            }
        }
        
        // Copy odd numbers from B in reverse order
        for (int i = N - 1; i >= 0; i--) {
            if (B[i] % 2 != 0) {
                C[index++] = B[i];
            }
        }

        System.out.println("Resultant array C:");
        for (int num : C) {
            System.out.print(num + " ");
        }
    }
}
