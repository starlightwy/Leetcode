package array;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = 0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){   //j=i+1!!!
                if(i!=j){
                    max = Math.max(Math.min(height[i], height[j]) * Math.abs(i-j), max);
                }
            }
        }
        return max;
    }

    public int solution(int[] height) {
        //每次只往里面移动较短的边计算
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }
}
