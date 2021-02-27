/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_componentes;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class Color extends JFrame {

    public Color() {
        super("Color");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        JLabel lblColores = new JLabel("Escoge un color:");
        add(lblColores);
        ButtonGroup grpColores = new ButtonGroup();
        JRadioButton rbVerde = new JRadioButton("Verde", false);
        grpColores.add(rbVerde);
        JRadioButton rbAzul = new JRadioButton("Azul", false);
        grpColores.add(rbAzul);
        JRadioButton rbRojo = new JRadioButton("Rojo", false);
        grpColores.add(rbRojo);
        JRadioButton rbAmarillo = new JRadioButton("Amarillo", true);
        grpColores.add(rbAmarillo);
        add(rbVerde);
        add(rbAzul);
        add(rbRojo);
        add(rbAmarillo);
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
        Color frColor = new Color();
    }

}
