/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import vista.Inicio;
import vista.Examen;
import vista.Resultado;
import vista.PreCuestionario;
import modelo.ConsultaCrearPregunta;
import modelo.ConsultaRespuesta;
import modelo.Respuesta;

/**
 *
 * @author Aaron
 */
public class ControladorPreCuestionario implements ActionListener {

    private Inicio ventanaInicio;
    private PreCuestionario ventanaPreCuestionario;
    private ConsultaCrearPregunta modeloCrearPregunta = new ConsultaCrearPregunta();
    private ConsultaRespuesta modeloConsultaRespuesta = new ConsultaRespuesta();
    private Examen vistaExamen;
    private Resultado vistaResultado;

    String asignatura = null;
    Respuesta preguntas[] = new Respuesta[10];
    
    ArrayList correctas = new ArrayList();
    ArrayList incorrectas = new ArrayList();

    public ControladorPreCuestionario(Inicio ventanaInicio, PreCuestionario ventanaPreCuestionario, Examen vistaExamen, Resultado vistaResultado) {
        this.ventanaInicio = ventanaInicio;
        this.ventanaPreCuestionario = ventanaPreCuestionario;
        this.vistaExamen = vistaExamen;
        this.vistaResultado = vistaResultado;

        ventanaPreCuestionario.menuprincipal.addActionListener(this);
        ventanaPreCuestionario.mostrartema.addActionListener(this);
        ventanaPreCuestionario.empezartest.addActionListener(this);
        vistaExamen.acabarTest.addActionListener(this);
        vistaResultado.jButton1.addActionListener(this);

        ventanaPreCuestionario.jtemas.setVisible(false);

        vistaExamen.setLocationRelativeTo(null);
        vistaResultado.setLocationRelativeTo(null);
    }
    
    public int obtenerRespuesta(JRadioButton respuestauno,JRadioButton respuestados,JRadioButton respuestatres,JRadioButton respuestacuatro){
        if(respuestauno.isSelected()){
            return 1;
        }else if(respuestados.isSelected()){
            return 2;
        }else if(respuestatres.isSelected()){
            return 3;
        }else if(respuestacuatro.isSelected()){
            return 4;
        } else {
            return 0;
        }
    }
    
