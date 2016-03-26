package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class Task_StatusModel {
    private int taskStatusID;
    private String taskStatus;
    private boolean isDeleted;

    public Task_StatusModel(int taskStatusID, String taskStatus, boolean isDeleted)
    {
        this.taskStatusID = taskStatusID;
        this.taskStatus = taskStatus;
        this.isDeleted = isDeleted;
    }

    public int getTaskStatusID() {
        return taskStatusID;
    }

    public void setTaskStatusID(int taskStatusID) {
        this.taskStatusID = taskStatusID;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





