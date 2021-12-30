package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserDaoHibernateImpl dao = new UserDaoHibernateImpl();
        dao.createUsersTable();
        dao.saveUser("Dmitriy", "An" , (byte) 27);
        dao.saveUser("Anna", "Pak" , (byte) 27);
        dao.saveUser("Elena", "Tsoy" , (byte) 47);
        dao.saveUser("Sofia", "An" , (byte) 1);
        System.out.println(dao.getAllUsers());
        dao.cleanUsersTable();
        dao.dropUsersTable();
    }
}
