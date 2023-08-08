package dev.hyperlisk.diamondspleef.database;

import java.sql.Connection;

public class DatabaseHandler {

    private Connection connection;

    public DatabaseHandler() {

        // TODO: Get connection info from config.yml

        // TODO: Pass data to the initalizer
        initDatabaseHandler();
    }

    private void initDatabaseHandler() {

    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (Exception e) {
                //TODO: Handle exception
            }
        }
    }
}
