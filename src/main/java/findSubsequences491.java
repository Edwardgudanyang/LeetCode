package main.java;

import java.util.LinkedList;
import java.util.List;

public class findSubsequences491 {
        private static List<List<Integer>> res = new LinkedList<List<Integer>>();
        private static List<Integer> temp = new LinkedList<>();

        public static List<List<Integer>> findSubsequences(int[] nums) {
            if (nums == null) {
                return null;
            }
            dfs(0, Integer.MIN_VALUE, nums);
            return res;
        }

        private static void dfs(int curIndex, int preValue, int[] nums) {
            if (curIndex >= nums.length) {  // 遍历结束
                if (temp.size() >= 2) {
                    res.add(new LinkedList<>(temp));
                }
                return;
            }

            if (nums[curIndex] >= preValue) {   // 将当前元素加入，并向后遍历
                temp.add(nums[curIndex]);
                dfs(curIndex + 1, nums[curIndex], nums);
                temp.remove(temp.size() - 1);
            }
            if (nums[curIndex] != preValue) {   // 不遍历 重复元素
                dfs(curIndex + 1, preValue, nums);  // 将下一个元素加入，并向后遍历
            }
        }

        public static void main(String[] args) {
                int[] a={4,6,7,7};
            findSubsequences(a);
        }




}
