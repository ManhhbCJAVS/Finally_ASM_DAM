package com.edusys.utility_helper;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=EduSysASM;\n"
            + "encrypt=true;trustServerCertificate=true;";
    private static final String user = "sa";
    private static final String password = "123";
    
    
    
    //Phần sẽ chạy trước cả hàm main
    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi Driver");
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnection(){
        Connection cn = null;
        try {
            cn=DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Lỗi kết nối ");
            e.printStackTrace();
        }
        return cn;
    }
    
    public static void main(String[] args) {
        Connection cn = getConnection();
        System.out.println(cn != null ? "Kết nối thành công" : "Kết nối thất bại");
    }

}
