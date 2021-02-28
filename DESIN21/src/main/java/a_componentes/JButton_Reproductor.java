/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a_componentes;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa García @juanmgar
 */
public class JButton_Reproductor extends JFrame{

    public JButton_Reproductor() {
        super("Player");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        JButton btnPlay = new JButton("Play");
        JButton btnStop = new JButton("Stop");
        JButton btnPause = new JButton("Pause");
        add(btnPlay);
        add(btnStop);
        add(btnPause);
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
        JButton_Reproductor frReproductor=new JButton_Reproductor();
    }

}
