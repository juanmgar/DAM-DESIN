/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_administradores;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author JuanMa Garcia @juanmgar
 */
public class Loteria extends JFrame {

// Elementos de la primera fila
    JPanel pFila1 = new JPanel();
    ButtonGroup grpOpciones = new ButtonGroup();
    JCheckBox chkAleatorios = new JCheckBox("Aleatorios", false);
    JCheckBox chkPersonal = new JCheckBox("Personalizado", true);

//Elementos de la segunda fila
    JPanel pFila2 = new JPanel();
    JLabel lblNumeros = new JLabel("Su apuesta", JLabel.RIGHT);
    JTextField[] txtNumeros = new JTextField[6];
    JLabel lblGanadores = new JLabel("Ganadores", JLabel.RIGHT);
    JTextField[] txtGanadores = new JTextField[6];

//Elementos de la tercera fila
    JPanel pFila3 = new JPanel();
    JButton btnParar = new JButton("Parar");
    JButton btnPlay = new JButton("Iniciar");
    JButton btnReset = new JButton("Reinicializar");

//Elementos de la cuarta fila
    JPanel pFila4 = new JPanel();
    JLabel lblTres = new JLabel("3 de 6: ", JLabel.RIGHT);
    JTextField txtTres = new JTextField("0");
    JLabel lblCuatro = new JLabel("4 de 6: ", JLabel.RIGHT);
    JTextField txtCuatro = new JTextField("0");
    JLabel lblCinco = new JLabel("5 de 6: ", JLabel.RIGHT);
    JTextField txtCinco = new JTextField("0");
    JLabel lblSeis = new JLabel("6 de 6: ", JLabel.RIGHT);
    JTextField txtSeis = new JTextField("0", 10);
    JLabel lblApuestas = new JLabel("Apuestas: ", JLabel.RIGHT);
    JTextField txtApuestas = new JTextField("0");
    JLabel lblAnios = new JLabel("Años: ", JLabel.RIGHT);
    JTextField txtAnios = new JTextField();

    public Loteria() {
        super("Lotería");
        opcionesGenerales();
        rellenaFila1();
        rellenaFila2();
        rellenaFila3();
        rellenaFila4();
        setVisible(true);
    }

    private void opcionesGenerales() {
        setLookAndFeel();
        setSize(550, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout adminGeneral = new GridLayout(5, 1, 10, 10);
        /* añadimos 5 filas en vez de cuatro para que la cuarta
        no quede tan pegada al borde inferior */
        setLayout(adminGeneral);
    }

    private void rellenaFila1() {
        FlowLayout admin = new FlowLayout(FlowLayout.CENTER, 10, 10);
        pFila1.setLayout(admin);
        grpOpciones.add(chkAleatorios);
        grpOpciones.add(chkPersonal);
        pFila1.add(chkAleatorios);
        pFila1.add(chkPersonal);
        add(pFila1);
    }

    private void rellenaFila2() {
        GridLayout admin = new GridLayout(2, 7, 10, 10);
        pFila2.setLayout(admin);
        pFila2.add(lblNumeros);
        for (int i = 0; i < 6; i++) {
            txtNumeros[i] = new JTextField();
            pFila2.add(txtNumeros[i]);
        }
        pFila2.add(lblGanadores);
        for (int i = 0; i < 6; i++) {
            txtGanadores[i] = new JTextField();
            txtGanadores[i].setEditable(false);
            pFila2.add(txtGanadores[i]);
        }
        add(pFila2);
    }

    private void rellenaFila3() {
        FlowLayout admin = new FlowLayout(FlowLayout.CENTER, 10, 10);
        pFila3.setLayout(admin);
        btnParar.setEnabled(false);
        pFila3.add(btnParar);
        pFila3.add(btnPlay);
        pFila3.add(btnReset);
        add(pFila3);
    }

    private void rellenaFila4() {
        GridLayout admin = new GridLayout(2, 3, 20, 10);
        pFila4.setLayout(admin);
        pFila4.add(lblTres);
        txtTres.setEditable(false);
        pFila4.add(txtTres);
        pFila4.add(lblCuatro);
        txtCuatro.setEditable(false);
        pFila4.add(txtCuatro);
        pFila4.add(lblCinco);
        txtCinco.setEditable(false);
        pFila4.add(txtCinco);
        pFila4.add(lblSeis);
        txtSeis.setEditable(false);
        pFila4.add(txtSeis);
        pFila4.add(lblApuestas);
        txtApuestas.setEditable(false);
        pFila4.add(txtApuestas);
        pFila4.add(lblAnios);
        txtAnios.setEditable(false);
        pFila4.add(txtAnios);
        add(pFila4);
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
        Loteria fLoteria = new Loteria();
    }

}
