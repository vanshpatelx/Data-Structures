// Time : O(m + n)
// Space : O(m + n)
import java.util.ArrayList;

public class MergeTwoArray {
    public static ArrayList<Integer> mergeArrays(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        ArrayList<Integer> x = new ArrayList<>();
        int len = nums1.size() + nums2.size();
        int ptr1 = 0;
        int ptr2 = 0;

        for (int i = 0; i < len; i++) {
            if (ptr1 >= nums1.size()) {
                x.add(nums2.get(ptr2));
                ptr2++;
            } else if (ptr2 >= nums2.size()) {
                x.add(nums1.get(ptr1));
                ptr1++;
            } else if (nums1.get(ptr1) < nums2.get(ptr2)) {
                x.add(nums1.get(ptr1));
                ptr1++;
            } else {
                x.add(nums2.get(ptr2));
                ptr2++;
            }
        }
        return x;
    }
}
