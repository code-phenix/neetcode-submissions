class Solution {
    // 0,1,2,3,4,5,6,7
    // [1,7,2,5,4,7,3,6]
    // i j
    public int maxArea(int[] heights) {
        int start = 0, end = heights.length - 1;
        int res = 0;
        while (start < end) {
            int val = (end - start) * (Math.min(heights[start], heights[end]));
            res = Math.max(res, val);
            if (heights[start] < heights[end])
                start++;
            else
                end--;
        }
        return res;
    }
}
