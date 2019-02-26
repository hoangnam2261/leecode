public class RotateArray {
    //TODO NNG find another solution with O(1) for both the time complexity and extra space
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k > length) {
            k = k % length;
        }
        if (k > 0) {
            int[] copyArray = new int[length];
            System.arraycopy(nums, 0, copyArray, 0, length);
            for (int i = 0; i < length; i ++) {
                int newIndex = i + k >= length ? (i + k) - length : i + k;
                nums[newIndex] = copyArray[i];
            }
        }
    }
}
