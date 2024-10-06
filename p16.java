public class p16 {
    public static void main(String[] args) {
        int[] Arr = {9, 4, -2, -1, 5, 0, -5, -3, 2}; // Input array
        int N = Arr.length;
        int[] result = new int[N];
        int posIndex = 0, negIndex = 1;

        for (int i = 0; i < N; i++) {
            if (Arr[i] >= 0) {
                result[posIndex] = Arr[i];
                posIndex += 2;
            } else {
                result[negIndex] = Arr[i];
                negIndex += 2;
            }
        }

        System.out.println("Rearranged array:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
