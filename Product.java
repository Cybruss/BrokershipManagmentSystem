public class Product {
    private String catagory;
    private int quantity;
    private double rate; 

    Product(String catagory,int qunt, double rate){
        setCatagory(catagory);
        setQuantity(qunt);
        setRate(rate);
    }

    public String getCatagory() {
        return catagory;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getRate() {
        return rate;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }

    public String toString(){
        return String.format("%-10s\t%d\t%.2f", catagory,quantity,rate);
    }








}

