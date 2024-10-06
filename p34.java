public class p34{
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int result = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                result = i; // Target found
                break;
            }
        }

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

