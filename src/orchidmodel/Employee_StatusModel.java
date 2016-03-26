package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class Employee_StatusModel {
    private int employeeStatusID;
    private String employeeStatus;
    private boolean isDeleted;

    public Employee_StatusModel(int employeeStatusID, String employeeStatus, boolean isDeleted)
    {
        this.employeeStatusID = employeeStatusID;
        this.employeeStatus = employeeStatus;
        this.isDeleted = isDeleted;
    }

    public int getEmployeeStatusID() {
        return employeeStatusID;
    }

    public void setEmployeeStatusID(int employeeStatusID) {
        this.employeeStatusID = employeeStatusID;
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





