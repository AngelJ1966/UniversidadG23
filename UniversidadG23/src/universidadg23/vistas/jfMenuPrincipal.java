/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadg23.vistas;

import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author jonac
 */
public class jfMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jfMenuPrincipal
     */
    public jfMenuPrincipal() {
        initComponents();
        setSize(920,780);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jdEscritorio = new javax.swing.JDesktopPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFormulario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMNotas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMAlumnosXMateria = new javax.swing.JMenuItem();
        jmSalir = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        jMenu5.setText("jMenu5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdEscritorio.setMinimumSize(new java.awt.Dimension(400, 0));

        javax.swing.GroupLayout jdEscritorioLayout = new javax.swing.GroupLayout(jdEscritorio);
        jdEscritorio.setLayout(jdEscritorioLayout);
        jdEscritorioLayout.setHorizontalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        jdEscritorioLayout.setVerticalGroup(
            jdEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jMenu1.setText("Alumno");

        jmFormulario.setText("Formulario Alumnos");
        jmFormulario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmFormularioMouseClicked(evt);
            }
        });
        jmFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioActionPerformed(evt);
            }
        });
        jMenu1.add(jmFormulario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jMenuItem7.setText("Formulario Materias");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");

        jMenuItem3.setText("Formulario Inscripciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMNotas.setText("Carga de notas");
        jMNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNotasActionPerformed(evt);
            }
        });
        jMenu3.add(jMNotas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        jMAlumnosXMateria.setText("Alumnos por Materia");
        jMenu4.add(jMAlumnosXMateria);

        jMenuBar1.add(jMenu4);

        jmSalir.setText("Salida");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jmSalir.add(jMenuItem6);

        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked

        
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmFormularioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmFormularioMouseClicked
        
    }//GEN-LAST:event_jmFormularioMouseClicked

    private void jmFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioActionPerformed
                // Al presionar el miFormulario abre el JPanel Formulario
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        FormularioAlumnoView fav = new FormularioAlumnoView();
        centrarFrame(fav);
        fav.setVisible(true);
        jdEscritorio.add(fav);
        jdEscritorio.moveToFront(fav);
    }//GEN-LAST:event_jmFormularioActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed

    }//GEN-LAST:event_jmSalirActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Al presionar el Menu Salida se cierra el Jframe MenuPrincipal
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // Al presionar el MIFormulario Materias abre el JPanel FormularioMateriaView
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        FormularioMateriaView fmv = new FormularioMateriaView();
        fmv.setVisible(true);
        jdEscritorio.add(fmv);
        jdEscritorio.moveToFront(fmv);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // Al presionar el MIFormulario Inscripciones abre el JPanel FormularioInscripcionView
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        FormularioInscripcionView fiv = new FormularioInscripcionView();
        fiv.setVisible(true);
        jdEscritorio.add(fiv);
        jdEscritorio.moveToFront(fiv);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNotasActionPerformed
        // Al presionar el MIFormulario Inscripciones abre el JPanel FormularioCargadeNotasView
        jdEscritorio.removeAll();
        jdEscritorio.repaint();
        FormularioCargadeNotasView fcnv = new FormularioCargadeNotasView();
        centrarFrame(fcnv);
        fcnv.setVisible(true);
        jdEscritorio.add(fcnv);
        jdEscritorio.moveToFront(fcnv);
    }//GEN-LAST:event_jMNotasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfMenuPrincipal().setVisible(true);
            }
        });
    }
    
    private void centrarFrame(JInternalFrame form){
        Dimension desktopSize = jdEscritorio.getSize();
        int x = (desktopSize.width - form.getWidth()) / 2;
        int y = (desktopSize.height - form.getHeight()) / 2;
        form.setLocation(x, y);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMAlumnosXMateria;
    private javax.swing.JMenuItem jMNotas;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JDesktopPane jdEscritorio;
    private javax.swing.JMenuItem jmFormulario;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
