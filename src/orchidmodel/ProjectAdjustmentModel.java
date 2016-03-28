package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class ProjectAdjustmentModel
{
    private int projectAdjustmentID;
    private int projectID;
    private String note;
    private String noteCreationDate;
    private boolean isDeleted;

    public ProjectAdjustmentModel()
    {

    }

    public ProjectAdjustmentModel(int projectAdjustmentID, int projectID, String note,
                                  String noteCreationDate, boolean isDeleted)
    {
        this.projectAdjustmentID = projectAdjustmentID;
        this.projectID = projectID;
        this.note = note;
        this.noteCreationDate = noteCreationDate;
        this.isDeleted = isDeleted;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public int getProjectAdjustmentID() {
        return projectAdjustmentID;
    }

    public void setProjectAdjustmentID(int projectAdjustmentID) {
        this.projectAdjustmentID = projectAdjustmentID;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getNoteCreationDate() {
        return noteCreationDate;
    }

    public void setNoteCreationDate(String noteCreationDate) {
        this.noteCreationDate = noteCreationDate;
    }
}






