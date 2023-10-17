import java.sql.*;

public class TestBDD {



    public static void main(String args[]){

        try {
            String request = "select nom, prenom from test where nom=?;";
            String url = "jdbc:postgresql://localhost:5432/TestBDDJava";
            String username = "postgres";
            String password = "passwordDatabase";

            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement = con.prepareStatement(request);
            preparedStatement.setString(1, "Molina");

            ResultSet result = preparedStatement.executeQuery();

            while (result.next()) {
                String nom = result.getString("nom");
                String prenom = result.getString("prenom");
                System.out.println(nom + " " + prenom);
            }

            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
