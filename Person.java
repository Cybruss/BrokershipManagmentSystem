public class Person{
    private String name;
    private String address;
    private String contact;
    private String occopation;

    public Person(String name,String address, String contact,String occopation){
        setName(name);
        setAddress(address);
        setContact(contact);
        setOccopation(occopation);
    }

    public String getOccopation() {
        return occopation;
    }
    public String getAddress() {
        return address;
    }
    public String getContact() {
        return contact;
    }public String getName() {
        return name;
    }

    public void setOccopation(String occopation) {
        this.occopation = occopation;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setContact(String contact) {
        this.contact = contact;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return String.format("%-10s\t%-20s\t%-15s", name,address,contact,occopation);
    }



}

