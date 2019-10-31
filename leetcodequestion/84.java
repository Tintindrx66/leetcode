class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights==null||heights.length==0){return 0;}
        int ans=Integer.MIN_VALUE;
        int cursum=0;
        int indexmin=0;
        for(int i=0;i<heights.length;++i){
            indexmin=findmin(heights, i, heights[i]);
            System.out.print(indexmin+" ");
            cursum=heights[i]*indexmin;
            if(cursum>ans){
                ans=cursum;
            }
        }
        return ans;
    }
    private int findmin(int[] heights, int index, int curvalue){
        int leftminindex=index, rightminindex=index;
        int leftmin=curvalue, rightmin=curvalue;
        for(int i=index-1;i>=0;--i){
            if(heights[i]<curvalue){
                leftminindex=i;
                leftmin=heights[i];
                break;
            }
        }
        for(int i=index+1;i<heights.length;++i){
            if(heights[i]<curvalue){
                rightminindex=i;
                rightmin=heights[i];
                break;
            }
        }
    
        if(leftmin==curvalue&&rightmin==curvalue){
            return 1;
        }
        if(leftmin==curvalue){
            return rightminindex-leftminindex;
        }
        if(rightmin==curvalue){
            return rightminindex-leftminindex;
        }
        return rightminindex-leftminindex-1;
    }
    
}