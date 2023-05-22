package com.Practice.mydemmo.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicObjectMappingExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "username";
        String password = "password";
        String tableName = "mytable";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT * FROM " + tableName;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                ResultSetMetaData metadata = resultSet.getMetaData();
                int columnCount = metadata.getColumnCount();

                List<Map<String, Object>> objects = new ArrayList<>();

                while (resultSet.next()) {
                    Map<String, Object> object = new HashMap<>();

                    for (int i = 1; i <= columnCount; i++) {
                        String columnName = metadata.getColumnName(i);
                        Object columnValue = resultSet.getObject(i);

                        object.put(columnName, columnValue);
                    }

                    objects.add(object);
                }

                // objects 列表包含了查询结果的对象集合，每个对象都是一个 Map

                // 可以根据需要对 objects 进行进一步处理和转换
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
