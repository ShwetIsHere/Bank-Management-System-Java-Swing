+-------------------Developed by ShwetIsHere---------------------+
|                                                                |
|   Name: Shwet Patel                                            |
|   Git-Hub: https://github.com/ShwetIsHere                      |
|   Linked In: https://www.linkedin.com/in/shwetishere/          |
|   Email: contactshwetishere@gmail.com                          |
|                                                                |
+----------------------------------------------------------------+

## Required Technologies

    Visual Stdio Code IDE
    JAVA Language
    MySql Database
    mysql-connector-tz-1.3.3-4.jar
    mysql-connector-j-9.2.0.jar

## How to Run this Project:

instruction: first check both jar file are in lib folder, don't delete .vscode folder
--> You have to Debug project every time when you want to run project

in this project, we can signup by new user and login with already logined and here all required sql table will created on run time so you don't have to create table manually, you just have to change password of mysql from Conn.java but if you want to understand query, you can check Ducumentation folder and there i provide you .sql and .txt format also.

Replaced your MySql password in this line from Conn.java (Line no.16): 
c = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root&password=__YOUR_PASSWORD__");

this project have major 9 opetion which are,
    Deposit
    Cash Withdraw
    Fast Cash
    Mini Statement
    Pin Change
    Bank Enquiry

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
