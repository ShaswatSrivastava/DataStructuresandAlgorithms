package com.Shaswat;

public class MountainArray {
    public static void main(String[] args) {

    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in des part of array
                //this may be ans, but look at left
                //this is why end != mid - 1;
                end = mid;
            } else {
                //you are in asc part of array
                start = mid + 1;// because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end pointing to the largest number because of the 2 checks above 3
        // start and end always trying to find max element in the above 2 checks
        //hence when they are pointing to just one element, that is the max one that checks say
        return start;
    }
}
