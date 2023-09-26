/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg23.accesoADatos;

import javax.swing.JOptionPane;

/**
 *
 * @author jonac
 */
public class Validaciones {

    /**
     *
     * @param cadena Cadena de texto de un TextField
     * @param tipo Entero para identificar si se trata de un numero o
     * caracteres, 1= Numeros, 2= Cadena Texto
     * @return Boolean
     */
    public static boolean validacionInmediataCaracteres(String cadena, int tipo) {
        char caracter;
        String cadenaMin;
        boolean log = true;
        int count = 0;
        switch (tipo) {
            case 1:
                for (int i = 0; i < cadena.length(); i++) {
                    caracter = cadena.charAt(i);
                    if (!(caracter > 47 && caracter < 58)) {
                        log = false;
                        break;
                    }
                }
                break;
            case 2:
                cadenaMin = cadena.toLowerCase();
                for (int i = 0; i < cadenaMin.length(); i++) {
                    caracter = cadenaMin.charAt(i);
                    if (!(caracter > 96 && caracter < 123) && caracter != 32) {
                        log = false;
                        break;
                    }
                    if (i == 0 && caracter == 32) {
                        log = false;
                        break;
                    }
                }
                break;
        }
        return log;
    }

    //VALIDACIONES DE LA VENTANA ALUMNO
    public static boolean validacionDNI(String dni) {
        if (dni.length() > 6 && dni.length() < 10) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El DNI ingresado es invalido");
            return false;
        }
    }

    public static boolean validacionNombreAlumno(String nombre) {
        if (nombre.length() > 2 && nombre.length() < 30&& !nombre.contains("  ")) {
            return true;
        }  else{
            JOptionPane.showMessageDialog(null, "El nombre ingresado es invalido");
            return false;
        }
    }

    public static boolean validacionApellidoAlumno(String apellido) {
        if (apellido.length()>1 && apellido.length() < 30&& !apellido.contains("  ")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El apellido ingresado es invalido");
            return false;
        }
    }
    
    
    //VALIDACIONES DE LA VENTANA MATERIA
      public static boolean validacionNombreMateria(String nombre) {
        if (nombre.length() > 2 && nombre.length() < 30&& !nombre.contains("  ")) {
            return true;
        }  else{
            JOptionPane.showMessageDialog(null, "El nombre ingresado es inválido");
            return false;
        }
    }
      
          public static boolean validacionAnio(String anio) {
        if (anio.length() == 1 && Integer.parseInt(anio)<7) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado es inválido");
            return false;
        }
    }

}

