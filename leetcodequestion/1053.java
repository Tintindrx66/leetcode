class Solution {
    public int[] prevPermOpt1(int[] A) {
        if(A==null||A.length==0){
            return null;
        }
        
        TreeMap<Integer, Integer> Tmap=new TreeMap<>();
        for(int i=A.length-1;i>=0;--i){
            Map.Entry<Integer, Integer> T=Tmap.lowerEntry(A[i]);
            if(T!=null){
                int temp=A[i];
                A[i]=A[T.getValue()];
                A[T.getValue()]=temp;
                return A;
            }
                
            Tmap.put(A[i],i);
        }
        return A;
    }
}