/*
+-------------------Developed by ShwetIsHere---------------------+
|                                                                |
|   Name: Shwet Patel                                            |
|   Git-Hub: https://github.com/ShwetIsHere                      |
|   Linked In: https://www.linkedin.com/in/shwetishere/          |
|   Email: contactshwetishere@gmail.com                          |
|                                                                |
+----------------------------------------------------------------+
*/
// First read README.md for how to run project

package bankmanagementsystem;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL (without specifying database initially)
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=shwet"); // here replace
                                                                                                      // your password
                                                                                                      // with "shwet"
            s = c.createStatement();

            // Create database if not exists
            String createDatabase = "create database if not exists bankmanagementsystem";
            s.executeUpdate(createDatabase);

            // Switch to the newly created database
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "shwet"); // here
                                                                                                                  // replace
                                                                                                                  // your
                                                                                                                  // password
                                                                                                                  // with
                                                                                                                  // "shwet"
            s = c.createStatement();

            // Create required tables
            String loginTable = "create table if not exists login (formno varchar(20), cardnumber varchar(20), pin varchar(10))";
            String bankTable = "create table if not exists bank (pin varchar(10), date varchar(50), type varchar(20), amount varchar(20))";
            String signupOneTable = "create table if not exists signupone (formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital_status varchar(20), address varchar(40), city varchar(25), pincode varchar(20), state varchar(25))";
            String signupTwoTable = "create table if not exists signuptwo (formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), pan varchar(20), aadhar varchar(20), seniorcitizen varchar(20), existingaccount varchar(20))";
            String signupThreeTable = "create table if not exists signupthree (formno varchar(20), accounttype varchar(40), cardnumber varchar(25), pin varchar(10), facility varchar(100))";

            // Execute table creation queries
            s.executeUpdate(loginTable);
            s.executeUpdate(bankTable);
            s.executeUpdate(signupOneTable);
            s.executeUpdate(signupTwoTable);
            s.executeUpdate(signupThreeTable);

        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not loaded");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
