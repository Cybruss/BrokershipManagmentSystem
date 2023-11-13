// import java.util.ArrayList;

public class Managment {
    private int Max_members=50;
    private Person[] buyers;
    private Person[] sellers;
    private Product[] crops;
    // ArrayList<Product> buyers;
    // ArrayList<Product> sellers;
    // ArrayList<Product> crops;

    Managment(){
        buyers=new Buyer[Max_members];
        sellers=new Seller[Max_members];
        crops=new Product[Max_members];
    }

    public Person findSeller(){
        Person temp=null;
        for(int i=0; i<sellers.length;i++){
            if(sellers[i]!=null)
                temp=sellers[i];
        }
        return temp;
    }
    // public Product findSellerbyname(String name){
    //     sellers.forEach();
    // }



}
