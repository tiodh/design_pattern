package db;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class user extends entity {
    String id, name, pass;
    private boolean is_update = false;

    public user() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User: ");
        name = scanner.nextLine();

        System.out.println("Password: ");
        pass = scanner.nextLine();

        save();
    }

    public user(String id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.is_update = true;
    }

    public void save() {
        PreparedStatement preparedStatement = null;
        String query = "";
        try {
            if (is_update) {
                query = "update user set name=?, password=? where id=?;";
                preparedStatement = super.connection.prepareStatement(query);
                preparedStatement.setString(1, this.name);
                preparedStatement.setString(2, this.pass);
                preparedStatement.setString(3, this.id);
                int rowsUpdated = preparedStatement.executeUpdate();
                System.out.println("Rows updated: " + rowsUpdated);
            } else {
                query = "insert into user(name, password) values (?,?)";
                preparedStatement = super.connection.prepareStatement(query);
                preparedStatement.setString(1, this.name);
                preparedStatement.setString(2, this.pass);
                int rowsInserted = preparedStatement.executeUpdate();
                System.out.println("Rows inserted: " + rowsInserted);
            }
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        PreparedStatement preparedStatement = null;
        String query = "";
        try {
            if (is_update) {
                query = "delete user where id=?;";
                preparedStatement = super.connection.prepareStatement(query);
                preparedStatement.setString(1, this.id);
                int rowsDeleted = preparedStatement.executeUpdate();
                System.out.println("Rows Deleted: " + rowsDeleted);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
