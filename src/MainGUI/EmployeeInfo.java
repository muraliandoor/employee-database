//Java EmployeeDatabase Project

/*  *Class: EmployeeInfo
    *Purpose: Holds Employee Information, attributes, methods
    *Name: Bilaal Hussain
    *April 26 v 0.1
    *ICS4UE Dutton
    *What's new?: functionality
 */
package MainGUI;

public class EmployeeInfo {

    //Attributes
    private int employeeNumber;
    private String firstName;
    private String lastName;
    private int sex; // 0 - male, 1- female, 2-other
    private int workLocation;// 0 - mississauga, 1- ottawa, 2-chicago
    private double deductionsRate;
    private double pay;

    // Default constructor
    public EmployeeInfo() {

        firstName = "defaultFirst";
        lastName = "defaultLast";
        employeeNumber = 000000;
        sex = -1;
        workLocation = 0;
        deductionsRate = 0;
        pay = 0;
    }

    // Constructor with all attributes
    public EmployeeInfo(int employeeNumber, String firstName, String lastName, int sex, int workLocation, double deductionsRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeNumber = employeeNumber;
        this.sex = sex;
        this.workLocation = workLocation;
        this.deductionsRate = deductionsRate;
    }

    //getter/setter - first name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //getter/setter - last name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //getter/setter - employeeNumber
    public int getEmployeeNumber() {
        return (employeeNumber);
    }

    public void setEmployeeNumber(int employeeNumber) {
        //makes sure that employee number is never set to below 0
        if (employeeNumber >= 0) {
            this.employeeNumber = employeeNumber;
        } else {
            System.out.println("Invalid Employee Number");
        }
    }

    //getter/setter - sex
    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //getter and setter for pay
    public double getPay() {
        return pay - pay * (deductionsRate);
    }

    public void setpay(double pay) {
        this.pay = pay;
    }

    //getter and setter for deductions rate
    public double getDeductionsRate() {
        return deductionsRate;
    }

    public void setDeductionsRate(double deductionsRate) {
        this.deductionsRate = deductionsRate;
    }

    //getter and setter for work location
    public int getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(int workLocation) {
        this.workLocation = workLocation;
    }

    //method to return all attributes from superclass to write to file
    public String getEmployeeAttributes() {
        return employeeNumber + "," + firstName + "," + lastName + "," + sex + "," + workLocation
                + "," + deductionsRate + "," + pay;
    }

}
