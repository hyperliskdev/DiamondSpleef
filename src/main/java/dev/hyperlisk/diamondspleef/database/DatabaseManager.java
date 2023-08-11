package dev.hyperlisk.diamondspleef.database;
import dev.hyperlisk.diamondspleef.DiamondSpleef;
import dev.hyperlisk.diamondspleef.database.models.Arena;
import org.bukkit.configuration.file.FileConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DatabaseManager {

    private SessionFactory sessionFactory;

    public DatabaseManager() {
        init(DiamondSpleef.getInstance().getConfig());
    }

    private void init(FileConfiguration pluginConfig) {

        Configuration hibernateConfig = new Configuration().configure("hibernate.cfg.xml");
        hibernateConfig.setProperty("hibernate.connection.url",
                "jdbc:mysql://" + pluginConfig.getString("database.host") + ":" + pluginConfig.get("database.port") +
                        "/" + pluginConfig.getString("database.databaseName"));
        hibernateConfig.setProperty("hibernate.connection.username", pluginConfig.getString("database.username"));
        hibernateConfig.setProperty("hibernate.connection.password", pluginConfig.getString("database.password"));

        // Build SessionFactory
        this.sessionFactory = hibernateConfig.buildSessionFactory();
    }

    // TODO: Create the methods to create, read, update, and delete arenas from the database.


    // TODO: Create the methods to create, read, update, and delete player stats from the database.

    // TODO: Create the methods to create, read, update, and delete kits from the database.



}
