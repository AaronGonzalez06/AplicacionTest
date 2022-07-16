/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.Inicio;
import vista.PreCuestionario;
import modelo.ConsultaCrearPregunta;

/**
 *
 * @author Aaron
 */
public class ControladorPreCuestionario implements ActionListener {

    private Inicio ventanaInicio;
    private PreCuestionario ventanaPreCuestionario;
    private ConsultaCrearPregunta modeloCrearPregunta = new ConsultaCrearPregunta();

    public ControladorPreCuestionario(Inicio ventanaInicio, PreCuestionario ventanaPreCuestionario) {
        this.ventanaInicio = ventanaInicio;
        this.ventanaPreCuestionario = ventanaPreCuestionario;

        ventanaPreCuestionario.menuprincipal.addActionListener(this);
        ventanaPreCuestionario.mostrartema.addActionListener(this);
        ventanaPreCuestionario.empezartest.addActionListener(this);

        ventanaPreCuestionario.jtemas.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ventanaPreCuestionario.menuprincipal) {
            ventanaPreCuestionario.setVisible(false);
            ventanaInicio.setVisible(true);
        } else if (e.getSource() == ventanaPreCuestionario.mostrartema) {
            
            if (ventanaPreCuestionario.jRadioButton1.isSelected()) {
                String asignatura = ventanaPreCuestionario.jRadioButton1.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);
                
            } else if (ventanaPreCuestionario.jRadioButton2.isSelected()) {
                String asignatura = ventanaPreCuestionario.jRadioButton2.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);
                
            } else if (ventanaPreCuestionario.jRadioButton3.isSelected()) {
                String asignatura = ventanaPreCuestionario.jRadioButton3.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);
                
            } else if (ventanaPreCuestionario.jRadioButton4.isSelected()) {
                String asignatura = ventanaPreCuestionario.jRadioButton4.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);
                
            } else if (ventanaPreCuestionario.jRadioButton5.isSelected()) {
                String asignatura = "Entrono de desarrollo";
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);
                
            }

        } else if(e.getSource() == ventanaPreCuestionario.empezartest){
            if(ventanaPreCuestionario.jtemas.getSelectedItem() == null){
                JOptionPane.showMessageDialog(null, "Selecione asignatura para poder ver los temas.");
            }else{
            
            }
        }

    }

}
