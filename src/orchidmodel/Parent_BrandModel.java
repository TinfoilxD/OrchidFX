package orchidmodel;/*
 * Written Joshua Joseph on 3/21/16.
 */

public class Parent_BrandModel
{
    private int parentBrandID;
    private String parentBrandName;
    private String parentBrandAddress1;
    private String parentBrandAddress2;
    private String parentBrandAddress3;
    private String parentBrandCity;
    private int stateID;
    private String parentBrandZipCode;
    private int countryID;
    private String parentPhone;
    private String parentWebsite;
    private boolean isDeleted;

    public Parent_BrandModel()
    {

    }

    public Parent_BrandModel(int parentBrandID, String parentBrandName, String parentBrandAddress1,
                             String parentBrandAddress2, String parentBrandAddress3, String parentBrandCity,
                             int stateID, String parentBrandZipCode, int countryID, String parentPhone,
                             String parentWebsite, boolean isDeleted)
    {
        this.parentBrandID = parentBrandID;
        this.parentBrandName = parentBrandName;
        this.parentBrandAddress1 = parentBrandAddress1;
        this.parentBrandAddress2 = parentBrandAddress2;
        this.parentBrandAddress3 = parentBrandAddress3;
        this.parentBrandCity = parentBrandCity;
        this.stateID = stateID;
        this.parentBrandZipCode = parentBrandZipCode;
        this.countryID = countryID;
        this.parentPhone = parentPhone;
        this.parentWebsite = parentWebsite;
        this.isDeleted = isDeleted;
    }

    public int getParentBrandID() {
        return parentBrandID;
    }

    public void setParentBrandID(int parentBrandID) {
        this.parentBrandID = parentBrandID;
    }

    public String getParentBrandName() {
        return parentBrandName;
    }

    public void setParentBrandName(String parentBrandName) {
        this.parentBrandName = parentBrandName;
    }

    public String getParentBrandAddress1() {
        return parentBrandAddress1;
    }

    public void setParentBrandAddress1(String parentBrandAddress1) {
        this.parentBrandAddress1 = parentBrandAddress1;
    }

    public String getParentBrandAddress2() {
        return parentBrandAddress2;
    }

    public void setParentBrandAddress2(String parentBrandAddress2) {
        this.parentBrandAddress2 = parentBrandAddress2;
    }

    public String getParentBrandAddress3() {
        return parentBrandAddress3;
    }

    public void setParentBrandAddress3(String parentBrandAddress3) {
        this.parentBrandAddress3 = parentBrandAddress3;
    }

    public String getParentBrandCity() {
        return parentBrandCity;
    }

    public void setParentBrandCity(String parentBrandCity) {
        this.parentBrandCity = parentBrandCity;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getParentBrandZipCode() {
        return parentBrandZipCode;
    }

    public void setParentBrandZipCode(String parentBrandZipCode) {
        this.parentBrandZipCode = parentBrandZipCode;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getParentPhone() {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone) {
        this.parentPhone = parentPhone;
    }

    public String getParentWebsite() {
        return parentWebsite;
    }

    public void setParentWebsite(String parentWebsite) {
        this.parentWebsite = parentWebsite;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
