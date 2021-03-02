/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g_Componentes_Personalizados;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author Juanma García @juanmgar
 */
public class FramePersonalizado extends JFrame {

    public FramePersonalizado() {
        super("Componentes a medida");
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        getContentPane().setBackground(Color.white);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void muestra() {
        setVisible(true);
    }
}
