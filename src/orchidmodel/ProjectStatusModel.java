package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class ProjectStatusModel
{
    private int statusID;
    private String projectStatus;
    private boolean isDeleted;

    public ProjectStatusModel()
    {

    }

    public ProjectStatusModel(int statusID, String projectStatus, boolean isDeleted)
    {
        this.statusID = statusID;
        this.projectStatus = projectStatus;
        this.isDeleted = isDeleted;
    }

    public int getStatusID() {
        return statusID;
    }

    public void setStatusID(int statusID) {
        this.statusID = statusID;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





