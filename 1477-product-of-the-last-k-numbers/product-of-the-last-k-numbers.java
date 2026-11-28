class ProductOfNumbers {

    ArrayList<Integer> list;
    ArrayList<Integer> product ;

    public ProductOfNumbers() {
        list = new ArrayList<>();
        product = new ArrayList<>();
        product.add(1);
    }

    public void add(int num) {
        if(num!=0 && product.get(product.size()-1)!=0){
            product.add(product.get(product.size()-1)*num);
        }
        else if(num!=0 && product.get(product.size()-1)==0){
            product.add(num);
        }
        else{
            product.clear();
            product.add(1);
        }
    }

    public int getProduct(int k) {
        if(k>=product.size()){
            return 0;
        }
        else {
            return product.get(product.size()-1)/product.get(product.size()-k-1);
        }
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */