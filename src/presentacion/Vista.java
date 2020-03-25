
package presentacion;

import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Vista extends javax.swing.JFrame {

    private Controlador control;
    private Modelo modelo;
    
    public Vista(Modelo m) {
        modelo = m;
        initComponents();
        asignarEventos();
    }

    public Controlador getControl() {
        if(control == null){
            control = new Controlador(this);
        }
        return control;
    }

    private void asignarEventos() {
        btnOperar.addActionListener(getControl());
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JTextField();
        txtNumero1 = new javax.swing.JTextField();
        btnOperar = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        rbtSumar = new javax.swing.JRadioButton();
        rbtDividir = new javax.swing.JRadioButton();
        lienzo = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Número 1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(27, 59, 100, 40);

        jLabel2.setText("Número 2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 120, 90, 40);
        getContentPane().add(txtNumero2);
        txtNumero2.setBounds(140, 120, 90, 40);
        getContentPane().add(txtNumero1);
        txtNumero1.setBounds(140, 60, 90, 40);

        btnOperar.setText("Operar");
        getContentPane().add(btnOperar);
        btnOperar.setBounds(260, 60, 140, 100);

        lblResultado.setText("Resultado de la operación: ");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(30, 250, 370, 60);

        buttonGroup1.add(rbtSumar);
        rbtSumar.setSelected(true);
        rbtSumar.setText("Sumar");
        getContentPane().add(rbtSumar);
        rbtSumar.setBounds(60, 190, 133, 29);

        buttonGroup1.add(rbtDividir);
        rbtDividir.setText("Dividir");
        getContentPane().add(rbtDividir);
        rbtDividir.setBounds(230, 190, 133, 29);
        getContentPane().add(lienzo);
        lienzo.setBounds(440, 20, 290, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public JTextField getTxtNumero1() {
        return txtNumero1;
    }

    public JTextField getTxtNumero2() {
        return txtNumero2;
    }
    
    public Modelo getModelo() {
        return modelo;
    }

    public JRadioButton getRbtDividir() {
        return rbtDividir;
    }

    public JRadioButton getRbtSumar() {
        return rbtSumar;
    }

    public Canvas getLienzo() {
        return lienzo;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOperar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblResultado;
    private java.awt.Canvas lienzo;
    private javax.swing.JRadioButton rbtDividir;
    private javax.swing.JRadioButton rbtSumar;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables

    

    
}
