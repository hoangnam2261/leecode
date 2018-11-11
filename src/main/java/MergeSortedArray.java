public class MergeSortedArray {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int[] copy1 = new int[m + 1];
        int[] copy2 = new int[n + 1];
        System.arraycopy(nums1, 0, copy1, 0, m);
        System.arraycopy(nums2, 0, copy2, 0, n);
        copy1[m] = Integer.MAX_VALUE;
        copy2[n] = Integer.MAX_VALUE;
        int k = 0;
        int i = 0;
        int j = 0;
        while (k < (m + n)) {
            if (copy1[i] >= copy2[j]) {
                nums1[k] = copy2[j];
                j++;
            } else {
                nums1[k] = copy1[i];
                i++;
            }
            k++;
        }
        return nums1;
    }
}
