/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g_Componentes_Personalizados;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author Juanma García @juanmgar
 */
public class BotonPersonalizado extends JButton implements MouseListener {

    public BotonPersonalizado() {
        super();
        estableceAspecto();
    }

    public BotonPersonalizado(String texto) {
        super(texto);
        estableceAspecto();
    }

    private void estableceAspecto() {
        setFont(new Font("Cooper Black", Font.PLAIN, 14));
        setForeground(Color.WHITE);
        setBackground(new Color(235, 204, 28));
        setBorderPainted(false);
        setFocusPainted(false);
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
    }

    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        setBackground(new Color(255, 217, 3));
    }

    @Override
    public void mouseExited(MouseEvent me) {
        setBackground(new Color(235, 204, 28));
    }
}

