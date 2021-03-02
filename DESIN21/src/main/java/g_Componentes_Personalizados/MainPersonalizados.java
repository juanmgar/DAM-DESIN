/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g_Componentes_Personalizados;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class MainPersonalizados extends FramePersonalizado implements ActionListener {

    BotonPersonalizado btnPulsa;
    LabelPersonalizado lblTexto;

    public MainPersonalizados() {
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        btnPulsa = new BotonPersonalizado("Púlsame");
        btnPulsa.addActionListener(this);
        lblTexto = new LabelPersonalizado("Etiqueta");
        add(btnPulsa);
        add(lblTexto);
        setSize(300,75);
        new FramePersonalizado().muestra();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        lblTexto.setText("Hola otra vez");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MainPersonalizados holi =  new MainPersonalizados();
       
    }
}
