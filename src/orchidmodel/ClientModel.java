package orchidmodel;/*
 * Written Joshua Joseph on 3/19/16.
 */

public class ClientModel
{
    private int clientID;
    private int clientStatusID;
    private int tradeShowID;
    private int referrerID;
    private String clientCompanyName;
    private String clientFirstName;
    private String clientLastName;
    private String clientMailingAddress1;
    private String clientMailingAddress2;
    private String clientMailingAddress3;
    private String clientMailingCity;
    private int    mailingStateID;
    private String clientMailingZipCode;
    private int    mailingCountryID;
    private String clientBillingAddress1;
    private String clientBillingAddress2;
    private String clientBillingAddress3;
    private String clientBillingCity;
    private int    billingStateID;
    private String clientBillingZipCode;
    private int    billingCountryID;
    private String clientPhone;
    private String clientExtension;
    private String clientEmail;
    private boolean isDeleted;

    public ClientModel()
    {

    }
    public ClientModel(int clientID, int clientStatusID, int tradeShowID, int referrerID,
                       String clientCompanyName, String clientFirstName, String clientLastName,
                       String clientMailingAddress1, String clientMailingAddress2,
                       String clientMailingAddress3, String clientMailingCity, int mailingStateID,
                       String clientMailingZipCodeID, int mailingCountryID, String clientBillingAddress1,
                       String clientBillingAddress2, String clientBillingAddress3, String clientBillingCity,
                       int billingStateID, String clientBillingZipCode, int billingCountryID,
                       String clientPhone, String clientExtension, String clientEmail, boolean isDeleted)
    {
        this.clientID = clientID;
        this.clientStatusID = clientStatusID;
        this.tradeShowID = tradeShowID;
        this.referrerID = referrerID;
        this.clientCompanyName = clientCompanyName;
        this.clientFirstName = clientFirstName;
        this.clientLastName = clientLastName;
        this.clientMailingAddress1 = clientMailingAddress1;
        this.clientMailingAddress2 = clientMailingAddress2;
        this.clientMailingAddress3 = clientMailingAddress3;
        this.clientMailingCity = clientMailingCity;
        this.mailingStateID = mailingStateID;
        this.clientMailingZipCode = clientMailingZipCodeID;
        this.mailingCountryID = mailingCountryID;
        this.clientBillingAddress1 = clientBillingAddress1;
        this.clientBillingAddress2 = clientBillingAddress2;
        this.clientBillingAddress3 = clientBillingAddress3;
        this.clientBillingCity = clientBillingCity;
        this.billingStateID = billingStateID;
        this.clientBillingZipCode = clientBillingZipCode;
        this.billingCountryID = billingCountryID;
        this.clientPhone = clientPhone;
        this.clientExtension = clientExtension;
        this.clientEmail = clientEmail;
        this.isDeleted = isDeleted;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getClientStatusID() {
        return clientStatusID;
    }

    public void setClientStatusID(int clientStatusID) {
        this.clientStatusID = clientStatusID;
    }

    public int getTradeShowID() {
        return tradeShowID;
    }

    public void setTradeShowID(int tradeShowID) {
        this.tradeShowID = tradeShowID;
    }

    public int getReferrerID() {
        return referrerID;
    }

    public void setReferrerID(int referrerID) {
        this.referrerID = referrerID;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public void setClientCompanyName(String clientCompanyName) {
        this.clientCompanyName = clientCompanyName;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientMailingAddress1() {
        return clientMailingAddress1;
    }

    public void setClientMailingAddress1(String clientMailingAddress1) {
        this.clientMailingAddress1 = clientMailingAddress1;
    }

    public String getClientMailingAddress2() {
        return clientMailingAddress2;
    }

    public void setClientMailingAddress2(String clientMailingAddress2) {
        this.clientMailingAddress2 = clientMailingAddress2;
    }

    public String getClientMailingAddress3() {
        return clientMailingAddress3;
    }

    public void setClientMailingAddress3(String clientMailingAddress3) {
        this.clientMailingAddress3 = clientMailingAddress3;
    }

    public String getClientMailingCity() {
        return clientMailingCity;
    }

    public void setClientMailingCity(String clientMailingCity) {
        this.clientMailingCity = clientMailingCity;
    }

    public int getMailingStateID() {
        return mailingStateID;
    }

    public void setMailingStateID(int mailingStateID) {
        this.mailingStateID = mailingStateID;
    }

    public String getClientMailingZipCode() {
        return clientMailingZipCode;
    }

    public void setClientMailingZipCode(String clientMailingZipCode) {
        this.clientMailingZipCode = clientMailingZipCode;
    }

    public int getMailingCountryID() {
        return mailingCountryID;
    }

    public void setMailingCountryID(int mailingCountryID) {
        this.mailingCountryID = mailingCountryID;
    }

    public String getClientBillingAddress1() {
        return clientBillingAddress1;
    }

    public void setClientBillingAddress1(String clientBillingAddress1) {
        this.clientBillingAddress1 = clientBillingAddress1;
    }

    public String getClientBillingAddress2() {
        return clientBillingAddress2;
    }

    public void setClientBillingAddress2(String clientBillingAddress2) {
        this.clientBillingAddress2 = clientBillingAddress2;
    }

    public String getClientBillingAddress3() {
        return clientBillingAddress3;
    }

    public void setClientBillingAddress3(String clientBillingAddress3) {
        this.clientBillingAddress3 = clientBillingAddress3;
    }

    public String getClientBillingCity() {
        return clientBillingCity;
    }

    public void setClientBillingCity(String clientBillingCity) {
        this.clientBillingCity = clientBillingCity;
    }

    public int getBillingStateID() {
        return billingStateID;
    }

    public void setBillingStateID(int billingStateID) {
        this.billingStateID = billingStateID;
    }

    public String getClientBillingZipCode() {
        return clientBillingZipCode;
    }

    public void setClientBillingZipCode(String clientBillingZipCode) {
        this.clientBillingZipCode = clientBillingZipCode;
    }

    public int getBillingCountryID() {
        return billingCountryID;
    }

    public void setBillingCountryID(int billingCountryID) {
        this.billingCountryID = billingCountryID;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public String getClientExtension() {
        return clientExtension;
    }

    public void setClientExtension(String clientExtension) {
        this.clientExtension = clientExtension;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
