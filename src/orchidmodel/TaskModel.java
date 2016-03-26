package orchidmodel;/*
 * Written by Tin Van on 3/22/16.
 */

public class TaskModel
{
    private int taskID;
    private int phaseID;
    private int taskListID;
    private int taskStatusID;
    private boolean isDeleted;

    public TaskModel()
    {

    }

    public TaskModel(int taskID, int phaseID, int taskListID, int taskStatusID, boolean isDeleted)
    {
        this.taskID = taskID;
        this.phaseID = phaseID;
        this.taskListID = taskListID;
        this.taskStatusID = taskStatusID;
        this.isDeleted = isDeleted;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public int getPhaseID() {
        return phaseID;
    }

    public void setPhaseID(int phaseID) {
        this.phaseID = phaseID;
    }

    public int getTaskListID() {
        return taskListID;
    }

    public void setTaskListID(int taskListID) {
        this.taskListID = taskListID;
    }

    public int getTaskStatusID() {
        return taskStatusID;
    }

    public void setTaskStatusID(int taskStatusID) {
        this.taskStatusID = taskStatusID;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
