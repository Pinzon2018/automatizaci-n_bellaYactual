package co.com.OrchidPOS.runners.SuiteProductos;
import co.com.OrchidPOS.runners.RunnerInicioSesion.AutenticacionRunner;
import co.com.OrchidPOS.tasks.Productos.RegistrarProducto;
import co.com.OrchidPOS.tasks.Usuarios.RegistrarUsuario;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
@RunWith(Suite.class)
@Suite.SuiteClasses({
        AutenticacionRunner.class
})
public class SuiteProductos {

}
