package objects;

/**
 * Created by JPMC on 9/28/2016.
 */
public class Employee extends Person{

    private String Department;
    private float payGrade;
    private int employeeId;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public float getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(float payGrade) {
        this.payGrade = payGrade;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String introduceYourself(){
        return "Hi im "+ getfirstName() + " " +getlastName()+" im working in CITE";
    }

}
