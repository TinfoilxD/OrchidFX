package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class ContractorModel
{
    private int contractorID;
    private int cmvStatusID;
    private String contractorName;
    private String contractorBillingAddress1;
    private String contractorBillingAddress2;
    private String contractorBillingAddress3;
    private String contractorBillingCity;
    private int billingStateID;
    private String contractorBillingZipCode;
    private int billingCountryID;
    private String contractorShippingAddress1;
    private String contractorShippingAddress2;
    private String contractorShippingAddress3;
    private String contractorShippingCity;
    private int shippingStateID;
    private String contractorShippingZipCode;
    private int shippingCountryID;
    private String contractorPhone;
    private String contractorEmail;
    private boolean isDeleted;

    public ContractorModel(int contractorID, int cmvStatusID, String contractorName,
                           String contractorBillingAddress1, String contractorBillingAddress2,
                           String contractorBillingAddress3, String contractorBillingCity,
                           int billingStateID, String contractorBillingZipCode, int billingCountryID,
                           String contractorShippingAddress1, String contractorShippingAddress2,
                           String contractorShippingAddress3, String contractorShippingCity,
                           int shippingStateID, String contractorShippingZipCode, int shippingCountryID,
                           String contractorPhone, String contractorEmail, boolean isDeleted)
    {
        this.contractorID = contractorID;
        this.cmvStatusID = cmvStatusID;
        this.contractorName = contractorName;
        this.contractorBillingAddress1 = contractorBillingAddress1;
        this.contractorBillingAddress2 = contractorBillingAddress2;
        this.contractorBillingAddress3 = contractorBillingAddress3;
        this.contractorBillingCity = contractorBillingCity;
        this.billingStateID = billingStateID;
        this.contractorBillingZipCode = contractorBillingZipCode;
        this.billingCountryID = billingCountryID;
        this.contractorShippingAddress1 = contractorShippingAddress1;
        this.contractorShippingAddress2 = contractorShippingAddress2;
        this.contractorShippingAddress3 = contractorShippingAddress3;
        this.contractorShippingCity = contractorShippingCity;
        this.shippingStateID = shippingStateID;
        this.contractorShippingZipCode = contractorShippingZipCode;
        this.shippingCountryID = shippingCountryID;
        this.contractorPhone = contractorPhone;
        this.contractorEmail = contractorEmail;
        this.isDeleted = isDeleted;
    }

    public int getContractorID() {
        return contractorID;
    }

    public void setContractorID(int contractorID) {
        this.contractorID = contractorID;
    }

    public int getCmvStatusID() {
        return cmvStatusID;
    }

    public void setCmvStatusID(int cmvStatusID) {
        this.cmvStatusID = cmvStatusID;
    }

    public String getContractorName() {
        return contractorName;
    }

    public void setContractorName(String contractorName) {
        this.contractorName = contractorName;
    }

    public String getContractorBillingAddress1() {
        return contractorBillingAddress1;
    }

    public void setContractorBillingAddress1(String contractorBillingAddress1) {
        this.contractorBillingAddress1 = contractorBillingAddress1;
    }

    public String getContractorBillingAddress2() {
        return contractorBillingAddress2;
    }

    public void setContractorBillingAddress2(String contractorBillingAddress2) {
        this.contractorBillingAddress2 = contractorBillingAddress2;
    }

    public String getContractorBillingAddress3() {
        return contractorBillingAddress3;
    }

    public void setContractorBillingAddress3(String contractorBillingAddress3) {
        this.contractorBillingAddress3 = contractorBillingAddress3;
    }

    public String getContractorBillingCity() {
        return contractorBillingCity;
    }

    public void setContractorBillingCity(String contractorBillingCity) {
        this.contractorBillingCity = contractorBillingCity;
    }

    public int getBillingStateID() {
        return billingStateID;
    }

    public void setBillingStateID(int billingStateID) {
        this.billingStateID = billingStateID;
    }

    public String getContractorBillingZipCode() {
        return contractorBillingZipCode;
    }

    public void setContractorBillingZipCode(String contractorBillingZipCode) {
        this.contractorBillingZipCode = contractorBillingZipCode;
    }

    public int getBillingCountryID() {
        return billingCountryID;
    }

    public void setBillingCountryID(int billingCountryID) {
        this.billingCountryID = billingCountryID;
    }

    public String getContractorShippingAddress1() {
        return contractorShippingAddress1;
    }

    public void setContractorShippingAddress1(String contractorShippingAddress1) {
        this.contractorShippingAddress1 = contractorShippingAddress1;
    }

    public String getContractorShippingAddress2() {
        return contractorShippingAddress2;
    }

    public void setContractorShippingAddress2(String contractorShippingAddress2) {
        this.contractorShippingAddress2 = contractorShippingAddress2;
    }

    public String getContractorShippingAddress3() {
        return contractorShippingAddress3;
    }

    public void setContractorShippingAddress3(String contractorShippingAddress3) {
        this.contractorShippingAddress3 = contractorShippingAddress3;
    }

    public String getContractorShippingCity() {
        return contractorShippingCity;
    }

    public void setContractorShippingCity(String contractorShippingCity) {
        this.contractorShippingCity = contractorShippingCity;
    }

    public int getShippingStateID() {
        return shippingStateID;
    }

    public void setShippingStateID(int shippingStateID) {
        this.shippingStateID = shippingStateID;
    }

    public String getContractorShippingZipCode() {
        return contractorShippingZipCode;
    }

    public void setContractorShippingZipCode(String contractorShippingZipCode) {
        this.contractorShippingZipCode = contractorShippingZipCode;
    }

    public int getShippingCountryID() {
        return shippingCountryID;
    }

    public void setShippingCountryID(int shippingCountryID) {
        this.shippingCountryID = shippingCountryID;
    }

    public String getContractorPhone() {
        return contractorPhone;
    }

    public void setContractorPhone(String contractorPhone) {
        this.contractorPhone = contractorPhone;
    }

    public String getContractorEmail() {
        return contractorEmail;
    }

    public void setContractorEmail(String contractorEmail) {
        this.contractorEmail = contractorEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
