/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

//schedule - uses three drop downs and a text box 
//action listener for all three dropdowns activated when client hits 'submit' checks the status of the magician and if he's free, schedules him, else, pushes the client's name onto the waiting list. 
//error handling- if either dropbox is at 0, have an error message come up and tell the fucking client to pick a fucking date and magician 
//ALSO do an action listener for textbox, incase an enter is pressed instead of submit 
//status- drop down menu that will display data (southern), either holiday, magician, or waiting list 
public class Assignment6 extends JFrame {

    /*JPanel panel = new JPanel();
     JTextField clientName = new JTextField(10);//size 10 
     JButton scheduleButton = new JButton("Submit");*/
    Assignment6() {

    }//end constructor Assignment6

    public static class Magicians {

        //database URL
        static final String DATABASE_URL = "jdbc:derby://localhost:1527/Magicians";

        //obsolete/unneeded?
        String[] retrieveMagicians() {

            Connection connection = null;
            Statement statement = null;
            ResultSet MagicianResultSet = null;

            ArrayList<String> MagicianList = new ArrayList<String>();
            String[] magicianArray = new String[10]; //dont leave this hardcoded

            MagicianList.add("Magician");//add title to our array 

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "Select * FROM magicians";
                MagicianResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = MagicianResultSet.getMetaData();

                while (MagicianResultSet.next()) {
                    for (int i = 1; i <= 1; i++) {
                        MagicianList.add(MagicianResultSet.getString("magician_name"));
                    }
                }//end while

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            magicianArray = (String[]) MagicianList.toArray(new String[0]);

            return magicianArray;

        }//end method retrieveMagicianResultSet 

        boolean magiciansAvailable(String holidayName) {
            Connection connection = null;
            Statement statement = null;
            ResultSet MagicianResultSet = null;
            boolean availableMagicians = false;//intially false 

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "select magician_name from magicians where magician_name not in (select magician_name from schedule where holiday ='" + holidayName + "')";

                //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
                MagicianResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = MagicianResultSet.getMetaData();

                if (MagicianResultSet.next() == true) {
                    availableMagicians = true;
                } else {
                    availableMagicians = false;
                }

            }//end try block
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }//end catch block

            return availableMagicians;
        }//end method magicians available 

        String grabAvailableMagician(String holidayName) {

            Connection connection = null;
            Statement statement = null;
            ResultSet MagicianResultSet = null;

            String myMagician = "ERROR";//for debugging purposes. Can safely assert if this function is being called there are available magicians (based on boolean function above

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                String SQL = "select magician_name from magicians where magician_name not in (select magician_name from schedule where holiday ='" + holidayName + "')";
                MagicianResultSet = statement.executeQuery(SQL);

                ResultSetMetaData metaData = MagicianResultSet.getMetaData();

                if (MagicianResultSet.next()) { //randomly grab an available magician 

                    myMagician = MagicianResultSet.getString("magician_name");

                }//end while

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            return myMagician;

        }//end method grabAvailableMagicians 

    }//end class magicians

    public static class Holidays {

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

    }//end class Holidays 

    public static class Schedule {

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
                //insert into schedule (customer_name, magician_name, holiday) values ('shitler', 'frodo', 'Christmas');
                String SQL = "insert into schedule (customer_name, magician_name, holiday) values ('" + customerName + "', '" + magicianName + "', '" + holidayName + "')";

                //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
                buffer = statement.executeUpdate(SQL);

                //ResultSetMetaData metaData = ScheduleResultSet.getMetaData();
            }//end try block
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }//end catch block

        }//end method insertCustomer 

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
    

    
    
    

    public static class WaitingList {

        static final String DATABASE_URL = "jdbc:derby://localhost:1527/Magicians";

        //method to add customers to waiting list 
        void addCustomer(String customerName, String holidayName) {

            Connection connection = null;
            Statement statement = null;
            ResultSet waitingListResultSet = null;
            int buffer;

            //connect and query
            try {
                //establish connection 
                connection = DriverManager.getConnection(DATABASE_URL, "aok5326", "Gomer200212");

                //create query
                statement = connection.createStatement();

                //query
                //insert into schedule (customer_name, magician_name, holiday) values ('shitler', 'frodo', 'Christmas');
                String SQL = "insert into waiting_list (customer_name, holiday) values ('" + customerName + "', '" + holidayName + "')";

                //select magicianName from magician where magicianName nnot in (select magicianName from schedule where holidayName =?) 
                buffer = statement.executeUpdate(SQL);

                //ResultSetMetaData metaData = ScheduleResultSet.getMetaData();
            }//end try block
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }//end catch block

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
                String SQL = "select * from waiting_list";
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

    }

    public static void main(String[] args) {
        //new Assignment6();
        MagicianUI myUI = new MagicianUI();
        myUI.setVisible(true);

    }//end main 

}//end assignment6
