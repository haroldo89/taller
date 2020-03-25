
package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador implements ActionListener{

    private Vista ventana;
    private Modelo modelo;
    
    public Controlador(Vista v) {
        ventana = v;
        modelo = v.getModelo();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        modelo.operar(); // Redireccionamos el evento causado por la vista a la funcionalidad del modelo
    }
    
}
