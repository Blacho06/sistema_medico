package gui;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import mundo.HistoriaClinica;
import mundo.OperacionesHistoriaClinica;
import mundo.OperacionesPaciente;

/**
 *
 * @author Janus
 */

public class NuevaHistoriaClinica extends JInternalFrame {

    
    public NuevaHistoriaClinica() {
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TextID_Historia = new javax.swing.JTextField();
        Mostrar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        TextID_Paciente = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("HISTORIA CLINICA ");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ID_HISTORIA:");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID_PACIENTE: ");

        TextID_Historia.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Historia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_HistoriaActionPerformed(evt);
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

        Eliminar.setBackground(new java.awt.Color(255, 51, 51));
        Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        TextID_Paciente.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Paciente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_PacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextID_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextID_Historia, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextID_Historia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 56, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar)
                        .addGap(26, 26, 26)
                        .addComponent(Guardar)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mostrar)
                    .addComponent(jLabel3)
                    .addComponent(TextID_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(Eliminar)
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextID_HistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_HistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_HistoriaActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
    Mostrar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        Mostrar.setEnabled(false); // Desactivar el botón durante la operación

        // Crear la tabla con los datos de las historias clínicas
        JTable tabla = OperacionesHistoriaClinica.crearTabla();

        // Crear el JScrollPane para mostrar la tabla
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setPreferredSize(new java.awt.Dimension(500, 300));

        // Mostrar la tabla en un JOptionPane con un botón OK
        JOptionPane.showMessageDialog(
            null,
            scroll,
            " Lista de Historias Clínicas",
            JOptionPane.INFORMATION_MESSAGE
        );

        // Reactivar el botón después de cerrar el JOptionPane
        javax.swing.SwingUtilities.invokeLater(() -> {
            Mostrar.setEnabled(true);
        });
    }
});




    }//GEN-LAST:event_MostrarActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    Guardar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Historia = TextID_Historia.getText().trim();
        String ID_Paciente = TextID_Paciente.getText().trim();

        if (ID_Historia.isEmpty() || ID_Paciente.isEmpty()) {
            JOptionPane.showMessageDialog(null, "️ Completa todos los campos.");
            return;
        }

        if (OperacionesPaciente.obtenerPacientePorID(ID_Paciente) == null) {
            JOptionPane.showMessageDialog(null, " El ID del paciente no existe.");
            return;
        }

        HistoriaClinica nueva = new HistoriaClinica(ID_Historia, ID_Paciente);
        boolean guardado = OperacionesHistoriaClinica.Guardar(nueva);

        if (guardado) {
            JOptionPane.showMessageDialog(null, " Historia clínica guardada correctamente.");
            TextID_Historia.setText("");
            TextID_Paciente.setText("");
        } else {
            JOptionPane.showMessageDialog(null, " No se pudo guardar. El ID ya existe.");
        }
    }
});


    }//GEN-LAST:event_GuardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    Buscar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Historia = JOptionPane.showInputDialog(null, "Ingrese el ID de la Historia Clínica a buscar:");

        if (ID_Historia == null || ID_Historia.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "️ Debes ingresar un ID válido.");
            return;
        }

        HistoriaClinica hc = OperacionesHistoriaClinica.obtenerHistoriaPorID(ID_Historia.trim());

        if (hc != null) {
            TextID_Historia.setText(hc.getID_Historia());
            TextID_Paciente.setText(hc.getID_Paciente());
            JOptionPane.showMessageDialog(null, " Historia clínica encontrada.");
        } else {
            JOptionPane.showMessageDialog(null, " Historia clínica no encontrada.");
        }
    }
});


    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    Eliminar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Historia = JOptionPane.showInputDialog(null, "Ingrese el ID de la Historia Clínica a eliminar:");

        if (ID_Historia == null || ID_Historia.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "️ Debes ingresar un ID válido.");
            return;
        }

        boolean eliminado = OperacionesHistoriaClinica.eliminar(ID_Historia.trim());

        if (eliminado) {
            JOptionPane.showMessageDialog(null, " Historia clínica eliminada.");
            TextID_Historia.setText("");
            TextID_Paciente.setText("");
        } else {
            JOptionPane.showMessageDialog(null, " No se encontró una historia con ese ID.");
        }
    }
});


    }//GEN-LAST:event_EliminarActionPerformed

    private void TextID_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_PacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JTextField TextID_Historia;
    private javax.swing.JTextField TextID_Paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
