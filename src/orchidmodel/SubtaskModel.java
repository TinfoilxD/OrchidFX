package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class SubtaskModel {
    private int subTaskID;
    private int taskID;
    private int subTaskListID;
    private boolean isDeleted;

    public SubtaskModel(int subTaskID, int taskID, int subTaskListID, boolean isDeleted)
    {
        this.subTaskID = subTaskID;
        this.taskID = taskID;
        this.subTaskListID = subTaskListID;
        this.isDeleted = isDeleted;
    }

    public int getSubTaskID() {
        return subTaskID;
    }

    public void setSubTaskID(int subTaskID) {
        this.subTaskID = subTaskID;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getSubTaskListID() {
        return subTaskListID;
    }

    public void setSubTaskListID(int subTaskListID) {
        this.subTaskListID = subTaskListID;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





