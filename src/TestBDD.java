import java.sql.*;

public class TestBDD {



    public static void main(String args[]){

        try {
            String request1 = "select nom, prenom from test where nom=?;";
            String request2 = "insert into test(nom, prenom) values ('Molina', 'Jack');";

            String url = "jdbc:postgresql://localhost:5432/TestBDDJava";
            String username = "postgres";
            String password = "123";
            Connection con = DriverManager.getConnection(url, username, password);

            PreparedStatement preparedStatement1 = con.prepareStatement(request1);
            preparedStatement1.setString(1, "Molina");

            ResultSet result1 = preparedStatement1.executeQuery();

            while (result1.next()) {
                String nom = result1.getString("nom");
                String prenom = result1.getString("prenom");
                System.out.println(nom + " " + prenom);
            }

            PreparedStatement preparedStatement2 = con.prepareStatement(request2);
            int rows = preparedStatement2.executeUpdate(); //Cette instruction renvoie le nombre de lignes affectées

            //On peut tester que l'insertion s'est bien effectuée en vérifiant que rows > 0
            if(rows>0) System.out.println("Insertion réussie.");
            else System.out.println("Echec de l'insertion");

            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
