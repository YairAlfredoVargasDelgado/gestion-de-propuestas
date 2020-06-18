package upc.poo.presentacion;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import upc.poo.entidades.Director;
import upc.poo.entidades.LineaDeInvestigacion;
import upc.poo.entidades.Persona;
import upc.poo.logica.LogicaDirector;
import upc.poo.logica.LogicaLineaDeInvestigacion;

public class RegistroDirectorDialog extends javax.swing.JDialog {

    private LogicaLineaDeInvestigacion lli = new LogicaLineaDeInvestigacion();
    private LogicaDirector ld = new LogicaDirector();
    
    private ArrayList<LineaDeInvestigacion> li;
    
    private LineaDeInvestigacion lineaDeInvestigacionSeleccionada;
    
    private Persona p;
    
    public RegistroDirectorDialog(java.awt.Frame parent, boolean modal, Persona persona) {
        super(parent, modal);
        initComponents();
        this.p = persona;
    }
    
    private boolean validar() {
        if (String.valueOf(jComboBox1.getSelectedItem()).isEmpty()) {
            return false;
        }
        
        if (this.jComboBox1.getSelectedIndex() == 0) {
            return false;
        }
        return true;
    }
    
    private void cargarComboBox() {
        li = lli.getAll(false);
        
        if (li.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No hay lineas de investigacion registradas");
            return;
        }
        
        ArrayList<String> nombres = new ArrayList<>();
        
        nombres.add("Seleccione una linea de investigacion");
        li.forEach(_li -> nombres.add(_li.getNombre()));
        
        this.jComboBox1.setModel(new DefaultComboBoxModel<>(nombres.toArray(new String[nombres.size()])));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Linea de investigacion");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, 0, 256, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!validar()) {
            JOptionPane.showMessageDialog(this, "Revise los datos antes de continuar");
            return;
        }
        
        Director d = new Director();
        d.setContacto(p.getContacto());
        d.setIdentificacion(p.getIdentificacion());
        d.setFechaNacimiento(p.getFechaNacimiento());
        d.setGenero(p.getGenero());
        d.setNombre(p.getNombre());
        d.setIdLineaDeInvestigacion(lineaDeInvestigacionSeleccionada.getId());
        d.setLineaDeInvestigacion(lineaDeInvestigacionSeleccionada);
        
        if (ld.registrar(d)) {
            JOptionPane.showMessageDialog(this, "Registro exitoso");
            return;
        }
        
        JOptionPane.showMessageDialog(this, "El registro falló");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        lineaDeInvestigacionSeleccionada = lli.get(_li -> _li.getNombre().equals(String.valueOf(jComboBox1.getSelectedItem()).isEmpty())).get(0);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
