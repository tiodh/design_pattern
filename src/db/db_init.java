package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class db_init {
    private static Connection connection;

    public static Connection create_connection()
    {
        // Informasi koneksi ke database
        String url = "jdbc:mysql://localhost:3306/design_pattern";
        String user = "root";
        String password = "";

        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection getConnection()
    {
        if(connection==null)
        {
            connection = create_connection();
        }
        return connection;
    }

    public static void close_connection()
    {
        try {
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
