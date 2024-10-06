public class p31 {
    public static void main(String[] args) {
        int[] X = {9, 7, 5, 3}; // Descending
        int[] Y = {8, 6, 4, 2}; // Descending
        int M = X.length;
        int N = Y.length;
        int[] Z = new int[M + N];
        
        // Merging arrays X and Y into Z
        int i = 0, j = 0, k = 0;

        while (i < M && j < N) {
            if (X[i] >= Y[j]) {
                Z[k++] = X[i++];
            } else {
                Z[k++] = Y[j++];
            }
        }
        
        // Copy remaining elements of X
        while (i < M) {
            Z[k++] = X[i++];
        }
        
        // Copy remaining elements of Y
        while (j < N) {
            Z[k++] = Y[j++];
        }

        System.out.println("Merged array Z in descending order:");
        for (int num : Z) {
            System.out.print(num + " ");
        }
    }
}

