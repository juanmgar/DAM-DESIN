/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_cajas_dialogo;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class PruebaDialogoFrame extends JFrame {

    public PruebaDialogoFrame() {
        super("Prueba diálogo");
        //Se crea un JDialog personalizado. Este JDIALOG tapará el JFrame que estará debajo
        JDialog_DialogoUsuario dialogoUsuario = new JDialog_DialogoUsuario(this);
        setLayout(new GridLayout(2, 1, 20, 20));
        JLabel lblUsuario = new JLabel("Nombre de usuario: ", JLabel.CENTER);
        add(lblUsuario);
        JLabel lblPassword = new JLabel("Contraseña: ", JLabel.CENTER);
        add(lblPassword);
        lblUsuario.setText(lblUsuario.getText() + dialogoUsuario.getUsuario());
        lblPassword.setText(lblPassword.getText() + dialogoUsuario.getPassword());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PruebaDialogoFrame prueba = new PruebaDialogoFrame();
    }

}
