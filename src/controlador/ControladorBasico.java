/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.ConsultaTemas;
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
    
    private Tema temas[] = new Tema[2];        

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
        
        
    }
    
    public void iniciar(){
        ventanaInicio.setTitle("Aplicación cuestionarios.");
        ventanaInicio.setLocationRelativeTo(null);     
        ventanaTemas.setLocationRelativeTo(null);   
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        temas[0] = new Tema();
        temas[1] = new Tema();
        DefaultListModel deflist= new DefaultListModel();
        int sumador = 1;
        
        if(e.getSource() == ventanaInicio.BTemas){
            System.out.println("aaaaa");
            ventanaInicio.setVisible(false);
            ventanaTemas.setVisible(true);
            
        
        } else if (e.getSource() == ventanaTemas.BVolver){
            ventanaInicio.setVisible(true);
            ventanaTemas.setVisible(false);
        
        
        } else if (e.getSource() == ventanaTemas.BProgramacion){                                    
            temas[0].setNombre_asignatura(ventanaTemas.BProgramacion.getText());
            temas[1].setNombre_asignatura(ventanaTemas.BProgramacion.getText());
           if(modeloConsultasTemas.MostrarTemas(temas)){             
            
            for(int x = 0 ; x < 2; x++){
            deflist.addElement("Tema " +sumador +": " + temas[x].getNombreTema());   
            //System.out.println(temas[x].getNombreTema());  
            sumador++;
            }
            ventanaTemas.ListaTemas.setModel(deflist);            
                      
            } else {
            JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");            
            }
        } else if (e.getSource() == ventanaTemas.BSistemas){
            //tema.setNombre_asignatura("Sistemas informaticos");
            temas[0].setNombre_asignatura("Sistemas informaticos");
            temas[1].setNombre_asignatura("Sistemas informaticos");
           if(modeloConsultasTemas.MostrarTemas(temas)){
            for(int x = 0 ; x < 2; x++){
            deflist.addElement("Tema " +sumador +": " + temas[x].getNombreTema());   
            //System.out.println(temas[x].getNombreTema());  
            sumador++;
            }
            ventanaTemas.ListaTemas.setModel(deflist);
            } else {
            JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");            
            }
        } else if (e.getSource() == ventanaTemas.BLenguaje){
            //tema.setNombre_asignatura("Sistemas informaticos");
            temas[0].setNombre_asignatura(ventanaTemas.BLenguaje.getText());
            temas[1].setNombre_asignatura(ventanaTemas.BLenguaje.getText());
           if(modeloConsultasTemas.MostrarTemas(temas)){
            for(int x = 0 ; x < 2; x++){
            deflist.addElement("Tema " +sumador +": " + temas[x].getNombreTema());   
            //System.out.println(temas[x].getNombreTema());  
            sumador++;
            }
            ventanaTemas.ListaTemas.setModel(deflist);
            } else {
            JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");            
            }
        } else if (e.getSource() == ventanaTemas.BBDatos){
            //tema.setNombre_asignatura("Sistemas informaticos");
            temas[0].setNombre_asignatura(ventanaTemas.BBDatos.getText());
            temas[1].setNombre_asignatura(ventanaTemas.BBDatos.getText());
           if(modeloConsultasTemas.MostrarTemas(temas)){
            for(int x = 0 ; x < 2; x++){
            deflist.addElement("Tema " +sumador +": " + temas[x].getNombreTema());   
            //System.out.println(temas[x].getNombreTema());  
            sumador++;
            }
            ventanaTemas.ListaTemas.setModel(deflist);
            } else {
            JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");            
            }
        } else if (e.getSource() == ventanaTemas.BEntorno){
            //tema.setNombre_asignatura("Sistemas informaticos");
            temas[0].setNombre_asignatura("entrono de desarrollo");
            temas[1].setNombre_asignatura("entrono de desarrollo");
           if(modeloConsultasTemas.MostrarTemas(temas)){
            for(int x = 0 ; x < 2; x++){
            deflist.addElement("Tema " +sumador +": " + temas[x].getNombreTema());   
            //System.out.println(temas[x].getNombreTema());  
            sumador++;
            }
            ventanaTemas.ListaTemas.setModel(deflist);
            } else {
            JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");            
            }
        }
        
    }
    
}
