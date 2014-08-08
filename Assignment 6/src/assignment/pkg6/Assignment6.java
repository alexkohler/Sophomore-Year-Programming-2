//Assignment 6 for CMPSC 221
//Written by Alex Kohler 
package assignment.pkg6;

import static assignment.pkg6.WaitingList.DATABASE_URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;




public class Assignment6 extends JFrame {

    /*JPanel panel = new JPanel();
     JTextField clientName = new JTextField(10);//size 10 
     JButton scheduleButton = new JButton("Submit");*/
    Assignment6() {

    }//end constructor Assignment6
    
        public static void main(String[] args) {
        MagicianUI myUI = new MagicianUI();
        myUI.setVisible(true);

    }//end main 
}//end class assignment6
    



     



    



