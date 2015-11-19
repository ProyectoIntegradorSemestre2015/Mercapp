
package Controlador;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Conexion implements Serializable {

    // Me conectaré via JDBC
    java.sql.Connection con; // Carga El Driver
    java.sql.Statement st; // Se conecta al Motor
    java.sql.ResultSet rs; // Se ejecutan SQL

    public Conexion() {
        try {
            // Carga El Driver
            Class.forName("org.postgresql.Driver");
            System.out.println("Se cargó el Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando el Driver");
        }

        try {
            // Se conecta al Motor
            con = java.sql.DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/db_promociones", "postgres", "admin");
            System.out.println("Se conectó");
        } catch (java.sql.SQLException ex) {
            System.out.println("Error conectando");
        }
    }

    public boolean procesaSQL(String sql) {
        try {
            st = con.createStatement(); // Se conecta
            return st.execute(sql); // Procesa el SQL
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }

    public boolean procesaSQL2(String sql) throws java.sql.SQLException {
        st = con.createStatement(); // Se conecta
        return st.execute(sql); // Procesa el SQL
    }

    public java.sql.ResultSet procesaSQLConsulta(String sql) {
        try {
            st = con.createStatement(); // Se conecta
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Error en la capa de datos con el SQL");
        }
        return null;
    }

    public Connection getCon() {
        return con;
    }

    public ResultSet consultar(String sql) {
        try {
            st = getCon().createStatement();
            rs = st.executeQuery(sql);
        } catch (SQLException e) {
            return null;
        }
        return rs;
    }

    public int actualizar(String sql) {
        try {
            st = getCon().createStatement();
            st.executeUpdate(sql);
            st.close();
            return 1;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return -1;
    }

    public java.sql.ResultSet resultadorSQL(String SQL) throws SQLException {
        //Me conecto con el motor
        st = con.createStatement();
        //solicito al motor que ejecute el SQL
        return st.executeQuery(SQL);
    }

}
