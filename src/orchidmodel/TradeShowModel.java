package orchidmodel;/*
 * Written Joshua Joseph on 3/22/16.
 */

public class TradeShowModel
{
    private int tradeShowID;
    private String tradeShowName;
    private String tradeShowAddress1;
    private String tradeShowAddress2;
    private String tradeShowAddress3;
    private String tradeShowCity;
    private int stateID;
    private String tradeShowZipCode;;
    private int countryID;
    private String tradeShowPhoneNumber;
    private String tradeShowDate;
    private boolean isDeleted;

    public TradeShowModel()
    {

    }

    public TradeShowModel(int tradeShowID, String tradeShowName, String tradeShowAddress1,
                          String tradeShowAddress2, String tradeShowAddress3, String tradeShowCity,
                          int stateID, String tradeShowZipCode, int countryID, String tradeShowPhoneNumber,
                          String tradeShowDate, boolean isDeleted)
    {
        this.tradeShowID = tradeShowID;
        this.tradeShowName = tradeShowName;
        this.tradeShowAddress1 = tradeShowAddress1;
        this.tradeShowAddress2 = tradeShowAddress2;
        this.tradeShowAddress3 = tradeShowAddress3;
        this.tradeShowCity = tradeShowCity;
        this.stateID = stateID;
        this.tradeShowZipCode = tradeShowZipCode;
        this.countryID = countryID;
        this.tradeShowPhoneNumber = tradeShowPhoneNumber;
        this.tradeShowDate = tradeShowDate;
        this.isDeleted = isDeleted;
    }

    public int getTradeShowID() {
        return tradeShowID;
    }

    public void setTradeShowID(int tradeShowID) {
        this.tradeShowID = tradeShowID;
    }

    public String getTradeShowName() {
        return tradeShowName;
    }

    public void setTradeShowName(String tradeShowName) {
        this.tradeShowName = tradeShowName;
    }

    public String getTradeShowAddress1() {
        return tradeShowAddress1;
    }

    public void setTradeShowAddress1(String tradeShowAddress1) {
        this.tradeShowAddress1 = tradeShowAddress1;
    }

    public String getTradeShowAddress2() {
        return tradeShowAddress2;
    }

    public void setTradeShowAddress2(String tradeShowAddress2) {
        this.tradeShowAddress2 = tradeShowAddress2;
    }

    public String getTradeShowAddress3() {
        return tradeShowAddress3;
    }

    public void setTradeShowAddress3(String tradeShowAddress3) {
        this.tradeShowAddress3 = tradeShowAddress3;
    }

    public String getTradeShowCity() {
        return tradeShowCity;
    }

    public void setTradeShowCity(String tradeShowCity) {
        this.tradeShowCity = tradeShowCity;
    }

    public int getStateID() {
        return stateID;
    }

    public void setStateID(int stateID) {
        this.stateID = stateID;
    }

    public String getTradeShowZipCode() {
        return tradeShowZipCode;
    }

    public void setTradeShowZipCode(String tradeShowZipCode) {
        this.tradeShowZipCode = tradeShowZipCode;
    }

    public int getCountryID() {
        return countryID;
    }

    public void setCountryID(int countryID) {
        this.countryID = countryID;
    }

    public String getTradeShowPhoneNumber() {
        return tradeShowPhoneNumber;
    }

    public void setTradeShowPhoneNumber(String tradeShowPhoneNumber) {
        this.tradeShowPhoneNumber = tradeShowPhoneNumber;
    }

    public String getTradeShowDate() {
        return tradeShowDate;
    }

    public void setTradeShowDate(String tradeShowDate) {
        this.tradeShowDate = tradeShowDate;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
