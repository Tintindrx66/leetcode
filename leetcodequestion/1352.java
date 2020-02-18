class ProductOfNumbers {
    
    ArrayList<Integer> res = new ArrayList<>();
    public ProductOfNumbers() {
        res.add(1);
    }
    
    public void add(int num) {
        if (num > 0)
            res.add(res.get(res.size() - 1) * num);
        else {
            res.clear();
            res.add(1);
        }
    }
    
    public int getProduct(int k) {
        return k<res.size()? res.get(res.size()-1)/res.get(res.size()-k-1):0;
    }
}