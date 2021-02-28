/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_componentes;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author juanmgar
 */
public class JFrame_HolaMundo extends JFrame {

    public JFrame_HolaMundo() {
        super("Hola mundo!");
        setLookAndFeel();
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {

        }
    }
    
    public static void main(String[] arguments){
        JFrame_HolaMundo frSaluda = new JFrame_HolaMundo();
    }

}
