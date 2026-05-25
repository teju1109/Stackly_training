package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class LibraryDBConnection
{
    static Connection con;

    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/library_db",
                    "root",
                    "Root"
            );
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return con;
    }
}
