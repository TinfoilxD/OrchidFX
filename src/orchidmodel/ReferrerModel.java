package orchidmodel;/*
 * Written Joshua Joseph on 3/22/16.
 */

public class ReferrerModel
{
    private int referrerID;
    private int referrerTypeID;
    private String referrerFirstName;
    private String referrerLastName;
    private String referrerAddress1;
    private String referrerAddress2;
    private String referrerAddress3;
    private String referrerCity;
    private int stateID;
    private String referrerZipCode;
    private int countryID;
    private String referrerPhone;
    private String referrerExtension;
    private String referrerEmail;
    private boolean isDeleted;

    public ReferrerModel()
    {

    }

    public ReferrerModel(int referrerID, int referrerTypeID, String referrerFirstName,
                         String referrerLastName, String referrerAddress1, String referrerAddress2,
                         String referrerAddress3, String referrerCity, int stateID,
                         String referrerZipCode, int countryID, String referrerPhone,
                         String referrerExtension, String referrerEmail, boolean isDeleted)
    {
        this.referrerID = referrerID;
        this.referrerTypeID = referrerTypeID;
        this.referrerFirstName = referrerFirstName;
        this.referrerLastName = referrerLastName;
        this.referrerAddress1 = referrerAddress1;
        this.referrerAddress2 = referrerAddress2;
        this.referrerAddress3 = referrerAddress3;
        this.referrerCity = referrerCity;
        this.stateID = stateID;
        this.referrerZipCode = referrerZipCode;
        this.countryID = countryID;
        this.referrerPhone = referrerPhone;
        this.referrerExtension = referrerExtension;
        this.referrerEmail = referrerEmail;
        this.isDeleted = isDeleted;
    }

    public int getReferrerID() {
        return referrerID;
    }

    public void setReferrerID(int referrerID) {
        this.referrerID = referrerID;
    }

    public int getReferrerTypeID() {
        return referrerTypeID;
    }

    public void setReferrerTypeID(int referrerTypeID) {
        this.referrerTypeID = referrerTypeID;
    }

    public String getReferrerFirstName() {
        return referrerFirstName;
    }

    public void setReferrerFirstName(String referrerFirstName) {
        this.referrerFirstName = referrerFirstName;
    }

    public String getReferrerLastName() {
        return referrerLastName;
    }

    public void setReferrerLastName(String referrerLastName) {
        this.referrerLastName = referrerLastName;
    }

    public String getReferrerAddress1() {
        return referrerAddress1;
    }

    public void setReferrerAddress1(String referrerAddress1) {
        this.referrerAddress1 = referrerAddress1;
    }

    public String getReferrerAddress2() {
        return referrerAddress2;
    }

    public void setReferrerAddress2(String referrerAddress2) {
        this.referrerAddress2 = referrerAddress2;
    }

    public String getReferrerAddress3() {
        return referrerAddress3;
    }

    public void setReferrerAddress3(String referrerAddress3) {
        this.referrerAddress3 = referrerAddress3;
    }

    public String getReferrerCity() {
        return referrerCity;
    }

    public void setReferrerCity(String referrerCity) {
        this.referrerCity = referrerCity;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getReferrerZipCode() {
        return referrerZipCode;
    }

    public void setReferrerZipCode(String referrerZipCode) {
        this.referrerZipCode = referrerZipCode;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getReferrerPhone() {
        return referrerPhone;
    }

    public void setReferrerPhone(String referrerPhone) {
        this.referrerPhone = referrerPhone;
    }

    public String getReferrerExtension() {
        return referrerExtension;
    }

    public void setReferrerExtension(String referrerExtension) {
        this.referrerExtension = referrerExtension;
    }

    public String getReferrerEmail() {
        return referrerEmail;
    }

    public void setReferrerEmail(String referrerEmail) {
        this.referrerEmail = referrerEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
