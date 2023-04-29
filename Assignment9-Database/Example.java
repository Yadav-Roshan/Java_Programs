
// Purpose: To connect to the database and insert and retrieve data from the database
// Importing packages
import java.sql.*;
import java.util.*;

// Class Example
class Example {
    // Main method
    public static void main(String args[]) throws Exception {
        // Loading driver
        Class.forName("com.mysql.jdbc.Driver");
        // Establishing connection
        System.out.println("Driver loaded");
        //  Establishing connection
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
        //  Printing message
        System.out.println("Connection Established");

        //  Creating statement
        Statement st = con.createStatement();
        //  Executing query
        st.executeUpdate("insert into designation values(3, 'how is life')");
        //  Printing message
        ResultSet rs = st.executeQuery("select * from designation");

        //  Printing message
        System.out.println("Code Title");
        //  Printing message
        System.out.println("------------------------------------------");
        //  Looping through result set
        while (rs.next()) {
            //  Printing message
            System.out.println(rs.getInt(1) + " " + rs.getString(2));
        }
    }
}