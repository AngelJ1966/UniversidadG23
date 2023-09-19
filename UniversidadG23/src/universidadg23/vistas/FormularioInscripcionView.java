/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg23.vistas;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadg23.accesoADatos.AlumnoData;
import universidadg23.accesoADatos.InscripcionData;
import universidadg23.accesoADatos.MateriaData;
import universidadg23.entidades.Alumno;
import universidadg23.entidades.Inscripcion;
import universidadg23.entidades.Materia;

/**
 *
 * @author jonac
 */
public class FormularioInscripcionView extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo=new DefaultTableModel(){
        public boolean isCellEditable(int fila,int columna){
            return false;
        }
    };
    private DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
    private String accion;
    /**
     * Creates new form FormularioInscripcionView
     */
    public FormularioInscripcionView() {
        initComponents();
        iniTable();
        iniComboBox();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jrbMatNoInsc = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jbAnularInsc = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jrbMatInsc = new javax.swing.JRadioButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setText("Seleccione un Alumno");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jrbMatNoInsc.setText("Materias no Inscriptas");
        jrbMatNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatNoInscActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jtMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jtMateriasMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jtMaterias);

        jbAnularInsc.setText("Anular inscripcion");
        jbAnularInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jrbMatInsc.setText("Materias Inscriptas");
        jrbMatInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMatInscActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbMatInsc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jrbMatNoInsc)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(106, 106, 106))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbInscribir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jbAnularInsc)
                                        .addGap(106, 106, 106)
                                        .addComponent(jbSalir))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMatNoInsc)
                    .addComponent(jrbMatInsc))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAnularInsc)
                    .addComponent(jbInscribir)
                    .addComponent(jbSalir))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // Al presionar el boton jbSalida se cierra el JInternar frame de Formulario
        this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // Al seleccionar un alumno en la JComboBoxAlumnos se setean el no Selecionados los JRadialButton y se anulan los JButton
        // JbInscribir y JbAnularInsc
        tableClean();
        jrbMatInsc.setSelected(false);
        jrbMatNoInsc.setSelected(false);
        jbInscribir.setEnabled(false);
        jbAnularInsc.setEnabled(false);
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jrbMatInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatInscActionPerformed
        // Rellena la JTableMaterias con aquellas Materias en las cuales el alumno se encuentra inscripto llamando al metodo
        // obtenerMateriasCursadas de la clase InscripcionData
        tableClean();
        accion="MateriaInscripta";
        List <Materia> materiasInsc = new ArrayList<>();
        InscripcionData inscDat = new InscripcionData();
        jrbMatNoInsc.setSelected(false);
        jbInscribir.setEnabled(false);
        Alumno alumno=(Alumno)jcbAlumnos.getSelectedItem();
        
        materiasInsc= inscDat.obtenerMateriasCursadas(alumno.getIdAlumno());
        for (Materia materia : materiasInsc) {
            modelo.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),materia.getAnio()});
        }
    }//GEN-LAST:event_jrbMatInscActionPerformed

    private void jrbMatNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMatNoInscActionPerformed
        // Rellena la JTableMaterias con aquellas Materias a las que el alumno no se encuentra inscripto, esto llamando al metodo
        // ObtenerMateriasNoCursadas de la Clase InscripcionData
        tableClean();
            accion= "MateriaNoInscripta";
        List <Materia> materiasNoInsc = new ArrayList<>();
        InscripcionData inscDat = new InscripcionData();
        jrbMatInsc.setSelected(false);
        jbAnularInsc.setEnabled(false);
        Alumno alumno=(Alumno)jcbAlumnos.getSelectedItem();
        materiasNoInsc= inscDat.obtenerMateriasNoCursadas(alumno.getIdAlumno());
        for (Materia materia : materiasNoInsc) {
            modelo.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),materia.getAnio()});
        }
    }//GEN-LAST:event_jrbMatNoInscActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        // Se realiza la carga de una inscripcion con el alumno seleccionado del JCBAlumnos y materia seleccionada de la JTMaterias (Materia no inscripta)
        jbInscribir.setEnabled(false);
        InscripcionData inscData = new InscripcionData();
        Inscripcion insc = new Inscripcion();
        MateriaData matData=new MateriaData();
        insc.setAlumno((Alumno) jcbAlumnos.getSelectedItem());
        insc.setMateria(matData.buscarMateriaId((int)modelo.getValueAt(jtMaterias.getSelectedRow(),0)));
        insc.setNota(0);
        inscData.guardarInscripcion(insc);
        tableClean();
        jrbMatNoInsc.setSelected(false);
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscActionPerformed
        // Se realiza la baja de una inscripcion con el alumno seleccionado de la JCBAlumnos y una materia seleccionada
        // en la JTMaterias
        jbAnularInsc.setEnabled(false);
        InscripcionData inscData = new InscripcionData();
        inscData.borrarInscripcionMateriaAlumno(((Alumno) jcbAlumnos.getSelectedItem()).getIdAlumno(), (int)modelo.getValueAt(jtMaterias.getSelectedRow(),0));
        // Se recupera el objeto de tipo Alumno seleccionado en la JCBAlumnos y se recupera el entero del dato almacenado en la fila seleccionada y columna = 0
        tableClean();
        jrbMatInsc.setSelected(false);
    }//GEN-LAST:event_jbAnularInscActionPerformed

    private void jtMateriasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMateriasMouseReleased
        // Al seleccionar una fila se corrobora que este seleccionada y se habilita el boton JBInscribir o JBAnularInsc
        // segun el JRB seleccionado anteriormente
        if(jtMaterias.isRowSelected(jtMaterias.getSelectedRow())==true){
            switch(accion){
                case "MateriaInscripta": jbAnularInsc.setEnabled(true);jbInscribir.setEnabled(false);break;
                case "MateriaNoInscripta":jbInscribir.setEnabled(true);jbAnularInsc.setEnabled(false);break;
            }
        }
    }//GEN-LAST:event_jtMateriasMouseReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAnularInsc;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbAlumnos;
    private javax.swing.JRadioButton jrbMatInsc;
    private javax.swing.JRadioButton jrbMatNoInsc;
    private javax.swing.JTable jtMaterias;
    // End of variables declaration//GEN-END:variables
    private void iniTable (){
        // Inicializacion de la JTable, particularmente sus Columnas
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Año");
        jtMaterias.setModel(modelo);
        
    }
    private void iniComboBox (){
        //Inicializacion de la JComboBoxAlumnos
        AlumnoData alumdat = new AlumnoData();
        Vector<Alumno> alumVector = new Vector<>(); 
        List<Alumno> alumList =  new ArrayList<>();
        alumList = alumdat.listaAlu();
        for (Alumno alumno : alumList) {
            alumVector.add(alumno);
        }
        comboModel = new DefaultComboBoxModel(alumVector);//Metodo recibe por parametro un Vector, por ello se utiliza un For para su asignacion
        jcbAlumnos.setModel(comboModel);
    }
    
    public void toggleFormulario() {
        // Seteo de ambos botones Anular Inscripcion(JBAnularInsc) e Inscribir(JBInscribir)
        jbAnularInsc.setEnabled(false);
        jbInscribir.setEnabled(false);
    }
    private void tableClean(){
        //Realiza el chequeo de que la JTMaterias este vacia y si no lo esta la limpia
        if (jtMaterias.getRowCount()!=0) {
            int largo=jtMaterias.getRowCount()-1;
            for(;largo>=0;largo--){
                modelo.removeRow(largo);
            }
        }
    }
}

