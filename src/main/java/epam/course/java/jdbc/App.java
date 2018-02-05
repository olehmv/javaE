package epam.course.java.jdbc;

import java.sql.*;
import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {

        String insert="insert into battles values(?,?)";
        String selcect="select * from battles;";
        try {

            final Connection connection = ConnectionSQL.getConnection("root", "root", "mysql", "localhost", "3306", "labor_sql");
            final PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1,"TEST00");
            preparedStatement.setString(2, "20201020");
            final int i = preparedStatement.executeUpdate();
            final PreparedStatement prepareStatement = connection.prepareStatement(selcect);
            final ResultSet resultSet = prepareStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
