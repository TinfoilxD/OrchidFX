package orchidmodel;/*
 * Written by Joshua Joseph on 3/20/16.
 */

public class Contractor_Contact_TypeModel {
    private int contractorContactTypeID;
    private String contractorContactType;
    private boolean isDeleted;

    public Contractor_Contact_TypeModel()
    {

    }

    public Contractor_Contact_TypeModel(int contractorContactTypeID, String contractorContactType, boolean isDeleted)
    {
        this.contractorContactTypeID = contractorContactTypeID;
        this.contractorContactType = contractorContactType;
        this.isDeleted = isDeleted;
    }

    public int getContractorContactTypeID() {
        return contractorContactTypeID;
    }

    public void setContractorContactTypeID(int contractorContactTypeID) {
        this.contractorContactTypeID = contractorContactTypeID;
    }

    public String getContractorContactType() {
        return contractorContactType;
    }

    public void setContractorContactType(String contractorContactType) {
        this.contractorContactType = contractorContactType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





