/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_cajas_dialogo;

import static com.sun.glass.ui.Cursor.setVisible;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class FIleFilter_JFileChooser_DialogoAbrir1 extends JFrame {

    public FIleFilter_JFileChooser_DialogoAbrir1() {
        super("Prueba diálogo");
        JLabel lblArchivo = new JLabel("Archivo: ", JLabel.CENTER);
        JFileChooser dlgAbrir = new JFileChooser();
        //Le aplicamos el filtro que hemos creado en la otra clase
        //dlgAbrir.setFileFilter(new FileFilter_Filtro());
        
        //* Otra opción es hacer directamente esto a partir de JDK 1.6*//
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG & GIF", "jpg", "gif");
        dlgAbrir.setFileFilter(filtro);

        //Establecemos donde queremos que se abra nuestra ventana de dialogo
        File rutaApertura = new File("D:/desarrollo/");
        dlgAbrir.setCurrentDirectory(rutaApertura);

        int opcion = dlgAbrir.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            String nombreArchivo = dlgAbrir.getSelectedFile().getName();
            lblArchivo.setText(lblArchivo.getText() + nombreArchivo);
        }
        add(lblArchivo);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FIleFilter_JFileChooser_DialogoAbrir1 ejemplo = new FIleFilter_JFileChooser_DialogoAbrir1();
    }

}
