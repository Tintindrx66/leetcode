class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        
        List<String> res = new ArrayList<>();

        res.add(folder[0]);
        
        String[] curPrefix = folder[0].split("/");
        
        for (int i = 1; i < folder.length; i++) {
            String curPath = folder[i];
            if (matchPrefix(curPrefix, folder[i])){
                continue;
            }
            else {
                res.add(curPath);
                curPrefix = curPath.split("/");
            }
        }
        return res;
    }
    
    private boolean matchPrefix(String[] curPrefix, String curPath) {
        String[] cur = curPath.split("/");
    
        if (cur.length< curPrefix.length) return false;

        for (int i=1; i<curPrefix.length; ++i) {
            if (!curPrefix[i].equals(cur[i])) return false;
        }
        return true;
    }
}