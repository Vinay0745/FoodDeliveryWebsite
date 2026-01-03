package com.tap.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String HOST = System.getenv("mysql.railway.internal");
    private static final String PORT = System.getenv("3306");
    private static final String DATABASE = System.getenv("railway");
    private static final String USER = System.getenv("root");
    private static final String PASSWORD = System.getenv("kNCDvtbSNQizejrkJwizJizVgfWydsGj");

    private static final String URL =
        "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE +
        "?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
