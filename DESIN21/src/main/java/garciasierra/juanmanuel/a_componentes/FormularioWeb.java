/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garciasierra.juanmanuel.a_componentes;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class FormularioWeb extends JFrame {

    FlowLayout admin = new FlowLayout();

    public FormularioWeb() {
        super("TextField");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lblWeb = new JLabel("Página Web: ", JLabel.RIGHT);
        JTextField txtWeb = new JTextField(20);
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        add(lblWeb);
        add(txtWeb);
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
        FormularioWeb frFormularioWeb = new FormularioWeb();
    }

}
