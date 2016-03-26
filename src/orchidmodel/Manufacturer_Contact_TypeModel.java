package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class Manufacturer_Contact_TypeModel {
    private int manufacturerContactTypeID;
    private String manufacturerContactType;
    private boolean isDeleted;

    public Manufacturer_Contact_TypeModel(int manufacturerContactTypeID, String manufacturerContactType, boolean isDeleted)
    {
        this.manufacturerContactTypeID = manufacturerContactTypeID;
        this.manufacturerContactType = manufacturerContactType;
        this.isDeleted = isDeleted;
    }

    public int getManufacturerContactTypeID() {
        return manufacturerContactTypeID;
    }

    public void setManufacturerContactTypeID(int manufacturerContactTypeID) {
        this.manufacturerContactTypeID = manufacturerContactTypeID;
    }

    public String getManufacturerContactType() {
        return manufacturerContactType;
    }

    public void setManufacturerContactType(String manufacturerContactType) {
        this.manufacturerContactType = manufacturerContactType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





