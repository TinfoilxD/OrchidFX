package orchidmodel;/*
 * Written Joshua Joseph on 3/22/16.
 */

public class ProjectModel
{
    private int projectID;
    private int clientID;
    private int hotelID;
    private String projectInitialDepositDate;
    private String projectProjectedStartDate;
    private String projectProjectedDeadlineDate;
    private String projectProcurementStartDate;
    private String projectProcurementDeadlineDate;
    private String projectActualStartDate;
    private String projectActualDeadlineDate;
    private int projectTypeID;
    private int projectStatusID;
    private boolean isDeleted;

    public ProjectModel()
    {

    }

    public String getProjectInitialDepositDate()
    {
        return projectInitialDepositDate;
    }

    public void setProjectInitialDepositDate(String projectInitialDepositDate)
    {
        this.projectInitialDepositDate = projectInitialDepositDate;
    }

    public ProjectModel(int projectID, int clientID, int hotelID,
                        String projectProjectedStartDate, String projectProjectedDeadlineDate,
                        String projectProcurementStartDate, String projectProcurementDeadlineDate,
                        String projectActualStartDate, String projectActualDeadlineDate,
                        int projectTypeID, int projectStatusID, boolean isDeleted)
    {
        this.projectID = projectID;
        this.clientID = clientID;
        this.hotelID = hotelID;
        this.projectProjectedStartDate = projectProjectedStartDate;
        this.projectProjectedDeadlineDate = projectProjectedDeadlineDate;
        this.projectProcurementStartDate = projectProcurementStartDate;
        this.projectProcurementDeadlineDate = projectProcurementDeadlineDate;
        this.projectActualStartDate = projectActualStartDate;
        this.projectActualDeadlineDate = projectActualDeadlineDate;
        this.projectTypeID = projectTypeID;
        this.projectStatusID = projectStatusID;
        this.isDeleted = isDeleted;
    }

    public int getProjectID() {
        return projectID;
    }

    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getProjectProjectedStartDate() {
        return projectProjectedStartDate;
    }

    public void setProjectProjectedStartDate(String projectProjectedStartDate) {
        this.projectProjectedStartDate = projectProjectedStartDate;
    }

    public String getProjectProjectedDeadlineDate() {
        return projectProjectedDeadlineDate;
    }

    public void setProjectProjectedDeadlineDate(String projectProjectedDeadlineDate) {
        this.projectProjectedDeadlineDate = projectProjectedDeadlineDate;
    }

    public String getProjectProcurementStartDate() {
        return projectProcurementStartDate;
    }

    public void setProjectProcurementStartDate(String projectProcurementStartDate) {
        this.projectProcurementStartDate = projectProcurementStartDate;
    }

    public String getProjectProcurementDeadlineDate() {
        return projectProcurementDeadlineDate;
    }

    public void setProjectProcurementDeadlineDate(String projectProcurementDeadlineDate) {
        this.projectProcurementDeadlineDate = projectProcurementDeadlineDate;
    }

    public String getProjectActualStartDate() {
        return projectActualStartDate;
    }

    public void setProjectActualStartDate(String projectActualStartDate) {
        this.projectActualStartDate = projectActualStartDate;
    }

    public String getProjectActualDeadlineDate() {
        return projectActualDeadlineDate;
    }

    public void setProjectActualDeadlineDate(String projectActualDeadlineDate) {
        this.projectActualDeadlineDate = projectActualDeadlineDate;
    }

    public int getProjectTypeID() {
        return projectTypeID;
    }

    public void setProjectTypeID(int projectTypeID) {
        this.projectTypeID = projectTypeID;
    }

    public int getProjectStatusID() {
        return projectStatusID;
    }

    public void setProjectStatusID(int projectStatusID) {
        this.projectStatusID = projectStatusID;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }
}
