/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainGUI;

/**
 *
 * @author Bilaal
 */
public class FullTimeEmployee extends EmployeeInfo {

    public FullTimeEmployee() {
    }
    double annualSalary = 0;            
    public FullTimeEmployee(int eNum, String fN, String lN, int sex, int workLocation, double deductionsRate, double pay) {
        super(eNum, fN, lN, sex, workLocation, deductionsRate);
        this.annualSalary = pay;
    }

}
