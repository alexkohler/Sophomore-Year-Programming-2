/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment.pkg6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
  class Schedule {

        static final String DATABASE_URL = "jdbc:derby://localhost:1527/Magicians";

        void insertCustomer(String customerName, String magicianName, String holidayName) {
            Connection connection = null;
            Statement statement = null;
            ResultSet ScheduleResultSet = null;
            int buffer;

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
                //insert into schedule (customer_name, magician_name, holiday) values ('shitler', 'frodo', 'Christmas');
                String SQL = "insert into schedule (customer_name, magician_name, holiday, timestamp) values ('" + customerName + "', '" + magicianName + "', '" + holidayName + "', '" + currentTimestamp + "')";

                //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
                buffer = statement.executeUpdate(SQL);

                //ResultSetMetaData metaData = ScheduleResultSet.getMetaData();
            }//end try block
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }//end catch block

        }//end method insertCustomer 
        
        //remove customer method
          void removeCustomer(String customerName, String magicianName, String holidayName) {
            Connection connection = null;
            Statement statement = null;
            ResultSet ScheduleResultSet = null;
            int buffer;

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                //insert into schedule (customer_name, magician_name, holiday) values ('shitler', 'frodo', 'Christmas');
                String SQL = "delete from schedule where customer_name = '" + customerName + "' and magician_name ='" + magicianName + "' and holiday = '" +  holidayName + "'";

                //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
                buffer = statement.executeUpdate(SQL);

                //ResultSetMetaData metaData = ScheduleResultSet.getMetaData();
            }//end try block
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }//end catch block

        }//end method insertCustomer 
        
        
        boolean scheduledCustomer(String holidayName, String magicianName)
        {
            Connection connection = null;
            Statement statement = null;
            ResultSet ScheduleResultSet = null; 
            boolean scheduledCustomer = false;//intially false 

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "select * from schedule where holiday = '" + holidayName + "' and magician_name= '" + magicianName + "'";

                //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
                ScheduleResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = ScheduleResultSet.getMetaData();

                if (ScheduleResultSet.next() == true) {
                    scheduledCustomer = true;
                } else {
                    scheduledCustomer = false;
                }

            }//end try block
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }//end catch block

            return scheduledCustomer;
        }//end method scheduledCustomer 
        
        //returns the name of the customer scheduled on a certain holiday for a certain magician 
        String getScheduledCustomer(String holidayName, String magicianName)
        {
            Connection connection = null;
            Statement statement = null;
            ResultSet ScheduleResultSet = null;

            String myCustomer = "ERROR";//for debugging purposes
            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "select * from schedule where holiday = '" + holidayName + "' and magician_name= '" + magicianName + "'";
                ScheduleResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = ScheduleResultSet.getMetaData();

                if (ScheduleResultSet.next()) { //grab an available customer  (there will be one available because we checked with our boolean function, otherwise this function won't be used

                    myCustomer = ScheduleResultSet.getString("customer_name");

                }//end if

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            return myCustomer;
            
            
        }
        
        //returns name of magician given a holiday and customer name 
        String getMagician(String customerName, String holidayName)
        {
            Connection connection = null;
            Statement statement = null;
            ResultSet ScheduleResultSet = null;

            String myMagician = "ERROR";//for debugging purposes
            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "select * from schedule where holiday = '" + holidayName + "' and customer_name = '" + customerName + "'";
                ScheduleResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = ScheduleResultSet.getMetaData();

                if (ScheduleResultSet.next()) { //grab an available customer  (there will be one available because we checked with our boolean function, otherwise this function won't be used

                    myMagician = ScheduleResultSet.getString("magician_name");

                }//end if

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            return myMagician;
            
            
        }
        

        JTable getHolidayTable(String holidayName) {
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
                String SQL = "select * from  schedule where holiday =" + "'" + holidayName + "'";
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

        }//end method gettable 
        
        JTable getRescheduledCustomers(java.sql.Timestamp myTimeStamp)
        {
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
                String SQL = "select * from schedule where timestamp > '" + myTimeStamp +"'";
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
            
        }
        
        
        String [] getCustomerList()
        {
            Connection connection = null;
            Statement statement = null;
            ResultSet CustomerResultSet = null;

            ArrayList<String> customerList = new ArrayList<String>();
            String[] customerArray = new String[10]; //dont leave this hardcoded

            customerList.add("Customer");//add title to our array 

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "Select * FROM schedule";
                CustomerResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = CustomerResultSet.getMetaData();

                while (CustomerResultSet.next()) {
                    for (int i = 1; i <= 1; i++) {
                        customerList.add(CustomerResultSet.getString("customer_name"));
                    }
                }//end while

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            customerArray = (String[]) customerList.toArray(new String[0]);

            return customerArray;
            
            
            
        }//end method getcustomerlist 
        
        
      String [] getCustomerHolidays(String customerName)
        {

            Connection connection = null;
            Statement statement = null;
            ResultSet CustomerResultSet = null;

            ArrayList<String> holidayList = new ArrayList<String>();
            String[] holidayArray = new String[10]; //dont leave this hardcoded

           holidayList.add("Holiday");//add title to our array 

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "Select * FROM schedule where customer_name ='" + customerName + "'";
                CustomerResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = CustomerResultSet.getMetaData();

                while (CustomerResultSet.next()) {
                    for (int i = 1; i <= 1; i++) {
                        holidayList.add(CustomerResultSet.getString("holiday"));
                    }
                }//end while

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            holidayArray = (String[]) holidayList.toArray(new String[0]);

            return holidayArray;
            
            
            
        }//end method getcustomerholidays  
        
        
        

        JTable getMagicianTable(String magicianName) {
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
                String SQL = "select * from  schedule where magician_name =" + "'" + magicianName + "'";
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

        }//end method gettable 

    }//end class schedule 
