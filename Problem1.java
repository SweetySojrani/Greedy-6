// Time Complexity - logn (average)
// Space Complexity - O(1)
// This solution worked on LeetCode


class Solution {
    public int brokenCalc(int X, int Y) {
        int count=0;
        while(Y > X){
            if(Y %2 == 1)
                Y++;
            else
                Y=Y/2;
            count++;       
        }
        return count + X-Y;
    }
}
