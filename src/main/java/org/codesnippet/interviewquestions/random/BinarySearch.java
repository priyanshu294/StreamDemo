package org.codesnippet.interviewquestions.random;

//Implement binary search
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 7, 9, 11, 15};
        System.out.println(binarySearch(nums, 11)); // Output: 4
    }
}
