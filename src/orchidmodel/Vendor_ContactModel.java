package orchidmodel;/*
 * Written by Joshua Joseph on 3/22/16.
 */

public class Vendor_ContactModel {
    private int vendorContactID;
    private int vendorID;
    private String vendorContactFirstName;
    private String vendorContactLastName;
    private String vendorContactPhone;
    private String vendorContactExtension;
    private String vendorContactEmail;
    private boolean isDeleted;

    public Vendor_ContactModel(int vendorContactID, int vendorID, String vendorContactFirstName,
                               String vendorContactLastName, String vendorContactPhone,
                               String vendorContactExtension, String vendorContactEmail, boolean isDeleted)
    {
        this.vendorContactID = vendorContactID;
        this.vendorID = vendorID;
        this.vendorContactFirstName = vendorContactFirstName;
        this.vendorContactLastName = vendorContactLastName;
        this.vendorContactPhone = vendorContactPhone;
        this.vendorContactExtension = vendorContactExtension;
        this.vendorContactEmail = vendorContactEmail;
        this.isDeleted = isDeleted;
    }

    public int getVendorContactID() {
        return vendorContactID;
    }

    public void setVendorContactID(int vendorContactID) {
        this.vendorContactID = vendorContactID;
    }

    public int getVendorID() {
        return vendorID;
    }

    public void setVendorID(int vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorContactFirstName() {
        return vendorContactFirstName;
    }

    public void setVendorContactFirstName(String vendorContactFirstName) {
        this.vendorContactFirstName = vendorContactFirstName;
    }

    public String getVendorContactLastName() {
        return vendorContactLastName;
    }

    public void setVendorContactLastName(String vendorContactLastName) {
        this.vendorContactLastName = vendorContactLastName;
    }

    public String getVendorContactPhone() {
        return vendorContactPhone;
    }

    public void setVendorContactPhone(String vendorContactPhone) {
        this.vendorContactPhone = vendorContactPhone;
    }

    public String getVendorContactExtension() {
        return vendorContactExtension;
    }

    public void setVendorContactExtension(String vendorContactExtension) {
        this.vendorContactExtension = vendorContactExtension;
    }

    public String getVendorContactEmail() {
        return vendorContactEmail;
    }

    public void setVendorContactEmail(String vendorContactEmail) {
        this.vendorContactEmail = vendorContactEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





