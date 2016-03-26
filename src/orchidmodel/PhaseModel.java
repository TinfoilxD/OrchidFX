package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class PhaseModel {
    private int phaseID;
    private int projectID;
    private int phaseLookupID;
    private int phaseStatusID;
    private boolean isDeleted;

    public PhaseModel()
    {

    }

    public PhaseModel(int phaseID, int projectID, int phaseLookupID,
                      int phaseStatusID, boolean isDeleted)
    {
        this.phaseID = phaseID;
        this.projectID = projectID;
        this.phaseLookupID = phaseLookupID;
        this.phaseStatusID = phaseStatusID;
        this.isDeleted = isDeleted;
    }

    public int getPhaseID() {
        return phaseID;
    }

    public void setPhaseID(int phaseID) {
        this.phaseID = phaseID;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public int getPhaseLookupID() {
        return phaseLookupID;
    }

    public void setPhaseLookupID(int phaseLookupID) {
        this.phaseLookupID = phaseLookupID;
    }

    public int getPhaseStatusID() {
        return phaseStatusID;
    }

    public void setPhaseStatusID(int phaseStatusID) {
        this.phaseStatusID = phaseStatusID;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}






