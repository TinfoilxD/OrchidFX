package orchidmodel;/*
 * Written Joshua Joseph on 3/21/16.
 */

public class Hotel_PropertyModel
{
    private int hotelPropertyID;
    private int hotelBrandID;
    private int clientID;
    private String hotelPropertyName;
    private int hotelPropertyStatusID;
    private String hotelPropertyAddress1;
    private String hotelPropertyAddress2;
    private String hotelPropertyAddress3;
    private String hotelPropertyCity;
    private int stateID;
    private String hotelPropertyZipCode;
    private int countryID;
    private boolean isDeleted;

    public Hotel_PropertyModel(int hotelPropertyID, int hotelBrandID, int clientID,
                               String hotelPropertyName, int hotelPropertyStatusID,
                               String hotelPropertyAddress1, String hotelPropertyAddress2,
                               String hotelPropertyAddress3, String hotelPropertyCity,
                               int stateID, String hotelPropertyZipCode, int countryID,
                               boolean isDeleted)
    {
        this.hotelPropertyID = hotelPropertyID;
        this.hotelBrandID = hotelBrandID;
        this.clientID = clientID;
        this.hotelPropertyName = hotelPropertyName;
        this.hotelPropertyStatusID = hotelPropertyStatusID;
        this.hotelPropertyAddress1 = hotelPropertyAddress1;
        this.hotelPropertyAddress2 = hotelPropertyAddress2;
        this.hotelPropertyAddress3 = hotelPropertyAddress3;
        this.hotelPropertyCity = hotelPropertyCity;
        this.stateID = stateID;
        this.hotelPropertyZipCode = hotelPropertyZipCode;
        this.countryID = countryID;
        this.isDeleted = isDeleted;
    }

    public int getHotelPropertyID() {
        return hotelPropertyID;
    }

    public void setHotelPropertyID(int hotelPropertyID) {
        this.hotelPropertyID = hotelPropertyID;
    }

    public int getHotelBrandID() {
        return hotelBrandID;
    }

    public void setHotelBrandID(int hotelBrandID) {
        this.hotelBrandID = hotelBrandID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getHotelPropertyName() {
        return hotelPropertyName;
    }

    public void setHotelPropertyName(String hotelPropertyName) {
        this.hotelPropertyName = hotelPropertyName;
    }

    public int getHotelPropertyStatusID() {
        return hotelPropertyStatusID;
    }

    public void setHotelPropertyStatusID(int hotelPropertyStatusID) {
        this.hotelPropertyStatusID = hotelPropertyStatusID;
    }

    public String getHotelPropertyAddress1() {
        return hotelPropertyAddress1;
    }

    public void setHotelPropertyAddress1(String hotelPropertyAddress1) {
        this.hotelPropertyAddress1 = hotelPropertyAddress1;
    }

    public String getHotelPropertyAddress2() {
        return hotelPropertyAddress2;
    }

    public void setHotelPropertyAddress2(String hotelPropertyAddress2) {
        this.hotelPropertyAddress2 = hotelPropertyAddress2;
    }

    public String getHotelPropertyAddress3() {
        return hotelPropertyAddress3;
    }

    public void setHotelPropertyAddress3(String hotelPropertyAddress3) {
        this.hotelPropertyAddress3 = hotelPropertyAddress3;
    }

    public String getHotelPropertyCity() {
        return hotelPropertyCity;
    }

    public void setHotelPropertyCity(String hotelPropertyCity) {
        this.hotelPropertyCity = hotelPropertyCity;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getHotelPropertyZipCode() {
        return hotelPropertyZipCode;
    }

    public void setHotelPropertyZipCode(String hotelPropertyZipCode) {
        this.hotelPropertyZipCode = hotelPropertyZipCode;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
