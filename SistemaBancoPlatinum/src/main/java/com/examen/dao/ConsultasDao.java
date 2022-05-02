package com.examen.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.examen.conexion.Conexion;

public class ConsultasDao extends Conexion{
	public boolean autenticacion(String usuario, String password){
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "select * from usuario where usuario=? and password=?";
            pst = getConexion().prepareStatement(consulta); 
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return true;
                
            }
        } catch (Exception e) {
            System.err.println("Error" + e);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
                if(rs != null) rs.close();
            } catch (Exception e) {
                System.err.println("Error" + e);
            }
            
        }
        return false;
    }
    
    public boolean crearUsuario(String nombre, String usuario, String password){
        PreparedStatement pst = null;
        try {
            String consulta = "insert into usuario (nombre, usuario, password) values(?,?,?)";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, usuario);
            pst.setString(3, password);
            
            if(pst.executeUpdate()== 1){
                return true;
            }
        } catch (Exception e) {
            System.out.println(e);
        }finally{
            try {
                if(getConexion() != null) getConexion().close();
                if(pst != null) pst.close();
            } catch (Exception e) {
                System.out.println("Error"+ e);
            }
        }
        return false;
    }
    
    public static void main(String [] args) {
    	ConsultasDao a = new ConsultasDao();
    	System.out.println(a.crearUsuario("Sergio Figueroa Toloza","Serfit", "12345"));
    }
}
