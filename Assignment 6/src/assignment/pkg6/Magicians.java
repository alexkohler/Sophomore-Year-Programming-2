//Magician Class implementation
//Written by Alexander Kohler 
package assignment.pkg6;

import static assignment.pkg6.Holidays.DATABASE_URL;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "MAGICIANS", catalog = "", schema = "AOK5326")
@NamedQueries({
    @NamedQuery(name = "Magicians.findAll", query = "SELECT m FROM Magicians m"),
    @NamedQuery(name = "Magicians.findByName", query = "SELECT m FROM Magicians m WHERE m.name = :name")})
public class Magicians implements Serializable {
    
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

                }//end if

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }

            return myMagician;

        }//end method grabAvailableMagicians 
        
        
        void addMagician (String magicianName)
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

                //query to add our magician
                String SQL = "insert into magicians (magician_name) values ('" + magicianName + "')";
                statement.executeUpdate(SQL);

                

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
            
            
        }//addmagician method 
        
        
         void removeMagician (String magicianName)
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

                //query to add our magician
                String SQL = "delete from magicians where magician_name = '" + magicianName + "'";
                statement.executeUpdate(SQL);

                

                connection.close();
            }// end try 
            //catch any exceptions         
            catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
            
            
        }//end removemagician method 

   
    
    
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;

    public Magicians() {
    }

    public Magicians(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (name != null ? name.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Magicians)) {
            return false;
        }
        Magicians other = (Magicians) object;
        if ((this.name == null && other.name != null) || (this.name != null && !this.name.equals(other.name))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "assignment.pkg6.Magicians[ name=" + name + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
