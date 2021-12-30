package jm.task.core.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "root";

public static Connection connectDB() throws SQLException, ClassNotFoundException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(URL , LOGIN, PASSWORD);
    return connection;
}
}
