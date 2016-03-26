package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class Phase_LookupModel {
    private int phaseLookupID;
    private String phase;
    private boolean isDeleted;

    public Phase_LookupModel(int phaseLookupID, String phase, boolean isDeleted)
    {
        this.phaseLookupID = phaseLookupID;
        this.phase = phase;
        this.isDeleted = isDeleted;
    }

    public int getPhaseLookupID() {
        return phaseLookupID;
    }

    public void setPhaseLookupID(int phaseLookupID) {
        this.phaseLookupID = phaseLookupID;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





