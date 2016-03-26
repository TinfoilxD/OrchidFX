package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class Client_StatusModel {
    private int clientStatusID;
    private String clientStatus;
    private boolean isDeleted;

    public Client_StatusModel(int clientStatusID, String clientStatus, boolean isDeleted)
    {
        this.clientStatusID = clientStatusID;
        this.clientStatus = clientStatus;
        this.isDeleted = isDeleted;
    }

    public int getClientStatusID() {
        return clientStatusID;
    }

    public void setClientStatusID(int clientStatusID) {
        this.clientStatusID = clientStatusID;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





