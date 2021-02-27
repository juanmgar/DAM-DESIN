/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_eventos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class CuentaPulsaciones extends JFrame implements ActionListener {

    JLabel lblPulsaciones;
    JButton btnPulsame;
    int numeroPulsaciones;

    public CuentaPulsaciones() {
        super("Pulsaciones");
        inicializaPulsaciones();
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lblPulsaciones = new JLabel("Pulsaciones: " + numeroPulsaciones, JLabel.CENTER);
        btnPulsame = new JButton("Pulsame");
        btnPulsame.addActionListener(this);
        GridLayout admin = new GridLayout(2, 1);
        setLayout(admin);
        add(lblPulsaciones);
        add(btnPulsame);
        setSize(300, 100);
        setVisible(true);
    }

    private void inicializaPulsaciones() {
        numeroPulsaciones = 0;
    }

    private int getPulsaciones() {
        return numeroPulsaciones;
    }

    private void muestraPulsaciones() {
        lblPulsaciones.setText("Pulsaciones: " + getPulsaciones());
    }

    private void actualizaPulsaciones() {
        numeroPulsaciones++;
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
        CuentaPulsaciones frPulsaciones = new CuentaPulsaciones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        actualizaPulsaciones();
        muestraPulsaciones();
    }

}
