package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class EmployeeModel {
    private int employeeID;
    private int userID;
    private String employeeFirstName;
    private String employeeLastName;
    private int departmentID;
    private int employeeStatusID;
    private String employeePhone;
    private String employeeExtension;
    private String employeeEmail;
    private boolean isDeleted;

    public EmployeeModel()
    {

    }

    public EmployeeModel(int employeeID, int userID, String employeeFirstName,
                         String employeeLastName, int departmentID, int employeeStatusID,
                         String employeePhone, String employeeExtension, String employeeEmail,
                         boolean isDeleted)
    {
        this.employeeID = employeeID;
        this.userID = userID;
        this.employeeFirstName = employeeFirstName;
        this.employeeLastName = employeeLastName;
        this.departmentID = departmentID;
        this.employeeStatusID = employeeStatusID;
        this.employeePhone = employeePhone;
        this.employeeExtension = employeeExtension;
        this.employeeEmail = employeeEmail;
        this.isDeleted = isDeleted;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getEmployeeFirstName() {
        return employeeFirstName;
    }

    public void setEmployeeFirstName(String employeeFirstName) {
        this.employeeFirstName = employeeFirstName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public void setEmployeeLastName(String employeeLastName) {
        this.employeeLastName = employeeLastName;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public int getEmployeeStatusID() {
        return employeeStatusID;
    }

    public void setEmployeeStatusID(int employeeStatusID) {
        this.employeeStatusID = employeeStatusID;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeExtension() {
        return employeeExtension;
    }

    public void setEmployeeExtension(String employeeExtension) {
        this.employeeExtension = employeeExtension;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





