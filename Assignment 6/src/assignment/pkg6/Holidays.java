package assignment.pkg6;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
    class Holidays {

        //database URL
        static final String DATABASE_URL = "jdbc:derby://localhost:1527/Magicians";

        String[] retrieveHolidays() {

            Connection connection = null;
            Statement statement = null;
            ResultSet HolidayResultSet = null;

            ArrayList<String> HolidayList = new ArrayList<String>();
            String[] HolidayArray = new String[10]; //dont leave this hardcoded

            HolidayList.add("Holiday");

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "Select * FROM holidays";
                HolidayResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = HolidayResultSet.getMetaData();

                while (HolidayResultSet.next()) {
                    for (int i = 1; i <= 1; i++) {
                        HolidayList.add(HolidayResultSet.getString("Holiday"));
                    }
                }//end while

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            HolidayArray = (String[]) HolidayList.toArray(new String[0]);

            return HolidayArray;

        }//end method retrieveHolidayResultSet 

        public JTable getTable() {
            JTable t1 = new JTable();
            try {

                //establish connection 
                Connection connection = null;
                Statement statement = null;
                ResultSet tableResultSet = null;
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();
                DefaultTableModel dm = new DefaultTableModel();
                //query
                String SQL = "Select * FROM holidays";
                tableResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = tableResultSet.getMetaData();

                int cols = metaData.getColumnCount();
                String c[] = new String[cols];
                for (int i = 0; i < cols; i++) {
                    c[i] = metaData.getColumnName(i + 1);
                    dm.addColumn(c[i]);
                }
                //get data from rows
                Object row[] = new Object[cols];
                while (tableResultSet.next()) {
                    for (int i = 0; i < cols; i++) {
                        row[i] = tableResultSet.getString(i + 1);
                    }
                    dm.addRow(row);
                }
                t1.setModel(dm);
                connection.close();

            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            return t1;
        }    //end get table   
        
        
        
        
        void addHoliday (String holidayName)
        {
            Connection connection = null;
            Statement statement = null;
            ResultSet HolidayResultSet = null;

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "insert into holidays (HOLIDAY) values ('" + holidayName + "')";
                statement.executeUpdate(SQL);

           

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
            
            
            
        }//end method addHoliday
        

    }//end class Holidays 
