/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class ConsultaCrearPregunta extends Conexion {
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    public ArrayList MostrarTemas(String tema) {
        Connection conexion = getConnection();
        ArrayList<String> temas = new ArrayList<String>();


        try {
            conexion = getConnection();
            int con = 0;
            int sumador = 0;
            ps = conexion.prepareStatement("select tem.nombreTema from tema tem inner join asignatura asi on asi.nombre = tem.nombre_asignatura where asi.nombre = ?;");
            ps.setString(1,tema);
            rs = ps.executeQuery();
            
            while(rs.next()){                
                /*empleado.setCodigo(rs.getInt("codigo"));
                empleado.setTelefono(rs.getInt("telefono"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setPuesto(rs.getString("puesto"));
                empleado.setDireccion(rs.getString("direccion"));*/
                temas.add(rs.getString("nombreTema"));
                con = 1;
                sumador++;
            }
            if (con == 1){
                return temas;
            }else{
                return temas;                
            }
        } catch (Exception ex) {
            System.out.println("error desde el modelo: " + ex);
            return temas;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.out.println("error desde el modelo: " + ex);
            }
        }
    }  
    
        public boolean insertarPregunta(String pregunta) {
        Connection conexion = getConnection();
        System.out.println("estado de la conexion: " + conexion);

        try {
            System.out.println("entro en el try");
            ps = conexion.prepareStatement("insert into pregunta (pregunta) values  (?);");
            ps.setString(1, pregunta);
            int resultado = ps.executeUpdate();            
            if (resultado > 0) {
                return true;
            } else {
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
        
        public int mostrarIdpregunta(String pregunta) {
        Connection conexion = getConnection();
        int id = 0;


        try {
            conexion = getConnection();
            int con = 0;
            int sumador = 0;
            ps = conexion.prepareStatement("select id_pregunta from pregunta where pregunta = ?;");
            ps.setString(1,pregunta);
            rs = ps.executeQuery();
            
            while(rs.next()){                                
               id =  rs.getInt("id_pregunta");                
            }
            if (con == 1){
                return id;
            }else{
                return id;                
            }
        } catch (Exception ex) {
            System.out.println("error desde el modelo: " + ex);
            return id;
        } finally {
            try {
                conexion.close();
            } catch (Exception ex) {
                System.out.println("error desde el modelo: " + ex);
            }
        }
    } 
        
        public boolean insertarRespuesta(String tema,int id_pregunta, String respuesta1, String respuesta2, String respuesta3, String respuesta4, String numeroPreguntaCorrecta) {
        Connection conexion = getConnection();
        try {
            System.out.println("entro en el try");
            ps = conexion.prepareStatement("insert into respuesta "
                    + "(id_nombreTema,id_pregunta,respuesta_correcta,respuesta_uno,respuesta_dos,respuesta_tres,respuesta_cuatro) values (?,?,?,?,?,?,?);");
            ps.setString(1, tema);
            ps.setInt(2, id_pregunta);
            ps.setString(3, numeroPreguntaCorrecta);
            ps.setString(4, respuesta1);
            ps.setString(5, respuesta2);
            ps.setString(6, respuesta3);
            ps.setString(7, respuesta4);
            int resultado = ps.executeUpdate();            
            if (resultado > 0) {
                return true;
            } else {
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
}
