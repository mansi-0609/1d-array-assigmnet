public class p6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2, 1, 0, 2}; // Input array
        int N = arr.length;
        int low = 0, mid = 0, high = N - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap low and mid
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // Swap mid and high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        for (int num : arr) {
            System.out.print(num + " "); // Output sorted array
        }
    }
}

