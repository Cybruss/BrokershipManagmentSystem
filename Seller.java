public class Seller extends Person {

    private Product product;
    private int no_Purchases=0;

    public Seller(String name,String address, String contact,String occopation,Product product){
        super(name,address, contact,occopation);
        setProduct(product);

    }

    public void setNo_Purchases(int no_Purchases) {
        this.no_Purchases = no_Purchases;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public int getNo_Purchases() {
        return no_Purchases;
    }
    public Product getProduct() {
        return product;
    }
    
    public String toString(){
        return String.format("%s\t%d", super.toString(),no_Purchases);
    }
}
