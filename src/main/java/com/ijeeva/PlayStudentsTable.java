package com.ijeeva;

import com.ijeeva.college.entities.Student;

import java.sql.*;

public class PlayStudentsTable {

    static void insertStudent(Connection connection) throws SQLException {
        String name = "jill";
        char gender = 'f';
        int roll = 15;
        String query = String.format(
                "insert into students (name, gender, roll) values ('%s','%s',%s)",
                name, gender, roll);
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        statement.close();
    }

    static void queryStudents(Connection connection) throws SQLException {
        String query = "select * from students where gender='f'";
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(query)) {
                while(resultSet.next()) {
                    String name = resultSet.getString("name");
                    String gender = resultSet.getString("gender");
                    int roll = resultSet.getInt("roll");

                    System.out.println(name);
                    System.out.println(gender);
                    System.out.println(roll);
                }
            }
        }
    }

    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mariadb://localhost:3306/library_july2022_db",
                    "mehulchopra",
                    "admin123");
        } catch (SQLException e) {
            System.out.println("Error in connecting with db");
            e.printStackTrace();
            return;
        }
        System.out.println(connection);
        /* try {
            insertStudent(connection);
            System.out.println("Student data inserted succesfully!");
        } catch (SQLException e) {
            System.out.println("Error in inserting student");
            e.printStackTrace();
        } */

        try {
            queryStudents(connection);
        } catch (SQLException e) {
            System.out.println("Error in querying student");
            e.printStackTrace();
        }

        try {
            connection.close();
        } catch (SQLException e) {
        }
    }
}
