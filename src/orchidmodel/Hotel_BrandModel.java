package orchidmodel;/*
 * Written Joshua Joseph on 3/21/16.
 */

public class Hotel_BrandModel
{
    private int hotelBrandID;
    private int parentBrandID;
    private String hotelBrandName;
    private String hotelBrandAddress1;
    private String hotelBrandAddress2;
    private String hotelBrandAddress3;
    private String hotelBrandCity;
    private int stateID;
    private String hotelBrandZipCode;
    private int countryID;
    private String hotelBrandPhone;
    private String hotelBrandWebsite;
    private String hotelBrandEmail;
    private boolean isDeleted;

    public Hotel_BrandModel(int hotelBrandID, int parentBrandID, String hotelBrandName,
                            String hotelBrandAddress1, String hotelBrandAddress2,
                            String hotelBrandAddress3, String hotelBrandCity, int stateID,
                            String hotelBrandZipCode, int countryID, String hotelBrandPhone,
                            String hotelBrandWebsite, String hotelBrandEmail, boolean isDeleted)
    {
        this.hotelBrandID = hotelBrandID;
        this.parentBrandID = parentBrandID;
        this.hotelBrandName = hotelBrandName;
        this.hotelBrandAddress1 = hotelBrandAddress1;
        this.hotelBrandAddress2 = hotelBrandAddress2;
        this.hotelBrandAddress3 = hotelBrandAddress3;
        this.hotelBrandCity = hotelBrandCity;
        this.stateID = stateID;
        this.hotelBrandZipCode = hotelBrandZipCode;
        this.countryID = countryID;
        this.hotelBrandPhone = hotelBrandPhone;
        this.hotelBrandWebsite = hotelBrandWebsite;
        this.hotelBrandEmail = hotelBrandEmail;
        this.isDeleted = isDeleted;
    }

    public int getHotelBrandID() {
        return hotelBrandID;
    }

    public void setHotelBrandID(int hotelBrandID) {
        this.hotelBrandID = hotelBrandID;
    }

    public int getParentBrandID() {
        return parentBrandID;
    }

    public void setParentBrandID(int parentBrandID) {
        this.parentBrandID = parentBrandID;
    }

    public String getHotelBrandName() {
        return hotelBrandName;
    }

    public void setHotelBrandName(String hotelBrandName) {
        this.hotelBrandName = hotelBrandName;
    }

    public String getHotelBrandAddress1() {
        return hotelBrandAddress1;
    }

    public void setHotelBrandAddress1(String hotelBrandAddress1) {
        this.hotelBrandAddress1 = hotelBrandAddress1;
    }

    public String getHotelBrandAddress2() {
        return hotelBrandAddress2;
    }

    public void setHotelBrandAddress2(String hotelBrandAddress2) {
        this.hotelBrandAddress2 = hotelBrandAddress2;
    }

    public String getHotelBrandAddress3() {
        return hotelBrandAddress3;
    }

    public void setHotelBrandAddress3(String hotelBrandAddress3) {
        this.hotelBrandAddress3 = hotelBrandAddress3;
    }

    public String getHotelBrandCity() {
        return hotelBrandCity;
    }

    public void setHotelBrandCity(String hotelBrandCity) {
        this.hotelBrandCity = hotelBrandCity;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getHotelBrandZipCode() {
        return hotelBrandZipCode;
    }

    public void setHotelBrandZipCode(String hotelBrandZipCode) {
        this.hotelBrandZipCode = hotelBrandZipCode;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getHotelBrandPhone() {
        return hotelBrandPhone;
    }

    public void setHotelBrandPhone(String hotelBrandPhone) {
        this.hotelBrandPhone = hotelBrandPhone;
    }

    public String getHotelBrandWebsite() {
        return hotelBrandWebsite;
    }

    public void setHotelBrandWebsite(String hotelBrandWebsite) {
        this.hotelBrandWebsite = hotelBrandWebsite;
    }

    public String getHotelBrandEmail() {
        return hotelBrandEmail;
    }

    public void setHotelBrandEmail(String hotelBrandEmail) {
        this.hotelBrandEmail = hotelBrandEmail;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
