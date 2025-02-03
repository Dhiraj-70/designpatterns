package com.dhiraj.designpatterns.singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance = null;

    private String url;
    private String username;
    private String password;
    private DatabaseConnection() {}
    public static DatabaseConnection getInstance() {
        if(instance == null) {
            //Double-checked locking
            synchronized(DatabaseConnection.class) {
                if(instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }
}
