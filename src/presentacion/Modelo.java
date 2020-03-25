package presentacion;

import java.awt.Canvas;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Calculadora;
import logica.DivisionCeroException;


public class Modelo implements Runnable{
    
    private Vista ventanaInicial;
    private Calculadora miSistema;
    private boolean activo;
    private Thread hiloDibujo;

    public Modelo() {
        activo = true;
        hiloDibujo = new Thread(this);
    }
    
    public Vista getVentanaInicial() {
        if(ventanaInicial == null){
            ventanaInicial = new Vista(this);
        }
        return ventanaInicial;
    }

    public Calculadora getMiSistema() {
        if(miSistema == null){
            miSistema = new Calculadora();
        }
        return miSistema;
    }

    
    
    
    
    public void iniciar(){
        getVentanaInicial().setSize(800, 400);
        getVentanaInicial().setVisible(true);
        hiloDibujo.start();
    }
    
    public void operar(){ // Representa un requerimiento funcional
        float n1, n2, r;
        String operador;
        
        // Tomamos los datos de la vista
        try{
            n1 = Float.parseFloat(getVentanaInicial().getTxtNumero1().getText());
            n2 = Float.parseFloat(getVentanaInicial().getTxtNumero2().getText());
            
            // Pasamos los datos a la lógica
            getMiSistema().setN1(n1);
            getMiSistema().setN2(n2);
           
            // Invocamos el algoritmo del negocio y obtenemos los resultados
            if(getVentanaInicial().getRbtSumar().isSelected()){
                r = getMiSistema().suma();
                operador = "Suma";
            }else{
                r = getMiSistema().dividir();
                operador = "División";
            }
            // presentamos los resultados en la vista
            getVentanaInicial().getLblResultado().setText("El resultado de la " + operador + " es: " + r);
            
            
            
        }catch(java.lang.NumberFormatException err){
            getVentanaInicial().getLblResultado().setText("Error! Datos ingresados son incorrectos!");
        }catch(DivisionCeroException d0){
            getVentanaInicial().getLblResultado().setText(d0.getMessage());
        }            
    }

    @Override
    public void run() {
        while(activo){            
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {                
            }
            dibujar();
        }
    }

    private void dibujar() {
        Canvas lienzo = getVentanaInicial().getLienzo();
        Graphics lapiz = lienzo.getGraphics();
        
        getMiSistema().getBolita().draw(lapiz);
    }
    

}
