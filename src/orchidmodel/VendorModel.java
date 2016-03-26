package orchidmodel;/*
 * Written Joshua Joseph on 3/22/16.
 */

public class VendorModel
{
    private int vendorID;
    private int cmvStatusID;
    private String vendorName;
    private String vendorBillingAddress1;
    private String vendorBillingAddress2;
    private String vendorBillingAddress3;
    private String vendorBillingCity;
    private int billingStateID;
    private String vendorBillingZipCode;
    private int billingCountryID;
    private String vendorShippingAddress1;
    private String vendorShippingAddress2;
    private String vendorShippingAddress3;
    private String vendorShippingCity;
    private int shippingStateID;
    private String vendorShippingZipCode;
    private int shippingCountryID;
    private String vendorPhone;
    private String vendorWebsite;
    private boolean isDeleted;

    public VendorModel(int vendorID, int cmvStatusID, String vendorName,
                       String vendorBillingAddress1, String vendorBillingAddress2,
                       String vendorBillingAddress3, String vendorBillingCity,
                       int billingStateID, String vendorBillingZipCode, int billingCountryID,
                       String vendorShippingAddress1, String vendorShippingAddress2,
                       String vendorShippingAddress3, String vendorShippingCity,
                       int shippingStateID, String vendorShippingZipCode, int shippingCountryID,
                       String vendorPhone, String vendorWebsite, boolean isDeleted)
    {
        this.vendorID = vendorID;
        this.cmvStatusID = cmvStatusID;
        this.vendorName = vendorName;
        this.vendorBillingAddress1 = vendorBillingAddress1;
        this.vendorBillingAddress2 = vendorBillingAddress2;
        this.vendorBillingAddress3 = vendorBillingAddress3;
        this.vendorBillingCity = vendorBillingCity;
        this.billingStateID = billingStateID;
        this.vendorBillingZipCode = vendorBillingZipCode;
        this.billingCountryID = billingCountryID;
        this.vendorShippingAddress1 = vendorShippingAddress1;
        this.vendorShippingAddress2 = vendorShippingAddress2;
        this.vendorShippingAddress3 = vendorShippingAddress3;
        this.vendorShippingCity = vendorShippingCity;
        this.shippingStateID = shippingStateID;
        this.vendorShippingZipCode = vendorShippingZipCode;
        this.shippingCountryID = shippingCountryID;
        this.vendorPhone = vendorPhone;
        this.vendorWebsite = vendorWebsite;
        this.isDeleted = isDeleted;
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public int getCmvStatusID() {
        return cmvStatusID;
    }

    public void setCmvStatusID(int cmvStatusID) {
        this.cmvStatusID = cmvStatusID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorBillingAddress1() {
        return vendorBillingAddress1;
    }

    public void setVendorBillingAddress1(String vendorBillingAddress1) {
        this.vendorBillingAddress1 = vendorBillingAddress1;
    }

    public String getVendorBillingAddress2() {
        return vendorBillingAddress2;
    }

    public void setVendorBillingAddress2(String vendorBillingAddress2) {
        this.vendorBillingAddress2 = vendorBillingAddress2;
    }

    public String getVendorBillingAddress3() {
        return vendorBillingAddress3;
    }

    public void setVendorBillingAddress3(String vendorBillingAddress3) {
        this.vendorBillingAddress3 = vendorBillingAddress3;
    }

    public String getVendorBillingCity() {
        return vendorBillingCity;
    }

    public void setVendorBillingCity(String vendorBillingCity) {
        this.vendorBillingCity = vendorBillingCity;
    }

    public int getBillingStateID() {
        return billingStateID;
    }

    public void setBillingStateID(int billingStateID) {
        this.billingStateID = billingStateID;
    }

    public String getVendorBillingZipCode() {
        return vendorBillingZipCode;
    }

    public void setVendorBillingZipCode(String vendorBillingZipCode) {
        this.vendorBillingZipCode = vendorBillingZipCode;
    }

    public int getBillingCountryID() {
        return billingCountryID;
    }

    public void setBillingCountryID(int billingCountryID) {
        this.billingCountryID = billingCountryID;
    }

    public String getVendorShippingAddress1() {
        return vendorShippingAddress1;
    }

    public void setVendorShippingAddress1(String vendorShippingAddress1) {
        this.vendorShippingAddress1 = vendorShippingAddress1;
    }

    public String getVendorShippingAddress2() {
        return vendorShippingAddress2;
    }

    public void setVendorShippingAddress2(String vendorShippingAddress2) {
        this.vendorShippingAddress2 = vendorShippingAddress2;
    }

    public String getVendorShippingAddress3() {
        return vendorShippingAddress3;
    }

    public void setVendorShippingAddress3(String vendorShippingAddress3) {
        this.vendorShippingAddress3 = vendorShippingAddress3;
    }

    public String getVendorShippingCity() {
        return vendorShippingCity;
    }

    public void setVendorShippingCity(String vendorShippingCity) {
        this.vendorShippingCity = vendorShippingCity;
    }

    public int getShippingStateID() {
        return shippingStateID;
    }

    public void setShippingStateID(int shippingStateID) {
        this.shippingStateID = shippingStateID;
    }

    public String getVendorShippingZipCode() {
        return vendorShippingZipCode;
    }

    public void setVendorShippingZipCode(String vendorShippingZipCode) {
        this.vendorShippingZipCode = vendorShippingZipCode;
    }

    public int getShippingCountryID() {
        return shippingCountryID;
    }

    public void setShippingCountryID(int shippingCountryID) {
        this.shippingCountryID = shippingCountryID;
    }

    public String getVendorPhone() {
        return vendorPhone;
    }

    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }

    public String getVendorWebsite() {
        return vendorWebsite;
    }

    public void setVendorWebsite(String vendorWebsite) {
        this.vendorWebsite = vendorWebsite;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
