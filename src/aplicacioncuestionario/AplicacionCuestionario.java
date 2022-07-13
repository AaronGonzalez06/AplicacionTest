/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacioncuestionario;

import controlador.ControladorBasico;
import controlador.ControladorCrearPregunta;
import vista.Inicio;
import vista.Temas;
import vista.CrearPregunta;

/**
 *
 * @author Aaron
 */
public class AplicacionCuestionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Inicio VistaInicio = new Inicio();
        Temas VistaTemas = new Temas();
        CrearPregunta VistaPregunta = new CrearPregunta();
        
        ControladorBasico Basico = new ControladorBasico(VistaInicio,VistaTemas);
        ControladorCrearPregunta crearPregunta =  new ControladorCrearPregunta(VistaInicio,VistaPregunta);
        Basico.iniciar();
        VistaInicio.setVisible(true);
    }
    
}
