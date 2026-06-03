import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        // code here
        int ans = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum-k)){
                ans = Math.max(ans, i - map.get(sum-k));
            }
            map.putIfAbsent(sum, i);
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, -10};
        int k = 15;
        System.out.println(longestSubarray(arr, k));
    }
}
