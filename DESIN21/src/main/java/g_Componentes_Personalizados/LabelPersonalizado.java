/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g_Componentes_Personalizados;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author Juanma García @juanmgar
 */
public class LabelPersonalizado extends JLabel {

    public LabelPersonalizado(String texto) {
        super(texto);
        estableceAspecto();
    }

    public LabelPersonalizado() {
        super();
        estableceAspecto();
    }

    private void estableceAspecto() {
        setFont(new Font("Cooper Black", Font.PLAIN, 14));
        setForeground(new Color(235, 204, 28));
    }

}
