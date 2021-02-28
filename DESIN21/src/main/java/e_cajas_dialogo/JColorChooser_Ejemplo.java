/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_cajas_dialogo;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class JColorChooser_Ejemplo extends JFrame {

    public JColorChooser_Ejemplo() {

        super("Prueba diálogo");
        JLabel lblColor = new JLabel("Color: ", JLabel.CENTER);
        Color color = JColorChooser.showDialog(this, "Escoge un color", Color.yellow);
        if (color != null) {
            lblColor.setText(lblColor.getText() + color.toString());
        }
        add(lblColor);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JColorChooser_Ejemplo prueba = new JColorChooser_Ejemplo();
    }

}
