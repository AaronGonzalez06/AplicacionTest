/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import modelo.ConsultaRespuesta;
import modelo.ConsultaTemas;
import modelo.Respuesta;
import modelo.Tema;
import vista.Inicio;
import vista.Temas;

/**
 *
 * @author Aaron
 */
public class ControladorBasico implements ActionListener {

    private Inicio ventanaInicio;
    private Temas ventanaTemas;
    //private Tema tema = new Tema();
    private ConsultaTemas modeloConsultasTemas = new ConsultaTemas();
    private ConsultaRespuesta modeloConsultasRespuesta = new ConsultaRespuesta();

    private Tema temas[] = new Tema[2];
    //private Respuesta respuestas[] = new Respuesta[2];

    public ControladorBasico(Inicio ventanaInicio, Temas ventanaTemas) {
        this.ventanaInicio = ventanaInicio;
        this.ventanaTemas = ventanaTemas;

        //vistaInicio
        ventanaInicio.BTemas.addActionListener(this);

        //vistaTemas
        ventanaTemas.BVolver.addActionListener(this);
        ventanaTemas.BProgramacion.addActionListener(this);
        ventanaTemas.BSistemas.addActionListener(this);
        ventanaTemas.BLenguaje.addActionListener(this);
        ventanaTemas.BBDatos.addActionListener(this);
        ventanaTemas.BEntorno.addActionListener(this);
        ventanaTemas.BPregunta.addActionListener(this);
        ventanaTemas.BCorrecto.addActionListener(this);

    }

