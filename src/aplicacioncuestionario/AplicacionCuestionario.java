/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacioncuestionario;

import controlador.ControladorBasico;
import controlador.ControladorCrearPregunta;
import controlador.ControladorPreCuestionario;
import vista.Inicio;
import vista.Temas;
import vista.CrearPregunta;
import vista.PreCuestionario;
import vista.Examen;
import vista.Resultado;

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
        Examen VistaExamen = new Examen();
        Resultado VistaResultado = new Resultado();
        CrearPregunta VistaPregunta = new CrearPregunta();
        PreCuestionario VistaPreCuestionario = new PreCuestionario();
        
        
        ControladorBasico Basico = new ControladorBasico(VistaInicio,VistaTemas,VistaPreCuestionario);
        ControladorCrearPregunta crearPregunta =  new ControladorCrearPregunta(VistaInicio,VistaPregunta);
        ControladorPreCuestionario Precuestionario = new ControladorPreCuestionario(VistaInicio,VistaPreCuestionario,VistaExamen,VistaResultado);
        Basico.iniciar();
        VistaInicio.setVisible(true);
    }
    
}
