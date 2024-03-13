/**
 * @Author：Henry Wan
 * @Package：contest
 * @Project：com.fight.pre01
 * @Date：2024/3/13 17:49
 * @Filename：LC42_Henry
 */
public class LC42_Henry {
    public static void main(String[] args) {
        System.out.println(new Solution().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}

class Solution {
    /*
     * 将每个格子视为一个桶，雨水只会从左右两侧
     * 桶边界短的一次流出
     * */
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n]; // 记录每个小桶左侧最高的桶位置，因为小桶的水不会从最高的桶之外流出
        int[] right = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) left[i] = height[i]; // 处理边界，第一个桶左侧
            else
                left[i] = Math.max(left[i - 1], height[i]);

        }
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) right[i] = height[i];
            else right[i] = Math.max(right[i + 1], height[i]);
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (Math.min(left[i], right[i]) - height[i]);
        }
        return ans;
    }
}