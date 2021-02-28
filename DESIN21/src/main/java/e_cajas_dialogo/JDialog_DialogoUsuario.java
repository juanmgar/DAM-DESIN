/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_cajas_dialogo;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class JDialog_DialogoUsuario extends JDialog implements ActionListener {

    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JButton btnAceptar;

    public JDialog_DialogoUsuario(JFrame padre) {
        super(padre, true);
        inicializaComponentes();
        pack();
        setVisible(true);
    }

    public void inicializaComponentes() {
        setLayout(new GridLayout(3, 1, 20, 20));
        JLabel lblUsuario = new JLabel("Usuario: ");
        JLabel lblPassword = new JLabel("Password:");
        txtUsuario = new JTextField(10);
        txtPassword = new JPasswordField(10);
        btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(this);
        JPanel pUsuario = new JPanel();
        pUsuario.add(lblUsuario);
        pUsuario.add(txtUsuario);
        getContentPane().add(pUsuario);
        JPanel pPassword = new JPanel();
        pPassword.add(lblPassword);
        pPassword.add(txtPassword);
        getContentPane().add(pPassword);
        JPanel pAceptar = new JPanel();
        pAceptar.add(btnAceptar);
        getContentPane().add(pAceptar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public String getUsuario() {
        return txtUsuario.getText();
    }

    public String getPassword() {
        return String.valueOf(txtPassword.getPassword());
    }

}
