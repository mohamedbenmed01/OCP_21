import java.util.Arrays;

class Solution {
    public static int maxArea(int[] height) {
        System.out.println(Arrays.toString(height));
        int maxArea = 0;
        int intialLeft = 0, right = height.length - 1;
        while (intialLeft < right) {
            int left = intialLeft;
            while (left < right) {
                int minHeight1 = Math.min(height[left], height[right]);
                int currentArea = minHeight1 * (right - left);
                int minHeight2 = Math.min(height[left + 1], height[right]);
                int currentAreaRight = minHeight2 * (right - (left + 1));
                int minHeight3 = Math.min(height[left], height[right - 1]);
                int currentAreaLeft = minHeight3 * (right - 1 - left);
                System.out.println("======= left : " + left + "======= right : " + right);
                System.out.println("currentArea : " + currentArea);
                System.out.println("currentAreaLeft : " + currentAreaLeft);
                System.out.println("currentAreaRight : " + currentAreaRight);
                System.out.println("=========================");
                int largest = Math.max(Math.max(currentArea, currentAreaRight), currentAreaLeft);
                if (maxArea < largest) {
                    maxArea = largest;
                }
                left++;
            }
            right--;
        }
        return maxArea;
    }

    public static void main(String[] arg) {
        //int[] input =new int[]{1,8,6,2,5,4,8,3,7};
        //int[] input =new int[]{1,1};
        //int[] input = new int[]{8, 7, 2, 1};
        int[] input =new int[]{1,2,3,1000,9};
        System.out.println(maxArea(input));
    }
}