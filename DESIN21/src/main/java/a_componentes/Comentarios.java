/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_componentes;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class Comentarios extends JFrame {

    public Comentarios() {
        super("Comentarios");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        JTextArea taComentarios = new JTextArea(8, 40);
        taComentarios.setText("Esta es la primera línea de texto\n …y esta es la segunda.");
        add(taComentarios);
        pack();
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comentarios frComentarios = new Comentarios();
    }

}
