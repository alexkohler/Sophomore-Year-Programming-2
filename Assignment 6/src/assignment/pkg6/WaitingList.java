/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import static assignment.pkg6.Schedule.DATABASE_URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex
 */
class WaitingList {

    static final String DATABASE_URL = "jdbc:derby://localhost:1527/Magicians";

    //method to add customers to waiting list 
    void addCustomer(String customerName, String holidayName, boolean generalWaitingList) {

        Connection connection = null;
        Statement statement = null;
        ResultSet waitingListResultSet = null;
        int buffer;

            //priority, if we are adding a general waiting list customer, priority is B (lower), if we are adding a customer from a dropped magician priority is A (higher) 
        String priority = "B"; //default general priority
        if (generalWaitingList) {
            priority = "B";
        }
        if (!generalWaitingList) {
            priority = "A";
        }

        //connect and query
        try {
            //establish connection 
            connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

            //create query
            statement = connection.createStatement();

            //query
            
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            String SQL = "insert into waiting_list (customer_name, holiday, priority, timestamp) values ('" + customerName + "', '" + holidayName + "', '" + priority + "'," + "'" + currentTimestamp + "')";

            //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
            buffer = statement.executeUpdate(SQL);

            //ResultSetMetaData metaData = ScheduleResultSet.getMetaData();
        }//end try block
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }//end catch block

    }//end method addCustomer (for waiting list)

    void removeCustomer(String customerName, String holidayName, boolean generalWaitingList) {
        Connection connection = null;
        Statement statement = null;
        ResultSet waitingListResultSet = null;
        int buffer;
        
        String priority = "B"; //default general priority
        if (generalWaitingList) {
            priority = "B";
        }
        if (!generalWaitingList) {
            priority = "A";
        }
        

        //connect and query
        try {
            //establish connection 
            connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

            //create query
            statement = connection.createStatement();

                //query
            //insert into schedule (customer_name, magician_name, holiday) values ('shitler', 'frodo', 'Christmas');
            String SQL = "delete from waiting_list where customer_name='" + customerName + "' AND holiday= '" + holidayName + "' and priority = '" + priority + "'";

            //execute query  
            buffer = statement.executeUpdate(SQL);

            //ResultSetMetaData metaData = ScheduleResultSet.getMetaData();
        }//end try block
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }//end catch block         
    }//end method removeCustomer 

    boolean onWaitingListFor(String holidayName, boolean generalWaitingList ) {
        Connection connection = null;
        Statement statement = null;
        ResultSet waitingListResultSet = null;
        boolean onWaitingListForSelectedHoliday = false;//intially false 
        String priority = "error"; //for debugging purposes 
        
        if (generalWaitingList) {
            priority = "B";
        }
        if (!generalWaitingList) {
            priority = "A";
        }
        

        //connect and query
        try {
            //establish connection 
            connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

            //create query
            statement = connection.createStatement();

            //query
            String SQL = "select * from waiting_list where holiday = '" + holidayName + "' and priority = '" + priority + "'"; //check for high priority first 

            //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
            waitingListResultSet = statement.executeQuery(SQL);

            ResultSetMetaData metaData = waitingListResultSet.getMetaData();

            if (waitingListResultSet.next() == true) {//if there exists at least one result
                onWaitingListForSelectedHoliday = true;
            } else {
                onWaitingListForSelectedHoliday = false;
            }
        }//end try block 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }//end catch block    

        return onWaitingListForSelectedHoliday;
    }

    String retrieveFromWaitingList(String holidayName, boolean generalWaitingList) {
        Connection connection = null;
        Statement statement = null;
        ResultSet WaitingListResultSet = null;

        String myCustomer = "ERROR";//for debugging purposes. Can safely assert if this function is being called there are available magicians (based on boolean function above
        String priority = "error"; //for debugging purposes 
        
        if (generalWaitingList) {
            priority = "B";
        }
        if (!generalWaitingList) {
            priority = "A";
        }
        
        
        //connect and query
        try {
            //establish connection 
            connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

            //create query
            statement = connection.createStatement();

            //query
            String SQL = "select * from waiting_list where holiday = '" + holidayName + "' and priority = '" + priority + "'";
            WaitingListResultSet = statement.executeQuery(SQL);

            ResultSetMetaData metaData = WaitingListResultSet.getMetaData();

            if (WaitingListResultSet.next()) { //grab an available customer  

                myCustomer = WaitingListResultSet.getString("customer_name");

            }//end if

            connection.close();
        }// end try 
        //catch any exceptions         
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return myCustomer;
    }
    
    
    boolean empty()
    {
         Connection connection = null;
            Statement statement = null;
            ResultSet CustomerResultSet = null;

            boolean empty = true; //assume empty for debugging purposes 
            

            

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "Select * FROM waiting_list";
                CustomerResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = CustomerResultSet.getMetaData();

                if (CustomerResultSet.next()) 
                    empty = false;
                else 
                    empty = true;
                    
                

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            return empty;
        
        
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
                String SQL = "Select * FROM waiting_list";
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
                String SQL = "Select * FROM waiting_list where customer_name ='" + customerName + "'";
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
     
     boolean getCustomerPriority(String customerName, String holidayName)
     {
               Connection connection = null;
        Statement statement = null;
        ResultSet waitingListResultSet = null;
 
        boolean generalWaitListStatus = true;//for debugging purposes
        String myPriority = "error"; //^^^
        //connect and query
        try {
            //establish connection 
            connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

            //create query
            statement = connection.createStatement();

            //query
            String SQL = "select * from waiting_list where holiday = '" + holidayName + "' and customer_name = '" + customerName + "'"; //check for high priority first 

            //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
            waitingListResultSet = statement.executeQuery(SQL);

            ResultSetMetaData metaData = waitingListResultSet.getMetaData();

            if (waitingListResultSet.next()) { //grab an available customer  

                myPriority = waitingListResultSet.getString("priority");

            }//end if
            
            if (myPriority.equals("A"))
               generalWaitListStatus = false;
            if (myPriority.equals("B"))
                generalWaitListStatus = true;
                   
           
            
            
            
        }//end try block 
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }//end catch block    

        return generalWaitListStatus;
         
     }
    

    JTable getTable() {
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
            String SQL = "select * from AOK5326.WAITING_LIST order by priority asc, timestamp asc";
            tableResultSet = statement.executeQuery(SQL);

            ResultSetMetaData metaData = tableResultSet.getMetaData();

            ListTableModel model = ListTableModel.createModelFromResultSet(tableResultSet);
            t1 = new JTable(model);

            connection.close();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        return t1;

    }//end method gettable 

    JTable getRescheduledCustomers(java.sql.Timestamp myTimeStamp) {
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
            String SQL = "select * from waiting_list where timestamp > '" + myTimeStamp + "'";
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

}
