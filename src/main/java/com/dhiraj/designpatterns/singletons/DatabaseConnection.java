package com.dhiraj.designpatterns.singletons;

public class DatabaseConnection {
    private static DatabaseConnection instance;

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
