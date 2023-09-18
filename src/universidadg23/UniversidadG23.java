
package universidadg23;

import java.time.LocalDate;
import universidadg23.accesoADatos.AlumnoData;
import universidadg23.accesoADatos.Conexion;
import universidadg23.accesoADatos.InscripcionData;
import universidadg23.accesoADatos.MateriaData;
import universidadg23.entidades.Alumno;
import universidadg23.entidades.Inscripcion;
import universidadg23.entidades.Materia;


public class UniversidadG23 {


    public static void main(String[] args) {
        // TODO code application logic here
        AlumnoData alumdata=new AlumnoData();
        MateriaData matdata=new MateriaData();
        InscripcionData inscdata=new InscripcionData();
        
//        alumdata.guardarAlumno(new Alumno(12123123, "Mercado", "Matias", LocalDate.of(1980,5,4), true));
//        alumdata.guardarAlumno(new Alumno(12123321, "Lopez", "Pablo", LocalDate.of(1985,7,14), true));

//        matdata.guardarMateria(new Materia("Literatura", 1, true));
//        matdata.guardarMateria(new Materia("Historia", 2, true));
//        
        //System.out.println(matdata.buscarMateriaId(2));
        //    inscdata.guardarInscripcion(new Inscripcion(alumdata.buscarAlumnoPorId(5), matdata.buscarMateriaId(2), 0));
        
        System.out.println(alumdata.buscarAlumnoPorDni(14456987));
    }
    
}
