/*
 * Ray's comment:
 *
 * The key observation to solve this problem is this:
 * if we split the string S into three parts L, M, R denote
 * left, middle, right part respectively
 *
 * Consider the following question, if we can make S balanced only by
 * modifying M. Then what property should L, R have?
 * Based on this, it is possible to binary search the length of M
 * which will yield to an O(n log n) solution
 *
 * You can further improve it into linear time complexity by maintaining
 * two pointer denote L, R 
 */
class Solution {
    public int balancedString(String s) {
        if(s==null||s.length()==0){return 0;}
        int res=0;
        int sum=0;
        int[] count=new int[10];
        /*
        Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i=1; i<s.length(); ++i) {
			
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				int count=map.get(ch);
				count=count+1;
				map.put(ch, count);
			}else{
				map.put(ch, 1);
			}
		}
        if(!map.containsKey('Q')){
            map.put('Q', 0);
        }else if(!map.containsKey('W')){
            map.put('W', 0);
        }else if(!map.containsKey('E')){
            map.put('E', 0);
        }else if(!map.containsKey('R')){
            map.put('R', 0);
        }*/
        
        for(int i=0;i<s.length();++i){
            count[s.charAt(i)-'A']++;
            System.out.print(count[s.charAt(i)-'A']);
        }
        
        
        return res;
        /*for(int i=0;i<4;++i){
            if(sum==map.get()){
                break;
            }else{
                res=Math.abs(sum-count[i])/2;
            }
        }*/
        
        
        
    }
}
