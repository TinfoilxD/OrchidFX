package orchidmodel;/*
 * Written by Tin Van on 3/19/16.
 */

public class StateModel
{
    private int stateID;
    private int countryID;
    private String stateName;
    private String stateAbbreviation;

    public StateModel()
    {

    }


    public StateModel(int stateID, int countryID, String stateName, String stateAbbreviation)
    {
        this.stateID = stateID;
        this.countryID = countryID;
        this.stateName = stateName;
        this.stateAbbreviation = stateAbbreviation;
    }

    public int getStateID()
    {
        return stateID;
    }

    public void setStateID(int stateID)
    {
        this.stateID = stateID;
    }

    public int getCountryID()
    {
        return countryID;
    }

    public void setCountryID(int countryID)
    {
        this.countryID = countryID;
    }

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }

    public String getStateAbbreviation()
    {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation)
    {
        this.stateAbbreviation = stateAbbreviation;
    }


}
