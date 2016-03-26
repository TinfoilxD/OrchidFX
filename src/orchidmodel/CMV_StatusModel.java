package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class CMV_StatusModel {
    private int cmvStatusID;
    private String cmvStatus;
    private boolean isDeleted;

    public CMV_StatusModel(int cmvStatusID, String cmvStatus, boolean isDeleted)
    {
        this.cmvStatusID = cmvStatusID;
        this.cmvStatus = cmvStatus;
        this.isDeleted = isDeleted;
    }

    public int getCmvStatusID() {
        return cmvStatusID;
    }

    public void setCmvStatusID(int cmvStatusID) {
        this.cmvStatusID = cmvStatusID;
    }

    public String getCmvStatus() {
        return cmvStatus;
    }

    public void setCmvStatus(String cmvStatus) {
        this.cmvStatus = cmvStatus;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





