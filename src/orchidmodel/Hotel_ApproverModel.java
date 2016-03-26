package orchidmodel;/*
 * Written Joshua Joseph on 3/21/16.
 */

public class Hotel_ApproverModel
{
    private int hotelApproverID;
    private int hotelBrandID;
    private String approverFirstName;
    private String approverLastName;
    private String approverAddress1;
    private String approverAddress2;
    private String approverAddress3;
    private String approverCity;
    private int stateID;
    private String approverZipCode;
    private int countryID;
    private String approverPhone;
    private String approverExtension;
    private String approverEmail;
    private String approverWebsite;
    private boolean isDeleted;

    public Hotel_ApproverModel()
    {

    }

    public Hotel_ApproverModel(int hotelApproverID, int hotelBrandID, String approverFirstName,
                               String approverLastName, String approverAddress1, String approverAddress2,
                               String approverAddress3, String approverCity, int stateID,
                               String approverZipCode, int countryID, String approverPhone,
                               String approverExtension, String approverEmail, String approverWebsite,
                               boolean isDeleted)
    {
        this.hotelApproverID = hotelApproverID;
        this.hotelBrandID = hotelBrandID;
        this.approverFirstName = approverFirstName;
        this.approverLastName = approverLastName;
        this.approverAddress1 = approverAddress1;
        this.approverAddress2 = approverAddress2;
        this.approverAddress3 = approverAddress3;
        this.approverCity = approverCity;
        this.stateID = stateID;
        this.approverZipCode = approverZipCode;
        this.countryID = countryID;
        this.approverPhone = approverPhone;
        this.approverExtension = approverExtension;
        this.approverEmail = approverEmail;
        this.approverWebsite = approverWebsite;
        this.isDeleted = isDeleted;
    }

    public int getHotelApproverID() {
        return hotelApproverID;
    }

    public void setHotelApproverID(int hotelApproverID) {
        this.hotelApproverID = hotelApproverID;
    }

    public int getHotelBrandID() {
        return hotelBrandID;
    }

    public void setHotelBrandID(int hotelBrandID) {
        this.hotelBrandID = hotelBrandID;
    }

    public String getApproverFirstName() {
        return approverFirstName;
    }

    public void setApproverFirstName(String approverFirstName) {
        this.approverFirstName = approverFirstName;
    }

    public String getApproverLastName() {
        return approverLastName;
    }

    public void setApproverLastName(String approverLastName) {
        this.approverLastName = approverLastName;
    }

    public String getApproverAddress1() {
        return approverAddress1;
    }

    public void setApproverAddress1(String approverAddress1) {
        this.approverAddress1 = approverAddress1;
    }

    public String getApproverAddress2() {
        return approverAddress2;
    }

    public void setApproverAddress2(String approverAddress2) {
        this.approverAddress2 = approverAddress2;
    }

    public String getApproverAddress3() {
        return approverAddress3;
    }

    public void setApproverAddress3(String approverAddress3) {
        this.approverAddress3 = approverAddress3;
    }

    public String getApproverCity() {
        return approverCity;
    }

    public void setApproverCity(String approverCity) {
        this.approverCity = approverCity;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getApproverZipCode() {
        return approverZipCode;
    }

    public void setApproverZipCode(String approverZipCode) {
        this.approverZipCode = approverZipCode;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getApproverPhone() {
        return approverPhone;
    }

    public void setApproverPhone(String approverPhone) {
        this.approverPhone = approverPhone;
    }

    public String getApproverExtension() {
        return approverExtension;
    }

    public void setApproverExtension(String approverExtension) {
        this.approverExtension = approverExtension;
    }

    public String getApproverEmail() {
        return approverEmail;
    }

    public void setApproverEmail(String approverEmail) {
        this.approverEmail = approverEmail;
    }

    public String getApproverWebsite() {
        return approverWebsite;
    }

    public void setApproverWebsite(String approverWebsite) {
        this.approverWebsite = approverWebsite;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
