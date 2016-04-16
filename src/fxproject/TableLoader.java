package fxproject;/*
 * Written by Tin Van on 4/11/16.
 */

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableLoader
{

    private static Connection getConnection() throws SQLException
    {
        return OrchidDataSource.getCurrentDataSource().getConnection();
    }


    public static void loadTable (String procedureString,TableView table) throws SQLException
    {
        Connection connection = getConnection();
        CallableStatement cstm = connection.prepareCall(procedureString);

        ResultSet resultSet = cstm.executeQuery();

        if (!resultSet.isBeforeFirst()) {
            return;
        }
        if (resultSet == null) {
            return;
        }



        ObservableList data = FXCollections.observableArrayList();


        for(int i=0 ; i<resultSet.getMetaData().getColumnCount(); i++)
        {
            final int j = i;
            TableColumn col = new TableColumn(resultSet.getMetaData().getColumnName(i+1));

            col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>()
            {
                public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param)
                {
                    return new SimpleStringProperty(param.getValue().get(j).toString());
                }
            });

            table.getColumns().addAll(col);
        }

        while(resultSet.next())
        {
            ObservableList<String> row = FXCollections.observableArrayList();
            for(int i=1 ; i<=resultSet.getMetaData().getColumnCount(); i++)
            {
                if(resultSet.getString(i) != null)
                    row.add(resultSet.getString(i));
                else
                    row.add("");
            }
            data.add(row);

        }

        table.setItems(data);

        if (resultSet != null)
            resultSet.close();
        if (cstm != null)
            cstm.close();
        if (connection != null)
            connection.close();
    }
}
