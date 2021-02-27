/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garciasierra.juanmanuel.a_componentes;

import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class Profesiones extends JFrame {

    public Profesiones() {
        super("Profesiones");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        JComboBox cbProfesiones = new JComboBox();
        cbProfesiones.addItem("Carnicero");
        cbProfesiones.addItem("Panadero");
        cbProfesiones.addItem("Sexador de pollos");
        cbProfesiones.addItem("Herrero");
        cbProfesiones.addItem("Luchador");
        cbProfesiones.addItem("Nini");
        add(cbProfesiones);
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
        Profesiones frProfesiones = new Profesiones();
    }

}
