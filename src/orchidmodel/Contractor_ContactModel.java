package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class Contractor_ContactModel {
    private int contractorContactID;
    private int contractorID;
    private String contractorContactFirstName;
    private String contractorContactLastName;
    private String contractorContactPhone;
    private String contractorContactExtension;
    private String contractorContactEmail;
    private boolean isDeleted;

    public Contractor_ContactModel(int contractorContactID, int contractorID,
                                   String contractorContactFirstName, String contractorContactLastName,
                                   String contractorContactPhone, String contractorContactExtension,
                                   String contractorContactEmail, boolean isDeleted)
    {
        this.contractorContactID = contractorContactID;
        this.contractorID = contractorID;
        this.contractorContactFirstName = contractorContactFirstName;
        this.contractorContactLastName = contractorContactLastName;
        this.contractorContactPhone = contractorContactPhone;
        this.contractorContactExtension = contractorContactExtension;
        this.contractorContactEmail = contractorContactEmail;
        this.isDeleted = isDeleted;
    }

    public int getContractorContactID() {
        return contractorContactID;
    }

    public void setContractorContactID(int contractorContactID) {
        this.contractorContactID = contractorContactID;
    }

    public int getContractorID() {
        return contractorID;
    }

    public void setContractorID(int contractorID) {
        this.contractorID = contractorID;
    }

    public String getContractorContactFirstName() {
        return contractorContactFirstName;
    }

    public void setContractorContactFirstName(String contractorContactFirstName) {
        this.contractorContactFirstName = contractorContactFirstName;
    }

    public String getContractorContactLastName() {
        return contractorContactLastName;
    }

    public void setContractorContactLastName(String contractorContactLastName) {
        this.contractorContactLastName = contractorContactLastName;
    }

    public String getContractorContactPhone() {
        return contractorContactPhone;
    }

    public void setContractorContactPhone(String contractorContactPhone) {
        this.contractorContactPhone = contractorContactPhone;
    }

    public String getContractorContactExtension() {
        return contractorContactExtension;
    }

    public void setContractorContactExtension(String contractorContactExtension) {
        this.contractorContactExtension = contractorContactExtension;
    }

    public String getContractorContactEmail() {
        return contractorContactEmail;
    }

    public void setContractorContactEmail(String contractorContactEmail) {
        this.contractorContactEmail = contractorContactEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}






