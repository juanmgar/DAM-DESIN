/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_componentes;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class Modulos extends JFrame {

    private String[] modulos
            = {"Sistemas de Gestión Empresarial",
                "Desarrollo de Interfaces",
                "Acceso a datos",
                "Desarrollo de interfaces",
                "Programación multimedia y dispositivos móviles",
                "Programación de servicios y procesos",
                "Formación y orientación laboral"
            };

    public Modulos() {
        super("Modulos DAM");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pModulos = new JPanel();
        JLabel lblModulos = new JLabel("Módulos DAM");
        pModulos.add(lblModulos);
        JList lstmodulos = new JList(modulos);
        lstmodulos.setSelectedIndex(1);
        lstmodulos.setVisibleRowCount(4);
        JScrollPane scroller = new JScrollPane(lstmodulos);
        pModulos.add(scroller);
        add(pModulos);
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
        Modulos frmModulos = new Modulos();
    }

}
