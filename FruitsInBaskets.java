import java.util.HashMap;

public class FruitsInBaskets {
    public static int totalFruits(int[] fruits){
        int ans = 0;

//        for(int l=0; l<fruits.length; l++){
//            HashMap<Integer, Integer> map = new HashMap<>();
//            int count = 0;
//
//            for(int r=0; r<fruits.length; r++){
//                map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
//                if(map.size() > 2){
//                    break;
//                }
//                count++;
//            }
//            ans = Math.max(ans, count);
//        }
//        return ans;


        //optimize code
        int l = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int r=0; r<fruits.length; r++){

            map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            while (map.size() > 2){
                map.put(fruits[l], map.get(fruits[l])-1);

                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
            }
            ans = Math.max(ans, r-l+1);

        }
        return ans;

    }




    public static void main(String[] args) {
        int[] fruits = {1,2,1};
        System.out.println(totalFruits(fruits));
    }
}
