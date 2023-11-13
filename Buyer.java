public class Buyer extends Person {
    private String companyName;
    
    public Buyer(String name,String address, String contact,String occopation,String companyName){
        super( name, address,contact,occopation);
        setCompanyName(companyName);
        
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    
}
