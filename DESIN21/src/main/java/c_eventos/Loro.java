/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c_eventos;

import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class Loro extends JFrame implements ActionListener, KeyListener {

    JLabel lblLoro;
    JTextField txtLoro;
    JButton btnReset;

    public Loro() {
        super("Lorito parlanchin");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel lblTexto = new JLabel("Texto:");
        lblLoro = new JLabel("", JLabel.CENTER);
        txtLoro = new JTextField(20);
        btnReset = new JButton("Reset");
        txtLoro.addKeyListener(this);
        btnReset.addActionListener(this);
        GridLayout admin = new GridLayout(3, 1);
        setLayout(admin);
        JPanel panel1 = new JPanel();
        panel1.add(lblTexto);
        panel1.add(lblLoro);
        JPanel panel2 = new JPanel();
        panel2.add(txtLoro);
        JPanel panel3 = new JPanel();
        panel3.add(btnReset);
        add(panel1);
        add(panel2);
        add(panel3);
        setSize(300, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        lblLoro.setText("");
        txtLoro.setText("");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            if (lblLoro.getText().length() > 0) {
                lblLoro.setText(lblLoro.getText().substring(0, lblLoro.getText().length() - 1));
            }
        } else if ((ke.getKeyCode() != KeyEvent.VK_SHIFT) && (ke.getKeyCode() != KeyEvent.VK_CAPS_LOCK)) {
            lblLoro.setText(lblLoro.getText() + ke.getKeyChar());
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
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
        Loro frLoro = new Loro();
    }

}
