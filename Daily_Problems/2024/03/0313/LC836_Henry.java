
public class LC836_Henry {
    public static void main(String[] args) {
        System.out.println(new Solution().isRectangleOverlap(new int[]{0, 0, 2, 2}, new int[]{1, 1, 3, 3}));
    }
}
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int ax1 = rec1[0], ay1 = rec1[1], ax2 = rec1[2], ay2 = rec1[3];
        int bx1 = rec2[0], by1 = rec2[1], bx2 = rec2[2], by2 = rec2[3];
        int x1 = Math.max(ax1, bx1), x2 = Math.min(ax2, bx2);
        int y1 = Math.max(ay1, by1), y2 = Math.min(ay2, by2);
        return x2 > x1 && y2 > y1;
    }
}
