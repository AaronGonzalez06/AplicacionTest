/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import vista.Inicio;
import vista.Temas;
import vista.CrearPregunta;
import modelo.ConsultaCrearPregunta;

/**
 *
 * @author Aaron
 */
public class ControladorCrearPregunta implements ActionListener {

    private Inicio ventanaInicio;
    private CrearPregunta ventanaCrearPregunta;
    private ConsultaCrearPregunta modeloCrearPregunta = new ConsultaCrearPregunta();

    public ControladorCrearPregunta(Inicio ventanaInicio, CrearPregunta ventanaPregunta) {
        this.ventanaInicio = ventanaInicio;
        this.ventanaCrearPregunta = ventanaPregunta;
        //vistaInicio
        ventanaInicio.bCrear.addActionListener(this);
        ventanaCrearPregunta.bObtenertema.addActionListener(this);
        ventanaCrearPregunta.volverMenu.addActionListener(this);
        ventanaCrearPregunta.insertarPregunta.addActionListener(this);

        ventanaCrearPregunta.jComboBox1.setVisible(false);

        ventanaCrearPregunta.jLabel2.setVisible(false);
        ventanaCrearPregunta.jLabel3.setVisible(false);
        ventanaCrearPregunta.jLabel4.setVisible(false);
        ventanaCrearPregunta.jLabel5.setVisible(false);
        ventanaCrearPregunta.jLabel6.setVisible(false);
        ventanaCrearPregunta.jLabel7.setVisible(false);
        ventanaCrearPregunta.jPregunta.setVisible(false);
        ventanaCrearPregunta.jRespuesta1.setVisible(false);
        ventanaCrearPregunta.jRespuesta2.setVisible(false);
        ventanaCrearPregunta.jRespuesta3.setVisible(false);
        ventanaCrearPregunta.jRespuesta4.setVisible(false);
        ventanaCrearPregunta.numeroRespuesta.setVisible(false);
        ventanaCrearPregunta.insertarPregunta.setVisible(false);

        ventanaCrearPregunta.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ventanaInicio.bCrear) {
            ventanaInicio.setVisible(false);
            ventanaCrearPregunta.setVisible(true);
        } else if (e.getSource() == ventanaCrearPregunta.bObtenertema) {
            if (ventanaCrearPregunta.jRadioButton1.isSelected()) {
                String asignatura = ventanaCrearPregunta.jRadioButton1.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                ventanaCrearPregunta.jComboBox1.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaCrearPregunta.jComboBox1.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaCrearPregunta.jComboBox1.setVisible(true);
                ventanaCrearPregunta.jLabel2.setVisible(true);
                ventanaCrearPregunta.jLabel3.setVisible(true);
                ventanaCrearPregunta.jLabel4.setVisible(true);
                ventanaCrearPregunta.jLabel5.setVisible(true);
                ventanaCrearPregunta.jLabel6.setVisible(true);
                ventanaCrearPregunta.jLabel7.setVisible(true);
                ventanaCrearPregunta.jPregunta.setVisible(true);
                ventanaCrearPregunta.jRespuesta1.setVisible(true);
                ventanaCrearPregunta.jRespuesta2.setVisible(true);
                ventanaCrearPregunta.jRespuesta3.setVisible(true);
                ventanaCrearPregunta.jRespuesta4.setVisible(true);
                ventanaCrearPregunta.numeroRespuesta.setVisible(true);
                ventanaCrearPregunta.insertarPregunta.setVisible(true);
            } else if (ventanaCrearPregunta.jRadioButton2.isSelected()) {
                String asignatura = ventanaCrearPregunta.jRadioButton2.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                ventanaCrearPregunta.jComboBox1.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaCrearPregunta.jComboBox1.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaCrearPregunta.jComboBox1.setVisible(true);
                ventanaCrearPregunta.jLabel2.setVisible(true);
                ventanaCrearPregunta.jLabel3.setVisible(true);
                ventanaCrearPregunta.jLabel4.setVisible(true);
                ventanaCrearPregunta.jLabel5.setVisible(true);
                ventanaCrearPregunta.jLabel6.setVisible(true);
                ventanaCrearPregunta.jLabel7.setVisible(true);
                ventanaCrearPregunta.jPregunta.setVisible(true);
                ventanaCrearPregunta.jRespuesta1.setVisible(true);
                ventanaCrearPregunta.jRespuesta2.setVisible(true);
                ventanaCrearPregunta.jRespuesta3.setVisible(true);
                ventanaCrearPregunta.jRespuesta4.setVisible(true);
                ventanaCrearPregunta.numeroRespuesta.setVisible(true);
                ventanaCrearPregunta.insertarPregunta.setVisible(true);
            } else if (ventanaCrearPregunta.jRadioButton3.isSelected()) {
                String asignatura = ventanaCrearPregunta.jRadioButton3.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                ventanaCrearPregunta.jComboBox1.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaCrearPregunta.jComboBox1.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaCrearPregunta.jComboBox1.setVisible(true);
                ventanaCrearPregunta.jLabel2.setVisible(true);
                ventanaCrearPregunta.jLabel3.setVisible(true);
                ventanaCrearPregunta.jLabel4.setVisible(true);
                ventanaCrearPregunta.jLabel5.setVisible(true);
                ventanaCrearPregunta.jLabel6.setVisible(true);
                ventanaCrearPregunta.jLabel7.setVisible(true);
                ventanaCrearPregunta.jPregunta.setVisible(true);
                ventanaCrearPregunta.jRespuesta1.setVisible(true);
                ventanaCrearPregunta.jRespuesta2.setVisible(true);
                ventanaCrearPregunta.jRespuesta3.setVisible(true);
                ventanaCrearPregunta.jRespuesta4.setVisible(true);
                ventanaCrearPregunta.numeroRespuesta.setVisible(true);
                ventanaCrearPregunta.insertarPregunta.setVisible(true);
            } else if (ventanaCrearPregunta.jRadioButton4.isSelected()) {
                String asignatura = ventanaCrearPregunta.jRadioButton4.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                ventanaCrearPregunta.jComboBox1.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaCrearPregunta.jComboBox1.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaCrearPregunta.jComboBox1.setVisible(true);
                ventanaCrearPregunta.jLabel2.setVisible(true);
                ventanaCrearPregunta.jLabel3.setVisible(true);
                ventanaCrearPregunta.jLabel4.setVisible(true);
                ventanaCrearPregunta.jLabel5.setVisible(true);
                ventanaCrearPregunta.jLabel6.setVisible(true);
                ventanaCrearPregunta.jLabel7.setVisible(true);
                ventanaCrearPregunta.jPregunta.setVisible(true);
                ventanaCrearPregunta.jRespuesta1.setVisible(true);
                ventanaCrearPregunta.jRespuesta2.setVisible(true);
                ventanaCrearPregunta.jRespuesta3.setVisible(true);
                ventanaCrearPregunta.jRespuesta4.setVisible(true);
                ventanaCrearPregunta.numeroRespuesta.setVisible(true);
                ventanaCrearPregunta.insertarPregunta.setVisible(true);
            } else if (ventanaCrearPregunta.jRadioButton5.isSelected()) {
                String asignatura = ventanaCrearPregunta.jRadioButton5.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                ventanaCrearPregunta.jComboBox1.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaCrearPregunta.jComboBox1.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaCrearPregunta.jComboBox1.setVisible(true);
                ventanaCrearPregunta.jLabel2.setVisible(true);
                ventanaCrearPregunta.jLabel3.setVisible(true);
                ventanaCrearPregunta.jLabel4.setVisible(true);
                ventanaCrearPregunta.jLabel5.setVisible(true);
                ventanaCrearPregunta.jLabel6.setVisible(true);
                ventanaCrearPregunta.jLabel7.setVisible(true);
                ventanaCrearPregunta.jPregunta.setVisible(true);
                ventanaCrearPregunta.jRespuesta1.setVisible(true);
                ventanaCrearPregunta.jRespuesta2.setVisible(true);
                ventanaCrearPregunta.jRespuesta3.setVisible(true);
                ventanaCrearPregunta.jRespuesta4.setVisible(true);
                ventanaCrearPregunta.numeroRespuesta.setVisible(true);
                ventanaCrearPregunta.insertarPregunta.setVisible(true);
            }

        } else if (e.getSource() == ventanaCrearPregunta.volverMenu) {
            ventanaCrearPregunta.setVisible(false);
            ventanaInicio.setVisible(true);
        } else if (e.getSource() == ventanaCrearPregunta.insertarPregunta) {
            String pregunta = ventanaCrearPregunta.jPregunta.getText();
            String respuesta1 = ventanaCrearPregunta.jRespuesta1.getText();
            String respuesta2 = ventanaCrearPregunta.jRespuesta2.getText();
            String respuesta3 = ventanaCrearPregunta.jRespuesta3.getText();
            String respuesta4 = ventanaCrearPregunta.jRespuesta4.getText();
            String numeroRespuesta = (String) ventanaCrearPregunta.numeroRespuesta.getSelectedItem();

            if (pregunta.length() == 0 || respuesta1.length() == 0 || respuesta2.length() == 0 || respuesta3.length() == 0 || respuesta4.length() == 0) {
                JOptionPane.showMessageDialog(null, "Faltan datos por introducir");
            } else {                
                
                //tengo que verificar que se ve el tema que hemos elegido
                modeloCrearPregunta.insertarPregunta(pregunta);                
                int id = modeloCrearPregunta.mostrarIdpregunta(pregunta);
                String tema = (String) ventanaCrearPregunta.jComboBox1.getSelectedItem();
                String temaSinNumero = tema.substring(8);
                
                if (modeloCrearPregunta.insertarRespuesta(temaSinNumero, id, respuesta1, respuesta2, respuesta3, respuesta4, numeroRespuesta)) {
                        JOptionPane.showMessageDialog(null, "Pregunta añadida con exito.");
                } else {
                        JOptionPane.showMessageDialog(null, "Error con la pregunta.");
                }
            }

        }
    }

}
