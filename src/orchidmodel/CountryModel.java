package orchidmodel;/*
 * Written by Tin Van on 3/12/16.
 */

public class CountryModel
{
    private int countryID;
    private String countryName;
    private String countryAbbreviation;


    public CountryModel(int countryID, String countryName, String countryAbbreviation)
    {
        this.countryID = countryID;
        this.countryName = countryName;
        this.countryAbbreviation = countryAbbreviation;
    }

    public int getCountryID()
    {
        return countryID;
    }

    public void setCountryID(int countryID)
    {
        this.countryID = countryID;
    }

    public String getCountryName()
    {
        return countryName;
    }

    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }

    public String getCountryAbbreviation()
    {
        return countryAbbreviation;
    }

    public void setCountryAbbreviation(String countryAbbreviation)
    {
        this.countryAbbreviation = countryAbbreviation;
    }

    public String toString()
    {
        if(countryName != null)
        {
            return countryName;
        }
        else
        {
            return "N/A";
        }
    }
}
