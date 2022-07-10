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
    private Tema tema = new Tema();
    private ConsultaTemas modeloConsultasTemas = new ConsultaTemas();       

    public ControladorBasico(Inicio ventanaInicio, Temas ventanaTemas) {
        this.ventanaInicio = ventanaInicio;
        this.ventanaTemas = ventanaTemas;
        
        ventanaInicio.BTemas.addActionListener(this);
        ventanaTemas.BVolver.addActionListener(this);
        ventanaTemas.BProgramacion.addActionListener(this);
    }
    
    public void iniciar(){
        ventanaInicio.setTitle("Aplicación cuestionarios.");
        ventanaInicio.setLocationRelativeTo(null);     
        ventanaTemas.setLocationRelativeTo(null);   
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == ventanaInicio.BTemas){
            System.out.println("aaaaa");
            ventanaInicio.setVisible(false);
            ventanaTemas.setVisible(true);
            
        
        } else if (e.getSource() == ventanaTemas.BVolver){
            ventanaInicio.setVisible(true);
            ventanaTemas.setVisible(false);
        
        
        } else if (e.getSource() == ventanaTemas.BProgramacion){
            tema.setNombre_asignatura(ventanaTemas.BProgramacion.getText());
           if(modeloConsultasTemas.MostrarTemas(tema)){
            /*vista.Nombre.setText(empleado.getNombre());
            vista.direccion.setText(empleado.getDireccion());
            vista.puesto.setText(empleado.getPuesto());
            vista.codigo.setText(String.valueOf(empleado.getCodigo()));
            vista.telefono.setText(String.valueOf(empleado.getTelefono()));*/
            //JOptionPane.showMessageDialog(null, "hay datos");  
            DefaultListModel deflist= new DefaultListModel();
            deflist.addElement(tema.getNombreTema());
            ventanaTemas.ListaTemas.setModel(deflist);            
            System.out.println(tema.getNombreTema());
            } else {
            JOptionPane.showMessageDialog(null, "No hay tema de esta asignatura");            
            }
        }
        
    }
    
}