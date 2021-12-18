
package Codigo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class AgendaClase {
    Connection conectar = null;
    public Connection conexion()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://db4free.net/consultastas","jordansom","jorsqlpro1");
            JOptionPane.showMessageDialog(null,"Conectado existosamente");
        }
        catch(ClassNotFoundException|SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            JOptionPane.showMessageDialog(null,"no conectado "+e);
        }
        return conectar;
    }
    
}
