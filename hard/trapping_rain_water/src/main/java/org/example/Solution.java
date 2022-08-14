package org.example;

public class Solution
{
    public int trap(int[] height) {
        int trapped = 0;
        int leftPosition = 0;
        int rightPosition = height.length -1;
        int leftMaxBoundary = 0;
        int rightMaxBoundary = 0;
        while (leftPosition < rightPosition){
            if (height[leftPosition] < height[rightPosition]) {
                if(height[leftPosition] > leftMaxBoundary){
                    leftMaxBoundary = height[leftPosition];
                } else {
                    trapped += leftMaxBoundary - height[leftPosition];
                }
                leftPosition++;
            } else {
                if(height[rightPosition] > rightMaxBoundary){
                    rightMaxBoundary = height[rightPosition];
                } else {
                    trapped += rightMaxBoundary - height[rightPosition];
                }
                rightPosition--;
            }
        }
        return trapped;
    }
}
