/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg23.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadg23.entidades.Materia;

/**
 *
 * @author jonac
 */
public class MateriaData {

    private Connection con = null;

    public MateriaData() {
        con = Conexion.conectarServidor();
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre,año,estado) "
                + "VALUES (?,?,?)";

        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
//                 materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia agregada exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
    }
    
    public Materia buscarMateriaId (int idMat){
                Materia materia = null;

        String sql = "SELECT nombre,año "
                + "FROM materia WHERE idMateria=" + idMat + " AND estado=1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setNombre(rs.getString("nombre"));
                materia.setEstado(true);
                materia.setIdMateria(idMat);
                materia.setAnio(rs.getInt("año"));

            } else {
                JOptionPane.showMessageDialog(null, "La materia no fue encontrada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
        return materia;
    }

    public List <Materia> listarMaterias (){
        ArrayList <Materia> listadoMateria = new ArrayList <>();
        
                String sql = "SELECT * FROM materia WHERE estado=1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                listadoMateria.add(new Materia(rs.getInt("idMateria"),rs.getString("nombre"), rs.getInt("año"), true));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
        return listadoMateria;
    }
    
    
    public void modificarMateria (Materia materia){
                String sql = "UPDATE materia SET nombre=?,año=? WHERE idMateria=" + materia.getIdMateria();

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            if (ps.executeUpdate() == 1) {

                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Materia no encontrada");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
    }
    
    public void eliminarMateria(int idMat){
                String sql = "UPDATE materia SET estado=0 WHERE idMateria=" + idMat;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            
            if (ps.executeUpdate() == 1) {

                JOptionPane.showMessageDialog(null, "Materia borrada");
            } else {
                 JOptionPane.showMessageDialog(null, "Materia Inexistente");
             }    

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
    }
            
    
}
