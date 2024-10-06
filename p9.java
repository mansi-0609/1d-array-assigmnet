public class p9 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; // First array
        int[] b = {1, 2, 3}; // Second array
        int n = a.length;
        int m = b.length;
        
        int i = 0, j = 0;
        System.out.print("Union: ");
        
        // Finding Union
        while (i < n && j < m) {
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            if (a[i] < b[j]) {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i] > b[j]) {
                System.out.print(b[j] + " ");
                j++;
            } else {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        
        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) {
                System.out.print(a[i] + " ");
            }
            i++;
        }
        
        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {
                System.out.print(b[j] + " ");
            }
            j++;
        }

        System.out.println();
        
        // Reset indices for intersection
        i = 0; j = 0;
        System.out.print("Intersection: ");
        
        // Finding Intersection
        while (i < n && j < m) {
            if (a[i] == b[j]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
    }
}
