class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        
        
        List<List<Integer>> res= new ArrayList<>();
	    for(int i=1;i<=z;++i){
	        for(int j=1;j<=z;++j){	
	        	if(customfunction.f(i, j)==z){
	        		List<Integer> cur= new ArrayList<>();
	        		cur.add(i);
	        		cur.add(j);
	        		res.add(cur);
	        	}
	        	if(customfunction.f(i, j)>=z){
                    break;
                }
	        }
	    }
	    return res;
    }
}