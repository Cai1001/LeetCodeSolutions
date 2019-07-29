package solutions;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/*
 * @decription:
 * 1. Return all non-negative integers of length N such that the absolute
 * difference between every two consecutive digits is K.
 * 2. Note that every number in the answer must not have leading zeros except for
 * the number 0 itself. For example, 01 has one leading zero and is invalid, but 0 is valid.
 * You may return the answer in any order.
 * @create 2019-07-29
 */
public class Solution967 {

    public int[] numsSameConsecDiff(int N, int K) {
        Queue<Integer> res = new LinkedList<Integer>();
        if (N == 1){
            res.add(0);
        }
        // 初始化 unseen queue
        for(int i = 1; i <= 9; ++i){
            res.add(i);
        }
        // 逐层遍历
        while (--N != 0){
            bfs(N, K, res);
        }

        int size = res.size();
        final int []ans = new int[size];
        for (int i = 0; i < size; ++i){
            ans[i] = res.poll();
        }
        return ans;

    }

    public int[] numsSameConsecDiffWithDfs(int N, int K) {
        Queue<Integer> res = new LinkedList<Integer>();
        if (N == 1){
            res.add(0);
        }
        // 初始化 unseen queue
        for(int i = 1; i <= 9; ++i){
            dfs(N - 1, K, i, res);
        }

        int size = res.size();
        final int []ans = new int[size];
        for (int i = 0; i < size; ++i){
            ans[i] = res.poll();
        }
        return ans;

    }



    private void  bfs (int N, int K, Queue<Integer> ans) {
        int size = ans.size();
        while(size-- != 0){
            Integer head = ans.poll();
            Integer m = head % 10;
            if ( m + K <= 9){
                ans.add( head * 10 + m + K);
            }
            if (m - K >= 0 && K!=0){
                ans.add( head * 10 + m - K);
            }
        }
    }

    private void dfs(int N, int K, int cur, Queue<Integer> ans){
        if (N == 0){
            ans.add(cur);
            return;
        }
        int m = cur % 10;
        if (m + K <= 9){
            dfs(N - 1, K, cur * 10 + m + K, ans);
        }
        if (m - K >= 0 && K != 0){
            dfs(N - 1, K, cur * 10 + m -K, ans);
        }
    }


    public static void main(String[] args) {
        Solution967 solution = new Solution967();
        int[] ans = solution.numsSameConsecDiffWithDfs(3,7);
        System.out.println(ans);
    }



    }
