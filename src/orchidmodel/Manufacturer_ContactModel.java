package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class Manufacturer_ContactModel {
    private int manufacturerContactID;
    private int manufacturerID;
    private String manufacturerContactFirstName;
    private String manufacturerContactLastName;
    private String manufacturerContactPhone;
    private String manufacturerContactExtension;
    private String manufacturerContactEmail;
    private boolean isDeleted;

    public Manufacturer_ContactModel(int manufacturerContactID, int manufacturerID,
                                     String manufacturerContactFirstName, String manufacturerContactLastName,
                                     String manufacturerContactPhone, String manufacturerContactExtension,
                                     String manufacturerContactEmail, boolean isDeleted)
    {
        this.manufacturerContactID = manufacturerContactID;
        this.manufacturerID = manufacturerID;
        this.manufacturerContactFirstName = manufacturerContactFirstName;
        this.manufacturerContactLastName = manufacturerContactLastName;
        this.manufacturerContactPhone = manufacturerContactPhone;
        this.manufacturerContactExtension = manufacturerContactExtension;
        this.manufacturerContactEmail = manufacturerContactEmail;
        this.isDeleted = isDeleted;
    }

    public int getManufacturerContactID() {
        return manufacturerContactID;
    }

    public void setManufacturerContactID(int manufacturerContactID) {
        this.manufacturerContactID = manufacturerContactID;
    }

    public int getManufacturerID() {
        return manufacturerID;
    }

    public void setManufacturerID(int manufacturerID) {
        this.manufacturerID = manufacturerID;
    }

    public String getManufacturerContactFirstName() {
        return manufacturerContactFirstName;
    }

    public void setManufacturerContactFirstName(String manufacturerContactFirstName) {
        this.manufacturerContactFirstName = manufacturerContactFirstName;
    }

    public String getManufacturerContactLastName() {
        return manufacturerContactLastName;
    }

    public void setManufacturerContactLastName(String manufacturerContactLastName) {
        this.manufacturerContactLastName = manufacturerContactLastName;
    }

    public String getManufacturerContactPhone() {
        return manufacturerContactPhone;
    }

    public void setManufacturerContactPhone(String manufacturerContactPhone) {
        this.manufacturerContactPhone = manufacturerContactPhone;
    }

    public String getManufacturerContactExtension() {
        return manufacturerContactExtension;
    }

    public void setManufacturerContactExtension(String manufacturerContactExtension) {
        this.manufacturerContactExtension = manufacturerContactExtension;
    }

    public String getManufacturerContactEmail() {
        return manufacturerContactEmail;
    }

    public void setManufacturerContactEmail(String manufacturerContactEmail) {
        this.manufacturerContactEmail = manufacturerContactEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}






