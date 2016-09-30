package objects;

/**
 * Created by JPMC on 9/28/2016.
 */
public abstract class Person {
   private String firstName;// private-> can use this object firstname only inside this bracket
   private String lastName;

    public Person(){

    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    private String eMail;
    public void  setfirstName(String firstName){
       this.firstName = firstName;

    }
    public String getfirstName(){
        return firstName;

    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String introduceYourself(){
        return "Hi im "+ firstName + " " + lastName;
    }
    public Person (String lname, String fname){
        setfirstName(fname);
        setlastName(lname);

    }
}
