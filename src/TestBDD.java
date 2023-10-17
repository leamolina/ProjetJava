import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestBDD {



    public static void main(String args[]){

        try {
            String request = "select nom from test where id=1;";
            String url = "jdbc:postgresql://localhost:5432/TestBDDJava";
            String username = "postgres";
            String password = "passwordDatabase";

            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement(); //ATTENTION : pas bien d'utiliser Statement, mieux vaut apprendre à utiliser un prepared statement (+ sûr si on a des interactions avec l'utilisateur et qu'on sait pas toujours ce qu'il va rentrer)
            ResultSet result = st.executeQuery(request); //Renvoie un objet de type ResultSet : un data
            result.next(); //Pck sinon ca pointe vers la premiere colonne (celle avec les numeros des lignes)
            String name = result.getString(1);
            System.out.println(name);
            con.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }

}
