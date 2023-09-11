package universidadg23.accesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadg23.entidades.Alumno;

public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.conectarServidor();

    }

    public void guardarAlumno(Alumno alumno) {
        try {
            String sql = "INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado)"
                    + "VALUES (?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt("idAlumno"));

                JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }

    }

    public Alumno buscarAlumnoPorId(int idAlu) {
        Alumno alumno = null;

        String sql = "SELECT dni,apellido,nombre,fechaNac"
                + "FROM alumno WHERE idAlumno=" + idAlu + "AND estado=1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
                alumno.setIdAlumno(idAlu);

            } else {
                JOptionPane.showMessageDialog(null, "El alumno no se encontró");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
        return alumno;
    }

    public Alumno buscarAlumnoPorDni(int dniAlu) {
        Alumno alumno = null;

        String sql = "SELECT idAlumno,apellido,nombre,fechaNac"
                + "FROM alumno WHERE dni=" + dniAlu + "AND estado=1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setDni(dniAlu);
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setEstado(true);
                alumno.setIdAlumno(rs.getInt("idAlumno"));

            } else {
                JOptionPane.showMessageDialog(null, "El alumno no se encontró");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
        return alumno;
    }

    public List<Alumno> listaAlu() {
        List<Alumno> listaAlumnos = new ArrayList<>();
        String sql = "SELECT * FROM alumno WHERE estado=1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                listaAlumnos.add(new Alumno(rs.getInt("idAlumno"), rs.getInt("dni"),
                        rs.getString("apellido"), rs.getString("nombre"),
                        rs.getDate("fechaNacimiento").toLocalDate(), true));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
        return listaAlumnos;

    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni=?,apellido=?,nombre=?,fechaNac=? WHERE idAlumno=" + alumno.getIdAlumno();

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            if (ps.executeUpdate() == 1) {

                JOptionPane.showMessageDialog(null, "Modificación exitosa");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no encontrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }
    }

    public void eliminarAlumno(int idAlu) {
        String sql = "UPDATE alumno SET estado=0 WHERE idAlumno=" + idAlu;

        try (PreparedStatement ps = con.prepareStatement(sql)) {
            
            if (ps.executeUpdate() == 1) {

                JOptionPane.showMessageDialog(null, "Alumno borrado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos." + ex.getMessage());
        }

    }

}
