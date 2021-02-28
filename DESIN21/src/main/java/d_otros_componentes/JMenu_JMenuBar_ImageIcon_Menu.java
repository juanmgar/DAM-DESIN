/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d_otros_componentes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class JMenu_JMenuBar_ImageIcon_Menu extends JFrame implements ActionListener {

    JTextArea editor;

    public JMenu_JMenuBar_ImageIcon_Menu() {
        super("Menú de Opciones");
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear iconos
        ImageIcon iconNuevo = new ImageIcon(getClass().getResource("/16x16/document-new.png"));
        ImageIcon iconNuevoGrande = new ImageIcon(getClass().getResource("/32x32/document-new.png"));
        ImageIcon iconAbrir = new ImageIcon(getClass().getResource("/16x16/document-open.png"));
        ImageIcon iconAbrirGrande = new ImageIcon(getClass().getResource("/32x32/document-open.png"));
        ImageIcon iconGuardar = new ImageIcon(getClass().getResource("/16x16/document-save.png"));
        ImageIcon iconGuardarGrande = new ImageIcon(getClass().getResource("/32x32/document-save.png"));
        ImageIcon iconGuardarComo = new ImageIcon(getClass().getResource("/16x16/document-save-as.png"));
        ImageIcon iconGuardarComoGrande = new ImageIcon(getClass().getResource("/32x32/document-save-as.png"));
        ImageIcon iconCortar = new ImageIcon(getClass().getResource("/16x16/edit-cut.png"));
        ImageIcon iconCortarGrande = new ImageIcon(getClass().getResource("/32x32/edit-cut.png"));
        ImageIcon iconPegar = new ImageIcon(getClass().getResource("/16x16/edit-paste.png"));
        ImageIcon iconPegarGrande = new ImageIcon(getClass().getResource("/32x32/edit-paste.png"));
        ImageIcon iconDeshacer = new ImageIcon(getClass().getResource("/16x16/edit-undo.png"));
        ImageIcon iconDeshacerGrande = new ImageIcon(getClass().getResource("/32x32/edit-undo.png"));

        //Crear Menu
        JMenuItem miNuevo = new JMenuItem("Nuevo", iconNuevo);
        miNuevo.setActionCommand("Nuevo");
        miNuevo.addActionListener(this);
        JMenuItem miAbrir = new JMenuItem("Abrir", iconAbrir);
        miAbrir.setActionCommand("Abrir");
        miAbrir.addActionListener(this);
        JMenuItem miGuardar = new JMenuItem("Guardar", iconGuardar);
        miGuardar.setActionCommand("Guardar");
        miGuardar.addActionListener(this);
        JMenuItem miGuardarComo = new JMenuItem("Guardar como", iconGuardarComo);
        miGuardarComo.setActionCommand("Guardar como");
        miGuardarComo.addActionListener(this);

        JMenuItem miCortar = new JMenuItem("Cortar", iconCortar);
        JMenuItem miPegar = new JMenuItem("Pegar", iconPegar);
        JMenuItem miDeshacer = new JMenuItem("Deshacer", iconDeshacer);

        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuEditar = new JMenu("Editar");

        menuArchivo.add(miNuevo);
        menuArchivo.add(miAbrir);
        menuArchivo.add(miGuardar);
        menuArchivo.add(miGuardarComo);
        menuEditar.add(miCortar);
        menuEditar.add(miPegar);
        menuEditar.add(miDeshacer);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menuArchivo);
        menuBar.add(menuEditar);

        //Crear botones de la barra de herramientas
        JButton btnNuevo = new JButton(iconNuevoGrande);
        btnNuevo.setActionCommand("Nuevo");
        btnNuevo.addActionListener(this);
        JButton btnAbrir = new JButton(iconAbrirGrande);
        btnAbrir.setActionCommand("Abrir");
        btnAbrir.addActionListener(this);
        JButton btnGuardar = new JButton(iconGuardarGrande);
        btnGuardar.setActionCommand("Guardar");
        btnGuardar.addActionListener(this);
        JButton btnGuardarComo = new JButton(iconGuardarComoGrande);
        btnGuardarComo.setActionCommand("Guardar como");
        btnGuardarComo.addActionListener(this);

        JToolBar barraHerramientas = new JToolBar();
        barraHerramientas.add(btnNuevo);
        barraHerramientas.add(btnAbrir);
        barraHerramientas.add(btnGuardar);
        barraHerramientas.add(btnGuardarComo);

        // Preparar interface usuario
        editor = new JTextArea(8, 40);
        JScrollPane scroll = new JScrollPane(editor);
        BorderLayout admin = new BorderLayout();
        setLayout(admin);

        setJMenuBar(menuBar);
        add(barraHerramientas, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);

        pack();
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
        JMenu_JMenuBar_ImageIcon_Menu ejemplo = new JMenu_JMenuBar_ImageIcon_Menu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Nuevo": {
                accionNuevo();
                break;
            }
            case "Abrir": {
                accionAbrir();
                break;
            }
            case "Guardar": {
                accionGuardar();
                break;
            }
            case "Guardar como": {
                accionGuardarComo();
                break;
            }
        }
    }

    private void accionNuevo() {
        editor.setText("Pulsado nuevo");
    }

    private void accionAbrir() {
        editor.setText("Pulsado abrir");
    }

    private void accionGuardar() {
        editor.setText("Pulsado guardar");
    }

    private void accionGuardarComo() {
        editor.setText("Pulsado guardar como");
    }

}
