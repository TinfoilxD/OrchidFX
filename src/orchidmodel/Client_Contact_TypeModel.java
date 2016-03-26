package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class Client_Contact_TypeModel {
    private int clientContactTypeID;
    private String clientContactType;
    private boolean isDeleted;

    public Client_Contact_TypeModel()
    {

    }

    public Client_Contact_TypeModel(int clientContactTypeID, String clientContactType, boolean isDeleted)
    {
        this.clientContactTypeID = clientContactTypeID;
        this.clientContactType = clientContactType;
        this.isDeleted = isDeleted;
    }

    public int getClientContactTypeID() {
        return clientContactTypeID;
    }

    public void setClientContactTypeID(int clientContactTypeID) {
        this.clientContactTypeID = clientContactTypeID;
    }

    public String getClientContactType() {
        return clientContactType;
    }

    public void setClientContactType(String clientContactType) {
        this.clientContactType = clientContactType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





