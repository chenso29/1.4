package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;

import java.util.List;

public class UserServiceImpl implements UserService {

    public void createUsersTable() {
        try {
            UserDaoJDBCImpl dao = new UserDaoJDBCImpl();
            dao.createUsersTable();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void dropUsersTable() {
        try {
            UserDaoJDBCImpl dao = new UserDaoJDBCImpl();
            dao.dropUsersTable();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void saveUser(String name, String lastName, byte age) {
        try {
            UserDaoJDBCImpl dao = new UserDaoJDBCImpl();
            dao.saveUser(name , lastName , age);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void removeUserById(long id) {
        try {
            UserDaoJDBCImpl dao = new UserDaoJDBCImpl();
            dao.removeUserById(id);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public List<User> getAllUsers() {

            List<User> users;
        UserDaoJDBCImpl dao = null;
        try {
            dao = new UserDaoJDBCImpl();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        users = dao.getAllUsers();

        return users;
    }

    public void cleanUsersTable() {
        try {
            UserDaoJDBCImpl dao = new UserDaoJDBCImpl();
            dao.cleanUsersTable();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
