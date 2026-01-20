package jdbcexm;


import java.sql.*;

public class SimpleCrud {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mladec";
        String user = "root";
        String pass = "root@39";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement st = con.createStatement();

            // Create table with 5 columns
            st.execute("CREATE TABLE IF NOT EXISTS employees (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50), dept VARCHAR(50), salary INT, join_date DATE)");

            // Insert one record
            st.executeUpdate("INSERT INTO employees(name, dept, salary, join_date) VALUES('John', 'IT', 50000, '2025-12-30')");

            System.out.println("Table created and one record inserted successfully!");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

