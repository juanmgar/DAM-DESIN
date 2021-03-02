/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f_Dibujar_Graficos;

import javax.swing.JFrame;

/**
 *
 * @author Juanma García @juanmgar
 */
public class GraficosFrame extends JFrame {

    public GraficosFrame() {
        super("Graficos");
        add(new GraficosPanel());
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        GraficosFrame graficos = new GraficosFrame();
    }
}
