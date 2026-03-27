package com.Shaswat;

//Leetcode 39

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//1st method
public class combinationsum {
//    Set<List<Integer>> s = new HashSet<>();
//    void getallcombinations(List<Integer> arr, int idx, int tar, List<List<Integer>> ans, List<Integer> combin){
//        if(idx == arr.size() || tar<0){
//            return;
//        }
//        if(tar == 0){
//            if (!s.contains(combin)) {
//                ans.add(new ArrayList<>(combin));
//                s.add(new ArrayList<>(combin));
//            }
//            return;
//        }
//
//        combin.add(arr.get(idx));
//        //single
//        getallcombinations(arr, idx+1, tar-arr.get(idx), ans, combin);
//        //multiple
//        getallcombinations(arr, idx, tar-arr.get(idx), ans, combin);
//        combin.remove(combin.size()-1);
//        //exclusion
//        getallcombinations(arr, idx+1, tar, ans, combin);
//    }
//    public List<List<Integer>> combinationSum(int[] candidates, int target) {
//        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> combin = new ArrayList<>();
//        List<Integer> arr = new ArrayList<>();
//
//        for (int num : candidates) arr.add(num);
//        getallcombinations(arr , 0 , target, ans, combin);
//
//        return ans;
//    }

    //2nd method
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null) {
            return null;
        }

        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, 0, target, new ArrayList<>(), result);

        return result;
    }
    

    public static void findCombinations(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                findCombinations(candidates, i, target - candidates[i], current, result);
                current.remove(new Integer(candidates[i]));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 5}, 8));
    }
}

