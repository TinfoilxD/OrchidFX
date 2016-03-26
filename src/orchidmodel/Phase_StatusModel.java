package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class Phase_StatusModel {
    private int phaseStatusID;
    private String phaseStatus;
    private boolean isDeleted;

    public Phase_StatusModel(int phaseStatusID, String phaseStatus, boolean isDeleted)
    {
        this.phaseStatusID = phaseStatusID;
        this.phaseStatus = phaseStatus;
        this.isDeleted = isDeleted;
    }

    public int getPhaseStatusID() {
        return phaseStatusID;
    }

    public void setPhaseStatusID(int phaseStatusID) {
        this.phaseStatusID = phaseStatusID;
    }

    public String getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





