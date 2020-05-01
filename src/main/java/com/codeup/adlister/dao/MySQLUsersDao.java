package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import controllers.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class MySQLUsersDao implements Users {

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Long insert(User user) {
        return null;
    }
}