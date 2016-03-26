package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class Subtask_ListModel {
    private int subTaskListID;
    private String subTaskName;
    private boolean isDeleted;

    public Subtask_ListModel(int subTaskListID, String subTaskName, boolean isDeleted)
    {
        this.subTaskListID = subTaskListID;
        this.subTaskName = subTaskName;
        this.isDeleted = isDeleted;
    }

    public int getSubTaskListID() {
        return subTaskListID;
    }

    public void setSubTaskListID(int subTaskListID) {
        this.subTaskListID = subTaskListID;
    }

    public String getSubTaskName() {
        return subTaskName;
    }

    public void setSubTaskName(String subTaskName) {
        this.subTaskName = subTaskName;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





