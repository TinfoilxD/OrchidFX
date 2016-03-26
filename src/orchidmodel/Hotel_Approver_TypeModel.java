package orchidmodel;/*
 * Written by Joshua Joseph on 3/21/16.
 */

public class Hotel_Approver_TypeModel {
    private int hotelApproverTypeID;
    private String hotelApproverType;
    private boolean isDeleted;

    public Hotel_Approver_TypeModel()
    {

    }

    public Hotel_Approver_TypeModel(int hotelApproverTypeID, String hotelApproverType, boolean isDeleted)
    {
        this.hotelApproverTypeID = hotelApproverTypeID;
        this.hotelApproverType = hotelApproverType;
        this.isDeleted = isDeleted;
    }

    public int getHotelApproverTypeID() {
        return hotelApproverTypeID;
    }

    public void setHotelApproverTypeID(int hotelApproverTypeID) {
        this.hotelApproverTypeID = hotelApproverTypeID;
    }

    public String getHotelApproverType() {
        return hotelApproverType;
    }

    public void setHotelApproverType(String hotelApproverType) {
        this.hotelApproverType = hotelApproverType;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}





