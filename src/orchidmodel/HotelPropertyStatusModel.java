package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class HotelPropertyStatusModel
{
    private int hotelPropertyStatusID;
    private String hotelPropertyStatus;
    private boolean isDeleted;

    public HotelPropertyStatusModel()
    {

    }

    public HotelPropertyStatusModel(int hotelPropertyStatusID, String hotelPropertyStatus, boolean isDeleted)
    {
        this.hotelPropertyStatusID = hotelPropertyStatusID;
        this.hotelPropertyStatus = hotelPropertyStatus;
        this.isDeleted = isDeleted;
    }

    public int getHotelPropertyStatusID() {
        return hotelPropertyStatusID;
    }

    public void setHotelPropertyStatusID(int hotelPropertyStatusID) {
        this.hotelPropertyStatusID = hotelPropertyStatusID;
    }

    public String getHotelPropertyStatus() {
        return hotelPropertyStatus;
    }

    public void setHotelPropertyStatus(String hotelPropertyStatus) {
        this.hotelPropertyStatus = hotelPropertyStatus;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





