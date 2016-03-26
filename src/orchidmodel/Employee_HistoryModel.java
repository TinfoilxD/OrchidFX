package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class Employee_HistoryModel {
    private int employeeHistoryID;
    private int employeeID;
    private String position;
    private int officeID;
    private String positionStartDate;
    private boolean isDeleted;

    public Employee_HistoryModel()
    {
        
    }

    public Employee_HistoryModel(int employeeHistoryID, int employeeID, String position,
                                 int officeID, String positionStartDate, boolean isDeleted)
    {
        this.employeeHistoryID = employeeHistoryID;
        this.employeeID = employeeID;
        this.position = position;
        this.officeID = officeID;
        this.positionStartDate = positionStartDate;
        this.isDeleted = isDeleted;
    }

    public int getEmployeeHistoryID() {
        return employeeHistoryID;
    }

    public void setEmployeeHistoryID(int employeeHistoryID) {
        this.employeeHistoryID = employeeHistoryID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public String getPositionStartDate() {
        return positionStartDate;
    }

    public void setPositionStartDate(String positionStartDate) {
        this.positionStartDate = positionStartDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





