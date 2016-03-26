package orchidmodel;/*
 * Written Joshua Joseph on 3/21/16.
 */

public class ManufacturerModel
{
    private int manufacturerID;
    private int cmvStatusID;
    private String manufacturerName;
    private String manufacturerBillingAddress1;
    private String manufacturerBillingAddress2;
    private String manufacturerBillingAddress3;
    private String manufacturerBillingCity;
    private int    stateBillingID;
    private String manufacturerBillingZipCode;
    private int    billingCountryID;
    private String manufacturerShippingAddress1;
    private String manufacturerShippingAddress2;
    private String manufacturerShippingAddress3;
    private String manufacturerShippingCity;
    private int    stateShippingID;
    private String manufacturerShippingZipCode;
    private int    shippingCountryID;
    private String manufacturerEmail;
    private String manufacturerWebsite;
    private boolean isDeleted;

    public ManufacturerModel()
    {

    }

    public ManufacturerModel(int manufacturerID, int cmvStatusID, String manufacturerName,
                             String manufacturerBillingAddress1, String manufacturerBillingAddress2,
                             String manufacturerBillingAddress3, String manufacturerBillingCity,
                             int stateBillingID, String manufacturerBillingZipCode, int billingCountryID,
                             String manufacturerShippingAddress1, String manufacturerShippingAddress2,
                             String manufacturerShippingAddress3, String manufacturerShippingCity,
                             int stateShippingID, String manufacturerShippingZipCode,
                             int shippingCountryID, String manufacturerEmail, String manufacturerWebsite,
                             boolean isDeleted)
    {
        this.manufacturerID = manufacturerID;
        this.cmvStatusID = cmvStatusID;
        this.manufacturerName = manufacturerName;
        this.manufacturerBillingAddress1 = manufacturerBillingAddress1;
        this.manufacturerBillingAddress2 = manufacturerBillingAddress2;
        this.manufacturerBillingAddress3 = manufacturerBillingAddress3;
        this.manufacturerBillingCity = manufacturerBillingCity;
        this.stateBillingID = stateBillingID;
        this.manufacturerBillingZipCode = manufacturerBillingZipCode;
        this.billingCountryID = billingCountryID;
        this.manufacturerShippingAddress1 = manufacturerShippingAddress1;
        this.manufacturerShippingAddress2 = manufacturerShippingAddress2;
        this.manufacturerShippingAddress3 = manufacturerShippingAddress3;
        this.manufacturerShippingCity = manufacturerShippingCity;
        this.stateShippingID = stateShippingID;
        this.manufacturerShippingZipCode = manufacturerShippingZipCode;
        this.shippingCountryID = shippingCountryID;
        this.manufacturerEmail = manufacturerEmail;
        this.manufacturerWebsite = manufacturerWebsite;
        this.isDeleted = isDeleted;
    }

    public int getManufacturerID() {
        return manufacturerID;
    }

    public void setManufacturerID(int manufacturerID) {
        this.manufacturerID = manufacturerID;
    }

    public int getCmvStatusID() {
        return cmvStatusID;
    }

    public void setCmvStatusID(int cmvStatusID) {
        this.cmvStatusID = cmvStatusID;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerBillingAddress1() {
        return manufacturerBillingAddress1;
    }

    public void setManufacturerBillingAddress1(String manufacturerBillingAddress1) {
        this.manufacturerBillingAddress1 = manufacturerBillingAddress1;
    }

    public String getManufacturerBillingAddress2() {
        return manufacturerBillingAddress2;
    }

    public void setManufacturerBillingAddress2(String manufacturerBillingAddress2) {
        this.manufacturerBillingAddress2 = manufacturerBillingAddress2;
    }

    public String getManufacturerBillingAddress3() {
        return manufacturerBillingAddress3;
    }

    public void setManufacturerBillingAddress3(String manufacturerBillingAddress3) {
        this.manufacturerBillingAddress3 = manufacturerBillingAddress3;
    }

    public String getManufacturerBillingCity() {
        return manufacturerBillingCity;
    }

    public void setManufacturerBillingCity(String manufacturerBillingCity) {
        this.manufacturerBillingCity = manufacturerBillingCity;
    }

    public int getStateBillingID() {
        return stateBillingID;
    }

    public void setStateBillingID(int stateBillingID) {
        this.stateBillingID = stateBillingID;
    }

    public String getManufacturerBillingZipCode() {
        return manufacturerBillingZipCode;
    }

    public void setManufacturerBillingZipCode(String manufacturerBillingZipCode) {
        this.manufacturerBillingZipCode = manufacturerBillingZipCode;
    }

    public int getBillingCountryID() {
        return billingCountryID;
    }

    public void setBillingCountryID(int billingCountryID) {
        this.billingCountryID = billingCountryID;
    }

    public String getManufacturerShippingAddress1() {
        return manufacturerShippingAddress1;
    }

    public void setManufacturerShippingAddress1(String manufacturerShippingAddress1) {
        this.manufacturerShippingAddress1 = manufacturerShippingAddress1;
    }

    public String getManufacturerShippingAddress2() {
        return manufacturerShippingAddress2;
    }

    public void setManufacturerShippingAddress2(String manufacturerShippingAddress2) {
        this.manufacturerShippingAddress2 = manufacturerShippingAddress2;
    }

    public String getManufacturerShippingAddress3() {
        return manufacturerShippingAddress3;
    }

    public void setManufacturerShippingAddress3(String manufacturerShippingAddress3) {
        this.manufacturerShippingAddress3 = manufacturerShippingAddress3;
    }

    public String getManufacturerShippingCity() {
        return manufacturerShippingCity;
    }

    public void setManufacturerShippingCity(String manufacturerShippingCity) {
        this.manufacturerShippingCity = manufacturerShippingCity;
    }

    public int getStateShippingID() {
        return stateShippingID;
    }

    public void setStateShippingID(int stateShippingID) {
        this.stateShippingID = stateShippingID;
    }

    public String getManufacturerShippingZipCode() {
        return manufacturerShippingZipCode;
    }

    public void setManufacturerShippingZipCode(String manufacturerShippingZipCode) {
        this.manufacturerShippingZipCode = manufacturerShippingZipCode;
    }

    public int getShippingCountryID() {
        return shippingCountryID;
    }

    public void setShippingCountryID(int shippingCountryID) {
        this.shippingCountryID = shippingCountryID;
    }

    public String getManufacturerEmail() {
        return manufacturerEmail;
    }

    public void setManufacturerEmail(String manufacturerEmail) {
        this.manufacturerEmail = manufacturerEmail;
    }

    public String getManufacturerWebsite() {
        return manufacturerWebsite;
    }

    public void setManufacturerWebsite(String manufacturerWebsite) {
        this.manufacturerWebsite = manufacturerWebsite;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
