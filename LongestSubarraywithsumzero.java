import java.util.HashMap;

public class LongestSubarraywithsumzero {
    public static int maxLen(int[] A, int n){
        int max = 0, sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            sum += A[i];

            if(sum == 0){
                max = i+1;
            } else if(map.containsKey(sum)){
                max = Math.max(max, i- map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = new int[]{9, -3, 3, -1, 6, -5};
        // compute size
        int n = A.length;
        System.out.println(maxLen(A, n));
    }
}
