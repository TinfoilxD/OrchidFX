package orchidmodel;/*
 * Written by Tin Van on 3/22/16.
 */

public class Task_ListModel
{
    private int taskListID;
    private int phaseLookupID;
    private String task;
    private boolean isDeleted;

    public Task_ListModel()
    {

    }

    public Task_ListModel(int taskListID, int phaseLookupID, String task, boolean isDeleted)
    {
        this.taskListID = taskListID;
        this.phaseLookupID = phaseLookupID;
        this.task = task;
        this.isDeleted = isDeleted;
    }

    public int getTaskListID() {
        return taskListID;
    }

    public void setTaskListID(int taskListID) {
        this.taskListID = taskListID;
    }

    public int getPhaseLookupID() {
        return phaseLookupID;
    }

    public void setPhaseLookupID(int phaseLookupID) {
        this.phaseLookupID = phaseLookupID;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
