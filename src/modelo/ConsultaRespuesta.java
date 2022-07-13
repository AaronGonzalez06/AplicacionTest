/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Aaron
 */
public class ConsultaRespuesta extends Conexion {
    
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean MostrarTemas(String tema, Respuesta respuestas[]) {
        Connection conexion = getConnection();

        try {
            conexion = getConnection();
            int con = 0;
            int sumador = 0;
            ps = conexion.prepareStatement("select pre.pregunta , respuesta_uno, respuesta_dos ,respuesta_tres, respuesta_cuatro, respuesta_correcta"
                    + " from tema tem inner join respuesta res on res.id_nombreTema = tem.nombreTema "
                    + "inner join pregunta pre on pre.id_pregunta = res.id_pregunta where tem.nombreTema = ?;");
            ps.setString(1,tema);
            rs = ps.executeQuery();
            
            while(rs.next()){                
                
                respuestas[sumador].setPregunta(rs.getString("pregunta"));
                respuestas[sumador].setRespuesta_uno(rs.getString("respuesta_uno"));
                respuestas[sumador].setRespuesta_dos(rs.getString("respuesta_dos"));
                respuestas[sumador].setRespuesta_tres(rs.getString("respuesta_tres"));
                respuestas[sumador].setRespuesta_cuatro(rs.getString("respuesta_cuatro"));
                respuestas[sumador].setRespuesta_correcta(rs.getInt("respuesta_correcta"));
                
                //System.out.println(rs.getString("nombreTema"));
                
                con = 1;
                sumador++;
            }
            if (con == 1){
                return true;
            }else{
                return false;                
            }
                
            
            

        } catch (Exception ex) {
            System.out.println("error desde el modelo: " + ex);
            return false;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.out.println("error desde el modelo: " + ex);
            }
        }
    }
    
    public int numeroPreguntas(String tema) {
        Connection conexion = getConnection();

        try {
            conexion = getConnection();
            int con = 0;
            int resultado = 0;
            ps = conexion.prepareStatement("select count(*) as numeroPreguntas "
                    + "from tema tem inner join respuesta res on res.id_nombreTema = tem.nombreTema "
                    + "inner join pregunta pre on pre.id_pregunta = res.id_pregunta "
                    + "where tem.nombreTema = ?;");
            ps.setString(1,tema);
            rs = ps.executeQuery();
            
            if (rs.next()){
                resultado = rs.getInt("numeroPreguntas");
                return resultado;
            }else{
                return 0;                
            }
                
            
            

        } catch (Exception ex) {
            System.out.println("error desde el modelo: " + ex);
            return 0;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.out.println("error desde el modelo: " + ex);
            }
        }
    }
    
}
