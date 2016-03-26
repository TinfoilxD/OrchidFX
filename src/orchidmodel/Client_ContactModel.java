package orchidmodel;/*
 * Written by Joshua Joseph on 3/19/16.
 */

public class Client_ContactModel {
    private int clientContactID;
    private int clientID;
    private String clientContactFirstName;
    private String clientContactLastName;
    private String clientContactPhone;
    private String clientContactExtension;
    private String clientContactEmail;
    private boolean isDeleted;

    public Client_ContactModel(int clientContactID, int clientID, String clientContactFirstName,
                               String clientContactLastName, String clientContactPhone,
                               String clientContactExtension, String clientContactEmail, boolean isDeleted)
    {
        this.clientContactID = clientContactID;
        this.clientID = clientID;
        this.clientContactFirstName = clientContactFirstName;
        this.clientContactLastName = clientContactLastName;
        this.clientContactPhone = clientContactPhone;
        this.clientContactExtension = clientContactExtension;
        this.clientContactEmail = clientContactEmail;
        this.isDeleted = isDeleted;

    }

    public int getClientContactID() {
        return clientContactID;
    }

    public void setClientContactID(int clientContactID) {
        this.clientContactID = clientContactID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getClientContactFirstName() {
        return clientContactFirstName;
    }

    public void setClientContactFirstName(String clientContactFirstName) {
        this.clientContactFirstName = clientContactFirstName;
    }

    public String getClientContactLastName() {
        return clientContactLastName;
    }

    public void setClientContactLastName(String clientContactLastName) {
        this.clientContactLastName = clientContactLastName;
    }

    public String getClientContactPhone() {
        return clientContactPhone;
    }

    public void setClientContactPhone(String clientContactPhone) {
        this.clientContactPhone = clientContactPhone;
    }

    public String getClientContactExtension() {
        return clientContactExtension;
    }

    public void setClientContactExtension(String clientContactExtension) {
        this.clientContactExtension = clientContactExtension;
    }

    public String getClientContactEmail() {
        return clientContactEmail;
    }

    public void setClientContactEmail(String clientContactEmail) {
        this.clientContactEmail = clientContactEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }


}






