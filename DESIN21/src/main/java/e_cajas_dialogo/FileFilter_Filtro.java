/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e_cajas_dialogo;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Juanma García @juanmgar
 */

public class FileFilter_Filtro extends FileFilter {

    @Override
    public boolean accept(File file) {
        String nombreFichero = file.getName().toLowerCase();
        if (nombreFichero != null) {
            if (nombreFichero.endsWith(".jpeg")
                    || (nombreFichero.endsWith(".jpg"))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {
        return "Ficheros en formato JPG";
    }
}
