/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import vista.Inicio;
import vista.Temas;
import vista.CrearPregunta;

/**
 *
 * @author Aaron
 */
public class ControladorCrearPregunta implements ActionListener {

    private Inicio ventanaInicio;
    private CrearPregunta ventanaCrearPregunta;

    public ControladorCrearPregunta(Inicio ventanaInicio, CrearPregunta ventanaPregunta) {
        this.ventanaInicio = ventanaInicio;
        this.ventanaCrearPregunta = ventanaPregunta;
        //vistaInicio
        ventanaInicio.bCrear.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ventanaInicio.bCrear) {
            ventanaInicio.setVisible(false);
            ventanaCrearPregunta.setVisible(true);
            
            
        }

    }

}
