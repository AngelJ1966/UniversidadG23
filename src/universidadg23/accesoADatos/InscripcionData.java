package universidadg23.accesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadg23.entidades.Alumno;
import universidadg23.entidades.Inscripcion;
import universidadg23.entidades.Materia;

public class InscripcionData {
    private Connection con;
    private MateriaData materiaData;
    private AlumnoData alumnoData;
    
    public InscripcionData(){
        con = Conexion.conectarServidor();
        materiaData = new MateriaData();
        alumnoData = new AlumnoData();
    }
    
    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        try(PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()) {
//               insc.setIdInscripcion(rs.getInt("idInscripcion"));
               JOptionPane.showMessageDialog(null, "Inscripcion guardada exitosamente.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible acceder a la columna Inscripcion" + e.getMessage());
        }
    }
    
    public List<Inscripcion> listarInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                inscripciones.add(new Inscripcion(rs.getInt("idInscripcion"),alumnoData.buscarAlumnoPorId(rs.getInt("idAlumno")),
                        materiaData.buscarMateriaId(rs.getInt("idMateria")), rs.getDouble("nota")));
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible acceder a la columna Inscripcion" + e.getMessage());
        }
         return inscripciones;
    }
    
    public List<Inscripcion> listarInscripcionesPorAlumno(int idAlum) {
        List<Inscripcion> inscripcionesPorAlum = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = " + idAlum;
         try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                inscripcionesPorAlum.add(new Inscripcion(rs.getInt("idInscripcion"),alumnoData.buscarAlumnoPorId(idAlum),
                        materiaData.buscarMateriaId(rs.getInt("idMateria")), rs.getDouble("nota")));
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible acceder a la columna Inscripcion" + e.getMessage());
        }
         return inscripcionesPorAlum;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlum) {
        List<Materia> materiasCursadas = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON (materia.idMateria=inscripcion.idMateria) "
                + "WHERE inscripcion.idAlumno = " + idAlum;
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                materiasCursadas.add(new Materia(rs.getInt("idMateria"), rs.getString("nombre"),
                        rs.getInt("año"), true));
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible acceder a la columna Inscripcion" + e.getMessage());
        }
        return materiasCursadas;
    }
    
     public List<Materia> obtenerMateriasNoCursadas(int idAlum) {
        List<Materia> materiasCursadas = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion JOIN materia ON (materia.idMateria!=inscripcion.idMateria) "
                + "WHERE inscripcion.idAlumno != " + idAlum;
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                materiasCursadas.add(new Materia(rs.getInt("inscripcion.idMateria"), rs.getString("nombre"),
                        rs.getInt("año"), true));
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible acceder a la columna Inscripcion" + e.getMessage());
        }
        return materiasCursadas;
    }
     
     public List<Alumno> obtenerAlumnosXMateria(int idMat) {
         List<Alumno> alumXMaterias = new ArrayList<>();
        String sql = "SELECT inscripcion.idAlumno, dni, apellido, nombre, fechaNacimiento FROM inscripcion, alumno WHERE "
                + "inscripcion.idAlumno = alumno.idAlumno AND inscripcion.idMateria = " + idMat;
        try(PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                alumXMaterias.add(new Alumno(rs.getInt("inscripcion.idAlumno"), rs.getInt("dni"), 
                        rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate(), true));
            }
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "No fue posible acceder a la columna Inscripcion" + e.getMessage());
        }
        return alumXMaterias;
     }
     
     public void borrarInscripcionMateriaAlumno(int idAlum, int idMat) {
         String sql = "DELETE FROM inscripcion WHERE inscripcion.idAlumno = " + idAlum + " AND inscripcion.idMateria = "
                 + idMat;
         try(PreparedStatement ps = con.prepareStatement(sql)) {
             if(ps.executeUpdate() == 1) {
                 JOptionPane.showMessageDialog(null, "Borrado exitoso");
             } else {
                 JOptionPane.showMessageDialog(null, "Inscripcion Inexistente");
             }    
         } catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "No fue posible acceder a la columna Inscripcion" + e.getMessage());
         }
     }
     
     public void actualizarNota(int idAlum, int idMat, double nota) {
         String sql = "UPDATE inscripcion SET nota = ? WHERE idMateria = ? AND idAlumno = ?";
         try(PreparedStatement ps = con.prepareStatement(sql)) {
             ps.setDouble(1, nota);
             ps.setInt(2, idMat);
             ps.setInt(3, idAlum);
             if (ps.executeUpdate()==1) JOptionPane.showMessageDialog(null, "Nota actualizada correctamente");
         } catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "No fue posible acceder a la columna Inscripcion" + e.getMessage());
         }
     }
}