    public void iniciar() {
        ventanaInicio.setTitle("Aplicación cuestionarios.");
        ventanaInicio.setLocationRelativeTo(null);
        ventanaTemas.setLocationRelativeTo(null);
        ventanaTemas.ListaTemas.setVisible(false);
        ventanaTemas.BPregunta.setVisible(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        temas[0] = new Tema();
        temas[1] = new Tema();
        DefaultListModel deflist = new DefaultListModel();
        int sumador = 1;

        if (e.getSource() == ventanaInicio.BTemas) {
            System.out.println("aaaaa");
            ventanaInicio.setVisible(false);
            ventanaTemas.setVisible(true);

        } else if (e.getSource() == ventanaTemas.BVolver) {
            ventanaInicio.setVisible(true);
            ventanaTemas.setVisible(false);

        } else if (e.getSource() == ventanaTemas.BProgramacion) {
            ventanaTemas.ListaTemas.setVisible(true);
            ventanaTemas.BPregunta.setVisible(true);
            temas[0].setNombre_asignatura(ventanaTemas.BProgramacion.getText());
            temas[1].setNombre_asignatura(ventanaTemas.BProgramacion.getText());
            if (modeloConsultasTemas.MostrarTemas(temas)) {

                for (int x = 0; x < 2; x++) {
                    deflist.addElement("Tema " + sumador + ": " + temas[x].getNombreTema());
                    //System.out.println(temas[x].getNombreTema());  
                    sumador++;
                }
                ventanaTemas.ListaTemas.setModel(deflist);

            } else {
                JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");
            }
        } else if (e.getSource() == ventanaTemas.BSistemas) {
            ventanaTemas.ListaTemas.setVisible(true);
            ventanaTemas.BPregunta.setVisible(true);
            temas[0].setNombre_asignatura("Sistemas informaticos");
            temas[1].setNombre_asignatura("Sistemas informaticos");
            if (modeloConsultasTemas.MostrarTemas(temas)) {
                for (int x = 0; x < 2; x++) {
                    deflist.addElement("Tema " + sumador + ": " + temas[x].getNombreTema());
                    //System.out.println(temas[x].getNombreTema());  
                    sumador++;
                }
                ventanaTemas.ListaTemas.setModel(deflist);
            } else {
                JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");
            }
        } else if (e.getSource() == ventanaTemas.BLenguaje) {
            ventanaTemas.ListaTemas.setVisible(true);
            ventanaTemas.BPregunta.setVisible(true);
            temas[0].setNombre_asignatura(ventanaTemas.BLenguaje.getText());
            temas[1].setNombre_asignatura(ventanaTemas.BLenguaje.getText());
            if (modeloConsultasTemas.MostrarTemas(temas)) {
                for (int x = 0; x < 2; x++) {
                    deflist.addElement("Tema " + sumador + ": " + temas[x].getNombreTema());
                    //System.out.println(temas[x].getNombreTema());  
                    sumador++;
                }
                ventanaTemas.ListaTemas.setModel(deflist);
            } else {
                JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");
            }
        } else if (e.getSource() == ventanaTemas.BBDatos) {
            ventanaTemas.ListaTemas.setVisible(true);
            ventanaTemas.BPregunta.setVisible(true);
            temas[0].setNombre_asignatura(ventanaTemas.BBDatos.getText());
            temas[1].setNombre_asignatura(ventanaTemas.BBDatos.getText());
            if (modeloConsultasTemas.MostrarTemas(temas)) {
                for (int x = 0; x < 2; x++) {
                    deflist.addElement("Tema " + sumador + ": " + temas[x].getNombreTema());
                    //System.out.println(temas[x].getNombreTema());  
                    sumador++;
                }
                ventanaTemas.ListaTemas.setModel(deflist);
            } else {
                JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");
            }
        } else if (e.getSource() == ventanaTemas.BEntorno) {
            ventanaTemas.ListaTemas.setVisible(true);
            ventanaTemas.BPregunta.setVisible(true);
            temas[0].setNombre_asignatura("entrono de desarrollo");
            temas[1].setNombre_asignatura("entrono de desarrollo");
            if (modeloConsultasTemas.MostrarTemas(temas)) {
                for (int x = 0; x < 2; x++) {
                    deflist.addElement("Tema " + sumador + ": " + temas[x].getNombreTema());
                    //System.out.println(temas[x].getNombreTema());  
                    sumador++;
                }
                ventanaTemas.ListaTemas.setModel(deflist);
            } else {
                JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");
            }
        } else if (e.getSource() == ventanaTemas.BPregunta) {
            String tema = ventanaTemas.ListaTemas.getSelectedValue();
            //System.out.println(" la seleccion: " + ventanaTemas.ListaTemas.getSelectedValue());                

            if (tema == null) {
                JOptionPane.showMessageDialog(null, "Selecione el tema para ver las preguntas, gracias.");
            } else {

                String temaSeleccionado = ventanaTemas.ListaTemas.getSelectedValue().substring(8);
                //System.out.println(temaSeleccionado); 

                int numeroPreguntas = modeloConsultasRespuesta.numeroPreguntas(temaSeleccionado);
                System.out.println(numeroPreguntas);

                if (numeroPreguntas > 0) {
                    Respuesta respuestas[] = new Respuesta[numeroPreguntas];
                    for (int x = 0; x < numeroPreguntas; x++) {
                        respuestas[x] = new Respuesta();
                    }

                    if (modeloConsultasRespuesta.MostrarTemas(temaSeleccionado, respuestas)) {
                        DefaultTableModel modelo = (DefaultTableModel) ventanaTemas.tablaRespuesta.getModel();

                        if (modelo.getRowCount() > 0) {
                            for (int q = modelo.getRowCount() - 1; q > -1; q--) {
                                modelo.removeRow(q);
                            }
                        }

                        for (int y = 0; y < respuestas.length; y++) {
                            modelo.addRow(new Object[]{respuestas[y].getPregunta(), respuestas[y].getRespuesta_uno(),
                                respuestas[y].getRespuesta_dos(), respuestas[y].getRespuesta_tres(), respuestas[y].getRespuesta_cuatro(),respuestas[y].getRespuesta_correcta()});
                        }

                        for (int i = 0; i < ventanaTemas.tablaRespuesta.getRowCount(); i++) {
                            System.out.println("Pregunta: " + i);
                            System.out.println("Pregunta: " + ventanaTemas.tablaRespuesta.getValueAt(i, 0));
                            System.out.println("respuesta 2: " + ventanaTemas.tablaRespuesta.getValueAt(i, 1));
                            System.out.println("respuesta 3: " + ventanaTemas.tablaRespuesta.getValueAt(i, 2));
                            System.out.println("respuesta 4: " + ventanaTemas.tablaRespuesta.getValueAt(i, 3));
                            System.out.println("correcta: " + ventanaTemas.tablaRespuesta.getValueAt(i, 4));
                        }
                        //ventanaTemas.tablaRespuesta;

                    } else {
                        JOptionPane.showMessageDialog(null, "No hay preguntas del tema");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No hay preguntas del tema");
                }
            }
        } else if (e.getSource() == ventanaTemas.BCorrecto) {
            int fila = ventanaTemas.tablaRespuesta.getSelectedRow();
            int NRespuesta = (int) ventanaTemas.tablaRespuesta.getValueAt(fila, 5);
            String respuesCorrecta = (String) ventanaTemas.tablaRespuesta.getValueAt(fila, NRespuesta);

            JOptionPane.showMessageDialog(null, "La respuesta correcta es: " + respuesCorrecta);
        }

    }

}
