package ico.fes.db;
 
 
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *
 * @author Jesus Flores
 */
public class BaseDeDatos {
 
    String dbPath;
    private Connection conexion;
    private static BaseDeDatos instanciaUnica;
 
    private BaseDeDatos() {
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/poo2022.db";
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión establecida...");
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public static BaseDeDatos getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new BaseDeDatos(); // llamada al constructor
        }else{
            System.out.println("El ejemplar ya existe!");
        }
        return instanciaUnica;
    }
 
    public Connection getConexion() {
        return conexion;
    }
 
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    /*
       ResultSet rst = stm.executeQuery("SELECT * FROM prueba1;");
            while (rst.next()){
                System.out.print("Nombre: " + rst.getString(1));
                System.out.println(" Telefono: " + rst .getString(2));
            }
            */
    public static void main(String[] args) {
        try {
            Statement stm = BaseDeDatos.getInstance ().getConexion().createStatement();
                   ResultSet rst = stm.executeQuery("SELECT * FROM prueba1;");
            while (rst.next()){
                System.out.print("Nombre: " + rst.getString(1));
                System.out.println(" Telefono: " + rst .getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
 
}