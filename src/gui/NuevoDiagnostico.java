package gui;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import mundo.Diagnostico;
import mundo.OperacionesDiagnostico;
import mundo.OperacionesHistoriaClinica;

/**
 *
 * @author Janus
 */
public class NuevoDiagnostico extends JInternalFrame {

    
    
    public NuevoDiagnostico() {
        
        initComponents();
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextDiagnostico = new javax.swing.JTextField();
        TextID_Historia = new javax.swing.JTextField();
        TextID_Diagnostico = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("DIAGNOSTICO");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DIAGNOSTICO:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID_DIAGNOSTICO: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID_HISTORIA: ");

        TextDiagnostico.setBackground(new java.awt.Color(255, 255, 255));
        TextDiagnostico.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextDiagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDiagnosticoActionPerformed(evt);
            }
        });

        TextID_Historia.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Historia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_HistoriaActionPerformed(evt);
            }
        });

        TextID_Diagnostico.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Diagnostico.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_DiagnosticoActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(153, 204, 255));
        Guardar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(153, 204, 255));
        Buscar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Buscar.setForeground(new java.awt.Color(0, 0, 0));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(153, 204, 255));
        Mostrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(255, 51, 51));
        Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(153, 204, 255));
        Modificar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextID_Historia, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextID_Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                        .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(Guardar)
                        .addGap(18, 18, 18)
                        .addComponent(Modificar)
                        .addGap(18, 18, 18)
                        .addComponent(Mostrar)
                        .addGap(32, 32, 32)
                        .addComponent(Eliminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(TextID_Diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextID_Historia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(118, 118, 118))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextDiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDiagnosticoActionPerformed

    private void TextID_HistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_HistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_HistoriaActionPerformed

    private void TextID_DiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_DiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_DiagnosticoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    Guardar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Diagnostico = TextID_Diagnostico.getText().trim();
        String ID_Historia = TextID_Historia.getText().trim();
        String Diagnostico = TextDiagnostico.getText().trim();

        //  Verificar campos vacíos
        if (ID_Diagnostico.isEmpty() || ID_Historia.isEmpty() || Diagnostico.isEmpty()) {
            JOptionPane.showMessageDialog(null, "️ Por favor, completa todos los campos.");
            return;
        }

        // Validación de duplicado de diagnóstico
        if (OperacionesDiagnostico.obtenerDiagnosticoPorID(ID_Diagnostico) != null) {
            JOptionPane.showMessageDialog(null, " Ya existe un diagnóstico con ese ID.");
            return;
        }

        //  Validar existencia de historia
        if (OperacionesHistoriaClinica.obtenerHistoriaPorID(ID_Historia) == null) {
            JOptionPane.showMessageDialog(null, " El ID de la historia no existe.");
            return;
        }

        //  Crear y guardar el diagnóstico
        Diagnostico nuevoDiagnostico = new Diagnostico(ID_Diagnostico, ID_Historia, Diagnostico);
        OperacionesDiagnostico.guardar(nuevoDiagnostico);

        JOptionPane.showMessageDialog(null, " Diagnóstico guardado correctamente.");

        //  Limpiar campos
        TextID_Diagnostico.setText("");
        TextID_Historia.setText("");
        TextDiagnostico.setText("");
    }
});


    }//GEN-LAST:event_GuardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    Buscar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Diagnostico = JOptionPane.showInputDialog(null, " Ingresa el ID del diagnóstico a buscar:");

        if (ID_Diagnostico != null && !ID_Diagnostico.trim().isEmpty()) {
            if (OperacionesDiagnostico.buscar(ID_Diagnostico.trim())) {
                Diagnostico diagnosticoEncontrado = OperacionesDiagnostico.obtenerDiagnosticoPorID(ID_Diagnostico);

                TextID_Diagnostico.setText(diagnosticoEncontrado.getID_Diagnostico());
                TextID_Historia.setText(diagnosticoEncontrado.getID_Historia());
                TextDiagnostico.setText(diagnosticoEncontrado.getDiagnostico());

                JOptionPane.showMessageDialog(null, " Diagnóstico encontrado y mostrado.");
            } else {
                JOptionPane.showMessageDialog(null, " Diagnóstico no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "️ Debes ingresar un ID de diagnóstico válido.");
        }
    }
});

    }//GEN-LAST:event_BuscarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
    Mostrar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        JTable tabla = OperacionesDiagnostico.crearTablaDiagnosticos();
        JScrollPane scrollPane = new JScrollPane(tabla);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Diagnósticos", JOptionPane.INFORMATION_MESSAGE);
    }
});

    }//GEN-LAST:event_MostrarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    Eliminar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Diagnostico = JOptionPane.showInputDialog(null, "🗑️ Ingresa el ID del diagnóstico a eliminar:");

        if (ID_Diagnostico != null && !ID_Diagnostico.trim().isEmpty()) {
            if (OperacionesDiagnostico.eliminarDiagnosticoPorID(ID_Diagnostico.trim())) {
                JOptionPane.showMessageDialog(null, " Diagnóstico eliminado correctamente.");

                // Limpiar los campos
                TextID_Diagnostico.setText("");
                TextID_Historia.setText("");
                TextDiagnostico.setText("");
            } else {
                JOptionPane.showMessageDialog(null, " Diagnóstico no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "️ Debes ingresar un ID de diagnóstico válido.");
        }
    }
});

    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
    Modificar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String ID_Diagnostico = JOptionPane.showInputDialog("Ingrese el ID del diagnóstico a modificar:");

        if (ID_Diagnostico == null || ID_Diagnostico.trim().isEmpty()) return;

        Diagnostico diag = OperacionesDiagnostico.obtenerDiagnosticoPorID(ID_Diagnostico.trim());

        if (diag == null) {
            JOptionPane.showMessageDialog(null, "Diagnóstico no encontrado.");
        } else {
            // Pedir nuevo ID del diagnóstico
            String nuevoID = JOptionPane.showInputDialog("ID actual: " + diag.getID_Diagnostico() + "\n\nIngrese el nuevo ID del diagnóstico:");
            if (nuevoID == null || nuevoID.trim().isEmpty()) return;

            // Pedir nuevo texto del diagnóstico
            String nuevoTexto = JOptionPane.showInputDialog("Diagnóstico actual: " + diag.getDiagnostico() + "\n\nIngrese el nuevo diagnóstico:");

            if (nuevoTexto != null && !nuevoTexto.trim().isEmpty()) {
                // Modificar diagnóstico (pasando ID original)
                boolean modificado = OperacionesDiagnostico.Modificar(
                    diag.getID_Diagnostico(),  // ID original
                    nuevoID.trim(),
                    diag.getID_Historia(),
                    nuevoTexto.trim()
                );

                if (modificado) {
                    JOptionPane.showMessageDialog(null, "Diagnóstico modificado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el diagnóstico.");
                }
            }
        }
    }
});



    }//GEN-LAST:event_ModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JTextField TextDiagnostico;
    private javax.swing.JTextField TextID_Diagnostico;
    private javax.swing.JTextField TextID_Historia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
