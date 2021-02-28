/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d_otros_componentes;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class JSlider_Regulador_Colores extends JFrame implements ChangeListener {

    JSlider sliRojo;
    JSlider sliVerde;
    JSlider sliAzul;
    JPanel pColor;

    public JSlider_Regulador_Colores() {
        super("Colores");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout admin = new GridLayout(4, 1);
        setLayout(admin);
        FlowLayout adminPanel = new FlowLayout(FlowLayout.RIGHT);
        JPanel pRojo = new JPanel();
        pRojo.setLayout(adminPanel);
        JLabel lblRojo = new JLabel("Rojo:");
        sliRojo = new JSlider(0, 255, 255);
        sliRojo.setMajorTickSpacing(50);
        sliRojo.setMinorTickSpacing(10);
        sliRojo.setPaintTicks(true);
        sliRojo.setPaintLabels(true);
        sliRojo.addChangeListener(this);
        pRojo.add(lblRojo);
        pRojo.add(sliRojo);
        add(pRojo);
        JPanel pVerde = new JPanel();
        pVerde.setLayout(adminPanel);
        JLabel lblVerde = new JLabel("Verde:");
        sliVerde = new JSlider(0, 255, 0);
        sliVerde.setMajorTickSpacing(50);

        sliVerde.setMinorTickSpacing(10);
        sliVerde.setPaintTicks(true);
        sliVerde.setPaintLabels(true);
        sliVerde.addChangeListener(this);
        pVerde.add(lblVerde);
        pVerde.add(sliVerde);
        add(pVerde);
        JPanel pAzul = new JPanel();
        pAzul.setLayout(adminPanel);
        JLabel lblAzul = new JLabel("Azul:");
        sliAzul = new JSlider(0, 255, 0);
        sliAzul.setMajorTickSpacing(50);
        sliAzul.setMinorTickSpacing(10);
        sliAzul.setPaintTicks(true);
        sliAzul.setPaintLabels(true);
        sliAzul.addChangeListener(this);
        pAzul.add(lblAzul);
        pAzul.add(sliAzul);
        add(pAzul);
        pColor = new JPanel();
        pColor.setBackground(Color.RED);
        add(pColor);
        pack();
        setVisible(true);
    }

    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {

        }
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        JSlider sliColor = (JSlider) ce.getSource();
        if (!sliColor.getValueIsAdjusting()) {
            Color colorActual = new Color(sliRojo.getValue(),
                    sliVerde.getValue(),
                    sliAzul.getValue());
            pColor.setBackground(colorActual);
        }
    }
        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {
        JSlider_Regulador_Colores colores = new JSlider_Regulador_Colores();
    }

}
