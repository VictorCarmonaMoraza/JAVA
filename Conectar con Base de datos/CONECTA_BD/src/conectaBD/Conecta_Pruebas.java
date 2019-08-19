package conectaBD;

import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// 1--CREAR CONEXION

			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/DATOSPERSONALES2", "lampp", "victor");

			// 2--CREAR OBJETO STATEMENT

			Statement miStatement = miConexion.createStatement();

			// 3--EJECUTAR SQL

			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM USUARIOS");

			// 4--RECORRER(LEER) EL RESULTSET

			while (miResultset.next()) {

				System.out.println(miResultset.getString("NOMBRE") + " " + miResultset.getString("EDAD") + " "
						+ miResultset.getString("NIF"));

			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No conecta");

			   System.out.println("ERROR: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
