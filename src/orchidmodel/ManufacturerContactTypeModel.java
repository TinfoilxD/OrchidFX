package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class ManufacturerContactTypeModel
{
    private int manufacturerContactTypeID;
    private String manufacturerContactType;
    private boolean isDeleted;

    public ManufacturerContactTypeModel()
    {

    }

    public ManufacturerContactTypeModel(int manufacturerContactTypeID, String manufacturerContactType, boolean isDeleted)
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





