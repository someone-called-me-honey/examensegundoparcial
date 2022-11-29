/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author rosal
 */
public class FomularioChido extends JFrame {

    public FomularioChido() {

        //atributos generales del frame
        super("Genera tu INE");
        setSize(720, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); //diseño libre

        //aqui va todo lo interno del frame
        componentes();

        //esto va al ultimo
        setVisible(true);

    }
    public String photopath = null;
    public JLabel jLabelRutaFoto;
    public JLabel jLabelFoto;
    public JLabel jLabelNombre;
    public JTextField jTextFieldNombre;
    public JLabel jLabelApellidoP;
    public JTextField jTextFieldApellidoP;
    public JLabel jLabelApellidoM;
    public JTextField jTextFieldApellidoM;
    public JLabel jLabelEstado;
    public JTextField jTextFieldEstado;
    public JLabel jLabelCiudad;
    public JTextField jTextFieldCiudad;
    public JLabel jLabelColonia;
    public JTextField jTextFieldColonia;
    public JLabel jLabelCodigoP;
    public JTextField jTextFieldCodigoP;
    public JLabel jLabelCalle;
    public JTextField jTextFieldCalle;
    public JLabel jLabelNCasa;
    public JTextField jTextFieldNCasa;
    public JLabel jLabelCurp;
    public JTextField jTextFieldCurp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FomularioChido formu = new FomularioChido();
    }

    private void componentes() {

        //fuentes usadas
        Font fuenteT = new Font("Yu Gothic UI Semilight", Font.BOLD, 28);
        Font fuenteF = new Font("Yu Gothic UI Semilight", 0, 14);
        Font fuenteC = new Font("Yu Gothic UI Semilight", 0, 14);

        //empezamos con el diseño de los componentes
        //titulo
        JLabel jLabelTitulo = new JLabel("Ingresa los datos");
        jLabelTitulo.setFont(fuenteT);
        //asi le damos el tamaño y ubicacion
        jLabelTitulo.setBounds(10, 0, 250, 40);
        //asi se agrega el componente al jFrame
        add(jLabelTitulo);

        //Nombre
        jLabelNombre = new JLabel("Nombre");
        jLabelNombre.setFont(fuenteF);
        jLabelNombre.setBounds(10, 50, 100, 30);
        add(jLabelNombre);

        jTextFieldNombre = new JTextField();
        jTextFieldNombre.setFont(fuenteC);
        jTextFieldNombre.setBounds(160, 50, 150, 30);
        add(jTextFieldNombre);

        //Apellido Paterno
        jLabelApellidoP = new JLabel("Apellido Paterno");
        jLabelApellidoP.setFont(fuenteF);
        jLabelApellidoP.setBounds(10, 90, 100, 30);
        add(jLabelApellidoP);

        jTextFieldApellidoP = new JTextField();
        jTextFieldApellidoP.setFont(fuenteC);
        jTextFieldApellidoP.setBounds(160, 90, 150, 30);
        add(jTextFieldApellidoP);

        //Apellido Materno
        jLabelApellidoM = new JLabel("Apellido Materno");
        jLabelApellidoM.setFont(fuenteF);
        jLabelApellidoM.setBounds(10, 130, 150, 30);
        add(jLabelApellidoM);

        jTextFieldApellidoM = new JTextField();
        jTextFieldApellidoM.setFont(fuenteC);
        jTextFieldApellidoM.setBounds(160, 130, 150, 30);
        add(jTextFieldApellidoM);

        //estado 
        jLabelEstado = new JLabel("Estado");
        jLabelEstado.setFont(fuenteF);
        jLabelEstado.setBounds(10, 170, 100, 30);
        add(jLabelEstado);

        jTextFieldEstado = new JTextField();
        jTextFieldEstado.setFont(fuenteC);
        jTextFieldEstado.setBounds(160, 170, 150, 30);
        add(jTextFieldEstado);

        //ciudad 
        jLabelCiudad = new JLabel("Ciudad");
        jLabelCiudad.setFont(fuenteF);
        jLabelCiudad.setBounds(10, 210, 100, 30);
        add(jLabelCiudad);

        jTextFieldCiudad = new JTextField();
        jTextFieldCiudad.setFont(fuenteC);
        jTextFieldCiudad.setBounds(160, 210, 150, 30);
        add(jTextFieldCiudad);

        //colonia 
        jLabelColonia = new JLabel("Colonia");
        jLabelColonia.setFont(fuenteF);
        jLabelColonia.setBounds(10, 250, 100, 30);
        add(jLabelColonia);

        jTextFieldColonia = new JTextField();
        jTextFieldColonia.setFont(fuenteC);
        jTextFieldColonia.setBounds(160, 250, 150, 30);
        add(jTextFieldColonia);

        //Codigopostal 
        jLabelCodigoP = new JLabel("Codigo Postal");
        jLabelCodigoP.setFont(fuenteF);
        jLabelCodigoP.setBounds(10, 290, 150, 30);
        add(jLabelCodigoP);

        jTextFieldCodigoP = new JTextField();
        jTextFieldCodigoP.setFont(fuenteC);
        jTextFieldCodigoP.setBounds(160, 290, 150, 30);
        add(jTextFieldCodigoP);

        //calle
        jLabelCalle = new JLabel("Calle");
        jLabelCalle.setFont(fuenteF);
        jLabelCalle.setBounds(10, 330, 100, 30);
        add(jLabelCalle);

        jTextFieldCalle = new JTextField();
        jTextFieldCalle.setFont(fuenteC);
        jTextFieldCalle.setBounds(160, 330, 150, 30);
        add(jTextFieldCalle);

        //NCasa
        jLabelNCasa = new JLabel("Numero de casa");
        jLabelNCasa.setFont(fuenteF);
        jLabelNCasa.setBounds(10, 370, 150, 30);
        add(jLabelNCasa);

        jTextFieldNCasa = new JTextField();
        jTextFieldNCasa.setFont(fuenteC);
        jTextFieldNCasa.setBounds(160, 370, 150, 30);
        add(jTextFieldNCasa);

        //curp
        jLabelCurp = new JLabel("CURP");
        jLabelCurp.setFont(fuenteF);
        jLabelCurp.setBounds(10, 410, 150, 30);
        add(jLabelCurp);

        jTextFieldCurp = new JTextField();
        jTextFieldCurp.setFont(fuenteC);
        jTextFieldCurp.setBounds(160, 410, 150, 30);
        add(jTextFieldCurp);

        //foto -> profa no me pregunte como le hice aqui pq ni yo se, no me acuerdo como lo razone
        JButton jButtonAbrir = new JButton("Abrir foto");
        jButtonAbrir.setFont(fuenteF);
        jButtonAbrir.setBackground(Color.WHITE);
        jButtonAbrir.setForeground(Color.BLACK);
        jButtonAbrir.setBounds(350, 290, 150, 30);
        jButtonAbrir.addActionListener((ActionEvent e) -> {
            evento_jButtonAbrir();
        });
        add(jButtonAbrir);

        jLabelRutaFoto = new JLabel();
        jLabelRutaFoto.setFont(fuenteF);
        jLabelRutaFoto.setBounds(510, 290, 150, 30);
        add(jLabelRutaFoto);

        jLabelFoto = new JLabel();
        jLabelFoto.setBounds(350, 50, 150, 200);
        add(jLabelFoto);

        //boton guardar
        JButton jButtonGuardar = new JButton("Guardar");
        jButtonGuardar.setFont(fuenteF);
        jButtonGuardar.setBackground(Color.white);
        jButtonGuardar.setForeground(Color.BLACK);
        jButtonGuardar.setBounds(350, 370, 300, 30);
        jButtonGuardar.addActionListener((ActionEvent e) -> {
            evento_jButtonGuardar();
        });
        add(jButtonGuardar);

    }

    public void evento_jButtonAbrir() {
        try {
            JFileChooser filechooser = new JFileChooser();
            if (JFileChooser.APPROVE_OPTION == filechooser.showDialog(null, "seleccionar")) {
                File file = filechooser.getSelectedFile();
                photopath = file.getAbsolutePath();
                jLabelRutaFoto.setText(photopath);
                jLabelFoto.setIcon(new ImageIcon(photopath));
                System.out.println(photopath);
            }
        } catch (HeadlessException e) {
            System.out.println(e);
        }

    }

    private void evento_jButtonGuardar() {
        try {
            PDF credencial =new PDF();
            credencial.credencial(photopath, jTextFieldNombre.getText(), jTextFieldApellidoP.getText(), jTextFieldApellidoM.getText(), jTextFieldCalle.getText(), jTextFieldNCasa.getText(), jTextFieldColonia.getText(), jTextFieldCodigoP.getText(), jTextFieldCiudad.getText(), jTextFieldEstado.getText(), jTextFieldCurp.getText());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.exit(0);
    }
}
