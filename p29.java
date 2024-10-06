public class p29 {
    public static void main(String[] args) {
        int[] AR = {2, 3, 4, 10, 40}; // Sorted array
        int target = 10; // Element to search
        int left = 0, right = AR.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (AR[mid] == target) {
                result = mid; // Target found
                break;
            }

            if (AR[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
