// Time : O(N)
// Space : O(1)
public class RemoveEvenIntegers {
    public static int[] removeEven(int[] arr) {
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0) count++;
        }
        int[] result = new int[count];
        int x = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                result[x++] = arr[i];
            }
        }
        // Replace this placeholder return statement with your code
        return result;

    }
}