    public String devolverRespuesta(Respuesta respuesta){
        int numeroCorrecto = respuesta.getRespuesta_correcta();
        if( 1 == numeroCorrecto ){
            return respuesta.getRespuesta_uno();
        } else if( 2 == numeroCorrecto ){
            return respuesta.getRespuesta_dos();
        } else if( 3 == numeroCorrecto ){
            return respuesta.getRespuesta_tres();
        } else if( 4 == numeroCorrecto ){
            return respuesta.getRespuesta_cuatro();
        } else {
            return "algo mal";
        }
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ventanaPreCuestionario.menuprincipal) {
            ventanaPreCuestionario.setVisible(false);
            ventanaInicio.setVisible(true);
        } else if (e.getSource() == vistaResultado.jButton1){                                                            
            vistaResultado.setVisible(false);           
            ventanaInicio.setVisible(true);
        
        } else if (e.getSource() == ventanaPreCuestionario.mostrartema) {

            if (ventanaPreCuestionario.jRadioButton1.isSelected()) {
                asignatura = ventanaPreCuestionario.jRadioButton1.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);

            } else if (ventanaPreCuestionario.jRadioButton2.isSelected()) {
                asignatura = ventanaPreCuestionario.jRadioButton2.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);

            } else if (ventanaPreCuestionario.jRadioButton3.isSelected()) {
                asignatura = ventanaPreCuestionario.jRadioButton3.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);

            } else if (ventanaPreCuestionario.jRadioButton4.isSelected()) {
                asignatura = ventanaPreCuestionario.jRadioButton4.getText();
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);

            } else if (ventanaPreCuestionario.jRadioButton5.isSelected()) {
                asignatura = "Entrono de desarrollo";
                ArrayList temas = modeloCrearPregunta.MostrarTemas(asignatura);
                System.out.println(temas);
                ventanaPreCuestionario.jtemas.removeAllItems();
                for (int i = 0; i < temas.size(); i++) {
                    int numero = i + 1;
                    ventanaPreCuestionario.jtemas.addItem((String) "Tema " + numero + ": " + temas.get(i));
                }
                ventanaPreCuestionario.jtemas.setVisible(true);

            }

        } else if (e.getSource() == ventanaPreCuestionario.empezartest) {
            if (ventanaPreCuestionario.jtemas.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "Selecione asignatura para poder ver los temas.");
            } else {

                
                //Respuesta preguntas[] = new Respuesta[10];
                for(int x = 0; x<10; x++){
                    preguntas[x] = new Respuesta();
                }
                String tema = (String) ventanaPreCuestionario.jtemas.getSelectedItem();
                
                modeloConsultaRespuesta.MostrarTemas(tema.substring(8), preguntas);
                
                // pruebas para reiniciar
                vistaExamen.pregunta1.clearSelection();
                vistaExamen.pregunta2.clearSelection();
                vistaExamen.pregunta3.clearSelection();
                vistaExamen.pregunta4.clearSelection();
                vistaExamen.pregunta5.clearSelection();
                vistaExamen.pregunta6.clearSelection();
                vistaExamen.pregunta7.clearSelection();
                vistaExamen.pregunta8.clearSelection();
                vistaExamen.pregunta9.clearSelection();
                vistaExamen.pregunta10.clearSelection();
                //fin pruebas
                
                vistaExamen.jLabel1.setText(preguntas[0].getPregunta());
                    vistaExamen.unoa.setText(preguntas[0].getRespuesta_uno());
                    vistaExamen.unob.setText(preguntas[0].getRespuesta_dos());
                    vistaExamen.unoc.setText(preguntas[0].getRespuesta_tres());
                    vistaExamen.unod.setText(preguntas[0].getRespuesta_cuatro());
                vistaExamen.jLabel2.setText(preguntas[1].getPregunta());
                    vistaExamen.dosa.setText(preguntas[1].getRespuesta_uno());
                    vistaExamen.dosb.setText(preguntas[1].getRespuesta_dos());
                    vistaExamen.dosc.setText(preguntas[1].getRespuesta_tres());
                    vistaExamen.dosd.setText(preguntas[1].getRespuesta_cuatro());
                vistaExamen.jLabel3.setText(preguntas[2].getPregunta());
                    vistaExamen.tresa.setText(preguntas[2].getRespuesta_uno());
                    vistaExamen.tresb.setText(preguntas[2].getRespuesta_dos());
                    vistaExamen.tresc.setText(preguntas[2].getRespuesta_tres());
                    vistaExamen.tresd.setText(preguntas[2].getRespuesta_cuatro());
                vistaExamen.jLabel4.setText(preguntas[3].getPregunta());
                    vistaExamen.cuatroa.setText(preguntas[3].getRespuesta_uno());
                    vistaExamen.cuatrob.setText(preguntas[3].getRespuesta_dos());
                    vistaExamen.cuatroc.setText(preguntas[3].getRespuesta_tres());
                    vistaExamen.cuatrod.setText(preguntas[3].getRespuesta_cuatro());
                vistaExamen.jLabel5.setText(preguntas[4].getPregunta());
                    vistaExamen.cincoa.setText(preguntas[4].getRespuesta_uno());
                    vistaExamen.cincob.setText(preguntas[4].getRespuesta_dos());
                    vistaExamen.cincoc.setText(preguntas[4].getRespuesta_tres());
                    vistaExamen.cincod.setText(preguntas[4].getRespuesta_cuatro());
                vistaExamen.jLabel6.setText(preguntas[5].getPregunta());
                    vistaExamen.seisa.setText(preguntas[5].getRespuesta_uno());
                    vistaExamen.seisb.setText(preguntas[5].getRespuesta_dos());
                    vistaExamen.seisc.setText(preguntas[5].getRespuesta_tres());
                    vistaExamen.seisd.setText(preguntas[5].getRespuesta_cuatro());
                vistaExamen.jLabel7.setText(preguntas[6].getPregunta());
                    vistaExamen.sietea.setText(preguntas[6].getRespuesta_uno());
                    vistaExamen.sieteb.setText(preguntas[6].getRespuesta_dos());
                    vistaExamen.sietec.setText(preguntas[6].getRespuesta_tres());
                    vistaExamen.sieted.setText(preguntas[6].getRespuesta_cuatro());
                vistaExamen.jLabel8.setText(preguntas[7].getPregunta());
                    vistaExamen.ochoa.setText(preguntas[7].getRespuesta_uno());
                    vistaExamen.ochob.setText(preguntas[7].getRespuesta_dos());
                    vistaExamen.ochoc.setText(preguntas[7].getRespuesta_tres());
                    vistaExamen.ochod.setText(preguntas[7].getRespuesta_cuatro());
                vistaExamen.jLabel9.setText(preguntas[8].getPregunta());
                    vistaExamen.nuevea.setText(preguntas[8].getRespuesta_uno());
                    vistaExamen.nueveb.setText(preguntas[8].getRespuesta_dos());
                    vistaExamen.nuevec.setText(preguntas[8].getRespuesta_tres());
                    vistaExamen.nueved.setText(preguntas[8].getRespuesta_cuatro());
                vistaExamen.jLabel10.setText(preguntas[9].getPregunta());
                    vistaExamen.dieza.setText(preguntas[9].getRespuesta_uno());
                    vistaExamen.diezb.setText(preguntas[9].getRespuesta_dos());
                    vistaExamen.diezc.setText(preguntas[9].getRespuesta_tres());
                    vistaExamen.diezd.setText(preguntas[9].getRespuesta_cuatro());
                
                
                
                //System.out.println(asignatura);
                //System.out.println(tema);
                vistaExamen.tema.setText(tema);
                vistaExamen.asignatura.setText(asignatura);
                ventanaPreCuestionario.setVisible(false);
                vistaExamen.setVisible(true);
            }
        } else if (e.getSource() == vistaExamen.acabarTest) {
            //System.out.println(vistaExamen.unoa.isSelected());
            int resultadoUno = obtenerRespuesta(vistaExamen.unoa,vistaExamen.unob,vistaExamen.unoc,vistaExamen.unod);
            int resultadoDos = obtenerRespuesta(vistaExamen.dosa,vistaExamen.dosb,vistaExamen.dosc,vistaExamen.dosd);
            int resultadoTres = obtenerRespuesta(vistaExamen.tresa,vistaExamen.tresb,vistaExamen.tresc,vistaExamen.tresd);
            int resultadoCuatro = obtenerRespuesta(vistaExamen.cuatroa,vistaExamen.cuatrob,vistaExamen.cuatroc,vistaExamen.cuatrod);
            int resultadoCinco = obtenerRespuesta(vistaExamen.cincoa,vistaExamen.cincob,vistaExamen.cincoc,vistaExamen.cincod);
            int resultadoSeis = obtenerRespuesta(vistaExamen.seisa,vistaExamen.seisb,vistaExamen.seisc,vistaExamen.seisd);
            int resultadoSiete = obtenerRespuesta(vistaExamen.sietea,vistaExamen.sieteb,vistaExamen.sietec,vistaExamen.sieted);
            int resultadoOcho = obtenerRespuesta(vistaExamen.ochoa,vistaExamen.ochob,vistaExamen.ochoc,vistaExamen.ochod);
            int resultadoNueve = obtenerRespuesta(vistaExamen.nuevea,vistaExamen.nueveb,vistaExamen.nuevec,vistaExamen.nueved);
            int resultadoDiez = obtenerRespuesta(vistaExamen.dieza,vistaExamen.diezb,vistaExamen.diezc,vistaExamen.diezd);
            
            if(resultadoUno == 0 || resultadoDos == 0 || resultadoTres == 0 || resultadoCuatro == 0 || resultadoCinco == 0 || resultadoSeis == 0 || resultadoSiete == 0 || resultadoOcho == 0 || resultadoNueve == 0 || resultadoDiez == 0 )
            {
                JOptionPane.showMessageDialog(null, "faltan preguntas por responder.");
            } else {
                //limpiar arrays pruebas
                correctas.clear();
                incorrectas.clear();
                //fin
                    if(preguntas[0].getRespuesta_correcta() == resultadoUno){
                        correctas.add(preguntas[0]);
                    } else {
                        incorrectas.add(preguntas[0]);
                    }   
                    
                    if(preguntas[1].getRespuesta_correcta() == resultadoDos){
                        correctas.add(preguntas[1]);
                    } else {
                        incorrectas.add(preguntas[1]);
                    }
                    
                    if(preguntas[2].getRespuesta_correcta() == resultadoTres){
                        correctas.add(preguntas[2]);
                    } else {
                        incorrectas.add(preguntas[2]);
                    }
                    
                    if(preguntas[3].getRespuesta_correcta() == resultadoCuatro){
                        correctas.add(preguntas[3]);
                    } else {
                        incorrectas.add(preguntas[3]);
                    }
                    
                    if(preguntas[4].getRespuesta_correcta() == resultadoCinco){
                        correctas.add(preguntas[4]);
                    } else {
                        incorrectas.add(preguntas[4]);
                    }
                    
                    if(preguntas[5].getRespuesta_correcta() == resultadoSeis){
                        correctas.add(preguntas[5]);
                    } else {
                        incorrectas.add(preguntas[5]);
                    }
                    
                    if(preguntas[6].getRespuesta_correcta() == resultadoSiete){
                        correctas.add(preguntas[6]);
                    } else {
                        incorrectas.add(preguntas[6]);
                    }
                    
                    if(preguntas[7].getRespuesta_correcta() == resultadoOcho){
                        correctas.add(preguntas[7]);
                    } else {
                        incorrectas.add(preguntas[7]);
                    }
                    
                    if(preguntas[8].getRespuesta_correcta() == resultadoNueve){
                        correctas.add(preguntas[8]);
                    } else {
                        incorrectas.add(preguntas[8]);
                    }
                    
                    if(preguntas[9].getRespuesta_correcta() == resultadoDiez){
                        correctas.add(preguntas[9]);
                    } else {
                        incorrectas.add(preguntas[9]);
                    }
                    
                    DefaultListModel modeloCorrecto = new DefaultListModel();
                    DefaultListModel modeloIncorrecto = new DefaultListModel();
                    vistaResultado.jLabel2.setText("Respuestas correctas: " + correctas.size());                                        
                    for(int x = 0; x < correctas.size();x++){
                    Respuesta resultadoContenido = (Respuesta) correctas.get(x);
                    String mostrarRespuesta = devolverRespuesta(resultadoContenido);
                    modeloCorrecto.addElement(resultadoContenido.getPregunta() + ": " + mostrarRespuesta );
                    }                    
                    vistaResultado.jList1.setModel(modeloCorrecto);
                                                            
                    vistaResultado.jLabel3.setText("Respuestas incorrectas: " + incorrectas.size());
                    for(int x = 0; x < incorrectas.size();x++){
                    Respuesta resultadoContenido = (Respuesta) incorrectas.get(x);
                    String mostrarRespuesta = devolverRespuesta(resultadoContenido);
                    modeloIncorrecto.addElement(resultadoContenido.getPregunta() + ": " + mostrarRespuesta );
                    }                    
                    vistaResultado.jList2.setModel(modeloIncorrecto);
                    
                    vistaResultado.jLabel5.setText(vistaExamen.tema.getText());
                    vistaResultado.jLabel4.setText(vistaExamen.asignatura.getText());
                    vistaExamen.setVisible(false);
                    vistaResultado.setVisible(true);
                    
            }
            
        }

    }

}
