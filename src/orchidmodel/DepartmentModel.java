package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class DepartmentModel {
    private int departmentID;
    private String departmentName;
    private boolean isDeleted;

    public DepartmentModel()
    {

    }

    public DepartmentModel(int departmentID, String departmentName, boolean isDeleted)
    {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.isDeleted = isDeleted;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





