/*
using lists can store one merge array when two adjacent arrays that are overflapped otherwise just 
store this array, finally stored by list<list<Integer>> that can be transferred to 
int[][].
*/
class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length==0) {return null;}
        List<Integer> lists = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b)-> a[0]-b[0]);
        for(int i=1;i<intervals.length;++i) {
            
            if(intervals[i][0]<intervals[i-1][1]) {
                lists.add(intervals[i-1][0]);
                lists.add(intervals[i][1]);
                res.add(lists);
                lists.clear();
            }else{
                lists.add(intervals[i][0]);
                lists.add(intervals[i][1]);
                res.add(lists);
                lists.clear();
            }
        }
        int[][] ans = new int[res.size()][2];
        for (int i=0; i<res.size(); ++i) {
            for(int j=0; j<2; ++j) {
                ans[i][j] = res.get(i).get(j);
            }
        }
        return ans;
    }
}