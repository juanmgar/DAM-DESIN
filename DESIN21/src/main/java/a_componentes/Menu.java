/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_componentes;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class Menu extends JFrame {

    public Menu() {
        super("Menú");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        JCheckBox fabada = new JCheckBox("Fabada", true);
        JCheckBox pote = new JCheckBox("Pote");
        JCheckBox ensaladilla = new JCheckBox("Ensaladilla");
        JCheckBox pan = new JCheckBox("Pan", true);
        ButtonGroup comidas = new ButtonGroup();
        comidas.add(fabada);
        comidas.add(pote);
        comidas.add(ensaladilla);

        add(fabada);
        add(pote);
        add(ensaladilla);
        add(pan);
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
        Menu frMenu = new Menu();
    }

}
