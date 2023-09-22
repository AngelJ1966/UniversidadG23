/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg23.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadg23.accesoADatos.AlumnoData;
import universidadg23.accesoADatos.Validaciones;
import universidadg23.entidades.Alumno;

/**
 *
 * @author jonac
 */
public class FormularioAlumnoView extends javax.swing.JInternalFrame {

    private Alumno alum;
    private boolean activo, buscar;
    private String accion;

    /**
     * Creates new form Formulario
     */
    public FormularioAlumnoView() {
        initComponents();
        activo = true;
        toggleFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtDNI = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jdcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jcbEstado = new javax.swing.JCheckBox();
        jbAceptar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("FORMULARIO DE ALUMNO");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText("DNI");

        jLabel7.setText("Apellido");

        jLabel8.setText("Nombre");

        jLabel9.setText("Estado");

        jLabel10.setText("Fecha Nac");

        jtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDNIKeyReleased(evt);
            }
        });

        jtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtApellidoKeyReleased(evt);
            }
        });

        jtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtNombreKeyReleased(evt);
            }
        });

        jdcFechaNacimiento.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaNacimientoPropertyChange(evt);
            }
        });

        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbModificar)
                            .addComponent(jbCancelar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbEliminar)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar))
                            .addComponent(jtApellido)
                            .addComponent(jtNombre)
                            .addComponent(jcbEstado)
                            .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbEstado))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jdcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbEliminar)
                            .addComponent(jbModificar)
                            .addComponent(jbNuevo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAceptar)
                            .addComponent(jbCancelar)
                            .addComponent(jbSalir)))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void toggleFormulario() {
        if (activo) {
            activo = false;
        } else {
            activo = true;
        }
        jtApellido.setEnabled(activo);
        jtNombre.setEnabled(activo);
        jdcFechaNacimiento.setEnabled(activo);
        jcbEstado.setEnabled(activo);
        jbAceptar.setEnabled(activo);
        jbNuevo.setEnabled(!activo);
        jbCancelar.setEnabled(activo);
        if (buscar) {
            jbModificar.setEnabled(activo);
            jbEliminar.setEnabled(activo);
        } else {
            jbModificar.setEnabled(buscar);
            jbEliminar.setEnabled(buscar);
        }
    }

    public void vaciarCampos() {
        jtApellido.setText("");
        jtNombre.setText("");
        jtDNI.setText("");
        jdcFechaNacimiento.setCalendar(null);
        jcbEstado.setSelected(false);
    }

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        try {
            AlumnoData alumData = new AlumnoData();
            alum = alumData.buscarAlumnoPorDni(Integer.valueOf(jtDNI.getText()));
            if (alum != null) {
                jtNombre.setText(alum.getNombre());
                jtApellido.setText(alum.getApellido());
                jcbEstado.setSelected(alum.isEstado());
                jdcFechaNacimiento.setDate(Date.valueOf(alum.getFechaNac()));
                jbModificar.setEnabled(true);
                if (alum.isEstado()) {
                    jbEliminar.setEnabled(true);
                }
                buscar = true;
            } else {
                buscar = false;
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "No se permiten campos vacios y/o caracter invalidos");
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
        jcbEstado.setEnabled(true);
    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // Al presionar el boton jbSalida se cierra el JInternar frame de Formulario
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // Precion sobre el JbNuevo obtiene los datos de los JTfield para crear un alumno y asi enviarlo a la base de datos
        jtNombre.setEnabled(true);
        jtApellido.setEnabled(true);
        jcbEstado.setEnabled(false);
        jdcFechaNacimiento.setEnabled(true);
        jbAceptar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbBuscar.setEnabled(false);
        jbNuevo.setEnabled(false);

        vaciarCampos();
        accion = "nuevo";
        jcbEstado.setSelected(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // Solo se podra modificar un alumno previamente buscado por dni. Al hacer click sobre el JBModificar
        // Se habilita el formulario para modificar los datos del alumno previamente buscado.
        jtNombre.setEnabled(true);
        jtApellido.setEnabled(true);
        jcbEstado.setEnabled(true);
        jdcFechaNacimiento.setEnabled(true);
        jbAceptar.setEnabled(true);
        jbCancelar.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbBuscar.setEnabled(false);
        jbNuevo.setEnabled(false);
        accion = "modificar";
        buscar = false;
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // Al presionar el boton JBEliminar se da la baja logica del alumno
        AlumnoData alumData = new AlumnoData();
        alumData.eliminarAlumno(alum.getIdAlumno());
        vaciarCampos();
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbBuscar.setEnabled(true);
        jbNuevo.setEnabled(true);
        buscar = false;

    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        AlumnoData alumData = new AlumnoData();
        Alumno alumno1=null;
        switch (accion) {
            case "nuevo":
                try {

                    if(Validaciones.validacionDNI(jtDNI.getText())&& Validaciones.validacionApellidoAlumno(jtApellido.getText())&& Validaciones.validacionNombreAlumno(jtNombre.getText())){
                            alumno1 = new Alumno(Integer.parseInt(jtDNI.getText()), jtApellido.getText(),
                            jtNombre.getText(), jdcFechaNacimiento.getDate()
                            .toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate(),
                            jcbEstado.isSelected());
                    }
                    alumData.guardarAlumno(alumno1);
                    
                } catch (NumberFormatException | NullPointerException nf) {
                    JOptionPane.showMessageDialog(this, "Campos vacios y/o error de formato");
                }
                break;
            case "modificar":
                try{
                if(Validaciones.validacionDNI(jtDNI.getText())&& Validaciones.validacionApellidoAlumno(jtApellido.getText())&& Validaciones.validacionNombreAlumno(jtNombre.getText())){
                alumno1 = new Alumno(alum.getIdAlumno(), Integer.parseInt(jtDNI.getText()),
                        jtApellido.getText(), jtNombre.getText(), jdcFechaNacimiento.getDate()
                        .toInstant()
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate(),
                        jcbEstado.isSelected());
                }
                alumData.modificarAlumno(alumno1);
                }catch(NullPointerException np){
                    JOptionPane.showMessageDialog(this, "Campos vacios y/o error de formato");
                }
                break;
        }
        
        if(alumno1!=null){
            vaciarCampos();
        jtNombre.setEnabled(false);
        jtApellido.setEnabled(false);
        jcbEstado.setEnabled(false);
        jdcFechaNacimiento.setEnabled(false);
        jbAceptar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbBuscar.setEnabled(true);
        jbNuevo.setEnabled(true);
        }
    }//GEN-LAST:event_jbAceptarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        jtNombre.setEnabled(false);
        jtApellido.setEnabled(false);
        jcbEstado.setEnabled(false);
        jdcFechaNacimiento.setEnabled(false);
        jbAceptar.setEnabled(false);
        jbCancelar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jbBuscar.setEnabled(true);
        jbNuevo.setEnabled(true);

        vaciarCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jdcFechaNacimientoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaNacimientoPropertyChange
        // Comentar Luego
        if (jdcFechaNacimiento.isEnabled() && jdcFechaNacimiento.getCalendar() != null) {
            if (jdcFechaNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear() > (LocalDate.now().getYear() - 16)) {
                jdcFechaNacimiento.setCalendar(null);
                JOptionPane.showMessageDialog(this, "Fecha invalida. El alumno debe ser mayor de 16 años.");
            }
        }
    }//GEN-LAST:event_jdcFechaNacimientoPropertyChange

    private void jtDNIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDNIKeyReleased
        if (!jtDNI.getText().equals("") && Validaciones.validacionInmediataCaracteres(jtDNI.getText(), 1) == false) {
            JOptionPane.showMessageDialog(this, "Solo se permiten numeros");
            jtDNI.setText("");
        }
    }//GEN-LAST:event_jtDNIKeyReleased

    private void jtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtApellidoKeyReleased
        if (!jtApellido.getText().equals("") && Validaciones.validacionInmediataCaracteres(jtApellido.getText(), 2) == false) {
            JOptionPane.showMessageDialog(this, "Caracter invalido");
            jtApellido.setText("");
        }
    }//GEN-LAST:event_jtApellidoKeyReleased

    private void jtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNombreKeyReleased
        if (!jtNombre.getText().equals("") && Validaciones.validacionInmediataCaracteres(jtNombre.getText(), 2) == false) {
            JOptionPane.showMessageDialog(this, "Caracter invalido");
            jtNombre.setText("");
        }
    }//GEN-LAST:event_jtNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JCheckBox jcbEstado;
    private com.toedter.calendar.JDateChooser jdcFechaNacimiento;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
    

}
