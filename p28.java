public class p28 {
    public static void main(String[] args) {
        int[] P = {10, 20, 30, 40, 50}; // Input array
        int VAL = 30; // Value to search
        boolean found = false;

        for (int i = 0; i < P.length; i++) {
            if (P[i] == VAL) {
                found = true; // Element found
                break;
            }
        }

        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
