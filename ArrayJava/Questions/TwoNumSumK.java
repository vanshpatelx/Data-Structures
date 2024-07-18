// Time : O(N * N)
// Space : O(1)
public class TwoNumSumK {
        public static int[] findSum(int[] arr, int n) {
            for(int i = 0; i < arr.length - 1; i++) {
                for(int j = i + 1; j < arr.length; j++) {
                    if(arr[i] + arr[j] == n) {
                        return new int[]{arr[i], arr[j]};
                    }
                }
            }
            return new int[]{-1, -1}; // No such pair found
        }
    
}
