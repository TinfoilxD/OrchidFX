package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class Project_TypeModel {
    private int projectTypeID;
    private String projectType;
    private boolean isDeleted;

    public Project_TypeModel()
    {

    }

    public Project_TypeModel(int projectTypeID, String projectType, boolean isDeleted)
    {
        this.projectTypeID = projectTypeID;
        this.projectType = projectType;
        this.isDeleted = isDeleted;
    }

    public int getProjectTypeID() {
        return projectTypeID;
    }

    public void setProjectTypeID(int projectTypeID) {
        this.projectTypeID = projectTypeID;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





