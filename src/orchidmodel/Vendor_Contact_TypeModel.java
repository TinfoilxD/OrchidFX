package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class Vendor_Contact_TypeModel {
    private int vendorContactTypeID;
    private String vendorContactType;
    private boolean isDeleted;

    public Vendor_Contact_TypeModel(int vendorContactTypeID, String vendorContactType, boolean isDeleted)
    {
        this.vendorContactTypeID = vendorContactTypeID;
        this.vendorContactType = vendorContactType;
        this.isDeleted = isDeleted;
    }

    public int getVendorContactTypeID() {
        return vendorContactTypeID;
    }

    public void setVendorContactTypeID(int vendorContactTypeID) {
        this.vendorContactTypeID = vendorContactTypeID;
    }

    public String getVendorContactType() {
        return vendorContactType;
    }

    public void setVendorContactType(String vendorContactType) {
        this.vendorContactType = vendorContactType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





