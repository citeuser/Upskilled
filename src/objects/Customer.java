package objects;

/**
 * Created by JPMC on 9/28/2016.
 */
public class Customer extends Person {

    private String address;
    private int telephoneNumber;
    private int customerId;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String introduceYourself(){
        return "Hi im "+ getfirstName() + " " + getlastName()+" a customer";
    }
    public String introduceYourself(String product){
        return "Hi i am a customer and I want to buy a "+ product;
    }
}
