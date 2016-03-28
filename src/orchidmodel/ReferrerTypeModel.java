package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class ReferrerTypeModel
{
    private int referrerTypeID;
    private String referrerType;
    private boolean isDeleted;

    public ReferrerTypeModel()
    {

    }

    public ReferrerTypeModel(int referrerTypeID, String referrerType, boolean isDeleted)
    {
        this.referrerTypeID = referrerTypeID;
        this.referrerType = referrerType;
        this.isDeleted = isDeleted;
    }

    public int getReferrerTypeID() {
        return referrerTypeID;
    }

    public void setReferrerTypeID(int referrerTypeID) {
        this.referrerTypeID = referrerTypeID;
    }

    public String getReferrerType() {
        return referrerType;
    }

    public void setReferrerType(String referrerType) {
        this.referrerType = referrerType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





