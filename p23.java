public class p23 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40}; // Input array
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Calculate sum
        }

        double average = (double) sum / arr.length; // Calculate average

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
