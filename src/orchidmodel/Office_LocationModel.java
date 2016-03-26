package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class Office_LocationModel {
    private int officeID;
    private String officeName;
    private String officeAddress1;
    private String officeAddress2;
    private String officeAddress3;
    private String officeCity;
    private int stateID;
    private String officeZipCode;
    private int countryID;
    private String officePhone;
    private boolean isDeleted;

    public Office_LocationModel()
    {

    }

    public Office_LocationModel(int officeID, String officeName, String officeAddress1,
                                String officeAddress2, String officeAddress3, String officeCity,
                                int stateID, String officeZipCode, int countryID, String officePhone,
                                boolean isDeleted)
    {
        this.officeID = officeID;
        this.officeName = officeName;
        this.officeAddress1 = officeAddress1;
        this.officeAddress2 = officeAddress2;
        this.officeAddress3 = officeAddress3;
        this.officeCity = officeCity;
        this.stateID = stateID;
        this.officeZipCode = officeZipCode;
        this.countryID = countryID;
        this.officePhone = officePhone;
        this.isDeleted = isDeleted;
    }

    public int getOfficeID() {
        return officeID;
    }

    public void setOfficeID(int officeID) {
        this.officeID = officeID;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getOfficeAddress1() {
        return officeAddress1;
    }

    public void setOfficeAddress1(String officeAddress1) {
        this.officeAddress1 = officeAddress1;
    }

    public String getOfficeAddress2() {
        return officeAddress2;
    }

    public void setOfficeAddress2(String officeAddress2) {
        this.officeAddress2 = officeAddress2;
    }

    public String getOfficeAddress3() {
        return officeAddress3;
    }

    public void setOfficeAddress3(String officeAddress3) {
        this.officeAddress3 = officeAddress3;
    }

    public String getOfficeCity() {
        return officeCity;
    }

    public void setOfficeCity(String officeCity) {
        this.officeCity = officeCity;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getOfficeZipCode() {
        return officeZipCode;
    }

    public void setOfficeZipCode(String officeZipCode) {
        this.officeZipCode = officeZipCode;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getOfficePhone() {
        return officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





