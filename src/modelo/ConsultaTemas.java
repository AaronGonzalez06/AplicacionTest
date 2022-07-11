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
public class ConsultaTemas extends Conexion {
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    public boolean MostrarTemas(Tema tema) {
        Connection conexion = getConnection();

        try {
            conexion = getConnection();
            int con = 0;
            //int sumador = 0;
            ps = conexion.prepareStatement("select tem.nombreTema from tema tem inner join asignatura asi on asi.nombre = tem.nombre_asignatura where asi.nombre = ?;");
            ps.setString(1,tema.getNombre_asignatura());
            rs = ps.executeQuery();
            
            while(rs.next()){                
                /*empleado.setCodigo(rs.getInt("codigo"));
                empleado.setTelefono(rs.getInt("telefono"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setPuesto(rs.getString("puesto"));
                empleado.setDireccion(rs.getString("direccion"));*/
                tema.setNombreTema(rs.getString("nombreTema"));
                
                System.out.println(rs.getString("nombreTema"));
                
                con = 1;
                //sumador++;
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
    
}
