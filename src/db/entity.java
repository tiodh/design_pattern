package db;

import java.sql.Connection;

public abstract class entity {
    protected Connection connection = db_init.getConnection();

    public abstract void save();

    public abstract void delete();
}
