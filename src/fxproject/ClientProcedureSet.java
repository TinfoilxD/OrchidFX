package fxproject;

/*
 * Written by Tin Van on 2/29/16.
 */

import orchidmodel.ClientModel;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ClientProcedureSet
{
    Connection connection;
    public ClientProcedureSet()
    {

    }

    private Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }
    public void procInsertClient(ClientModel clientModel) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall("{call InsertClient(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
        cstm.setInt("ClientStatusID", clientModel.getClientStatusID());
        if(clientModel.getTradeShowID() != 0)
            cstm.setInt("TradeShowID", clientModel.getTradeShowID());
        else
            cstm.setObject("TradeShowID", null);

        if(clientModel.getReferrerID() != 0)
            cstm.setInt("ReferrerID", clientModel.getReferrerID());
        else
            cstm.setObject("ReferrerID",null);
        cstm.setString("ClientCompanyName", clientModel.getClientCompanyName());
        cstm.setString("ClientFirstName", clientModel.getClientFirstName());
        cstm.setString("ClientLastName", clientModel.getClientLastName());
        cstm.setString("ClientMailingAddress1", clientModel.getClientMailingAddress1());
        cstm.setString("ClientMailingAddress2", clientModel.getClientMailingAddress2());
        cstm.setString("ClientMailingAddress3", clientModel.getClientMailingAddress3());
        cstm.setString("ClientMailingCity", clientModel.getClientMailingCity());
        cstm.setInt("MailingStateID", clientModel.getMailingStateID());
        cstm.setString("ClientMailingZipCode", clientModel.getClientMailingZipCode());
        cstm.setInt("MailingCountryID", clientModel.getMailingCountryID());
        cstm.setString("ClientBillingAddress1", clientModel.getClientBillingAddress1());
        cstm.setString("ClientBillingAddress2", clientModel.getClientBillingAddress2());
        cstm.setString("ClientBillingAddress3", clientModel.getClientBillingAddress3());
        cstm.setString("ClientBillingCity", clientModel.getClientBillingCity());
        cstm.setInt("BillingStateID", clientModel.getBillingStateID());
        cstm.setString("ClientBillingZipCode", clientModel.getClientBillingZipCode());
        cstm.setInt("BillingCountryID", clientModel.getBillingCountryID());
        cstm.setString("ClientPhone", clientModel.getClientPhone());
        cstm.setString("ClientExtension", clientModel.getClientExtension());
        cstm.setString("ClientEmail", clientModel.getClientEmail());
        cstm.execute();

        if(cstm != null)
            cstm.close();
        if(connection != null)
            connection.close();
    }

}
