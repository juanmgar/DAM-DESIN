/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut4_documentacion;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URL;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class UT4_Documentacion extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu menuArchivo, menuEditar, menuAyuda;
    private JMenuItem miSalir, miVerLaAyuda;
    private JButton btnAyuda;

    public UT4_Documentacion() {
        super("Menú con Opción de ayuda");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300, 100);

        //Crear iconos
        ImageIcon iconoAyuda = new ImageIcon(getClass().getResource("/resources/16x16/help.png"));
        ImageIcon iconoSalir = new ImageIcon(getClass().getResource("/resources/16x16/exit.png"));

        //Crear items de Menu
        miSalir = new JMenuItem("Salir", iconoSalir);
        miVerLaAyuda = new JMenuItem("Ver la ayuda", iconoAyuda);

        //Añadimos acción al botón de salida
        miSalir.addActionListener(this);

        //Añadimos mnemonico. Se activa al pulsar ALT + M + S.
        // Para que funcione el componente debe estar visible en pantalla
        miSalir.setMnemonic(KeyEvent.VK_S);

        //Se añade un accelerator. Se activa al pulsar la combinación CTRL + L
        miSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK));

        //Creamos las opciones dle menú
        menuArchivo = new JMenu("Archivo");
        menuEditar = new JMenu("Editar");
        menuAyuda = new JMenu("Ayuda");

        menuArchivo.setMnemonic(KeyEvent.VK_A);

        menuArchivo.add(miSalir);
        menuAyuda.add(miVerLaAyuda);

        menuBar = new JMenuBar();
        menuBar.add(menuArchivo);
        menuBar.add(menuEditar);
        menuBar.add(menuAyuda);
        menuBar.add(Box.createHorizontalGlue());
        menuBar.add(menuAyuda);
        
        setJMenuBar(menuBar);
        
        btnAyuda = new JButton("Haz click para ver la ayuda", iconoAyuda);
        add(btnAyuda);
        
        verLaAyuda();
        
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        
        add(btnAyuda);
        
        setLocationRelativeTo(null);
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
        UT4_Documentacion ejemplo = new UT4_Documentacion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==miSalir){
            System.exit(0);
        }
        
    }

    private void verLaAyuda() {
        try {
            //Cargamos el fichero de ayuda
            File fichero = new File("help/help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            //Creamos el helpset y el helpbroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            /*Añadimos la ayuda a tres condiciones
            Al pulsar sobre el botón de ayuda del menú
            Al pulsar sobre el botón F1
            Al hacer click en el botón de ayuda*/
            hb.enableHelpOnButton(miVerLaAyuda, "calculadora", helpset);
            hb.enableHelpKey(getRootPane(), "calculadora", helpset);
            hb.enableHelpOnButton(btnAyuda, "calculadora", helpset);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
