package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import mundo.OperacionesPaciente;
import mundo.Paciente;


public class NuevoPaciente extends JInternalFrame {

    /*
     * Creates new form NuevoPaciente
     */
    
    
    public NuevoPaciente() {
        
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
        TextTelefono = new javax.swing.JTextField();
        TextDireccion = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TextID_Paciente = new javax.swing.JTextField();
        TextNombre_Paciente = new javax.swing.JTextField();
        TextEdad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Mostrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TextTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TextTelefono.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        TextDireccion.setBackground(new java.awt.Color(255, 255, 255));
        TextDireccion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextDireccionActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(153, 204, 255));
        Guardar.setFont(Guardar.getFont().deriveFont(Guardar.getFont().getStyle() | java.awt.Font.BOLD, Guardar.getFont().getSize()+12));
        Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(255, 51, 51));
        Eliminar.setFont(Eliminar.getFont().deriveFont(Eliminar.getFont().getStyle() | java.awt.Font.BOLD, Eliminar.getFont().getSize()+12));
        Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(153, 204, 255));
        Buscar.setFont(Buscar.getFont().deriveFont(Buscar.getFont().getStyle() | java.awt.Font.BOLD, Buscar.getFont().getSize()+12));
        Buscar.setForeground(new java.awt.Color(0, 0, 0));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() | java.awt.Font.BOLD, jLabel2.getFont().getSize()+12));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("N° CEDULA:");

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+12));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NOMBRE DEL PACIENTE:");

        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() | java.awt.Font.BOLD, jLabel4.getFont().getSize()+12));
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("EDAD:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TELEFONO:");

        jLabel6.setFont(jLabel6.getFont().deriveFont(jLabel6.getFont().getStyle() | java.awt.Font.BOLD, jLabel6.getFont().getSize()+12));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DIRECCIÓN:");

        TextID_Paciente.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Paciente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        TextNombre_Paciente.setBackground(new java.awt.Color(255, 255, 255));
        TextNombre_Paciente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextNombre_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombre_PacienteActionPerformed(evt);
            }
        });

        TextEdad.setBackground(new java.awt.Color(255, 255, 255));
        TextEdad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO PACIENTE");

        Mostrar.setBackground(new java.awt.Color(153, 204, 255));
        Mostrar.setFont(Mostrar.getFont().deriveFont(Mostrar.getFont().getStyle() | java.awt.Font.BOLD, Mostrar.getFont().getSize()+12));
        Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(153, 204, 255));
        Modificar.setFont(Modificar.getFont().deriveFont(Modificar.getFont().getStyle() | java.awt.Font.BOLD, Modificar.getFont().getSize()+12));
        Modificar.setForeground(new java.awt.Color(0, 0, 0));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(217, 217, 217))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TextTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                                .addComponent(TextNombre_Paciente, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextEdad, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(TextID_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 188, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Modificar)
                .addGap(26, 26, 26)
                .addComponent(Mostrar)
                .addGap(32, 32, 32)
                .addComponent(Eliminar)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextID_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Guardar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextNombre_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(Buscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(TextEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextDireccionActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    Guardar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Paciente = TextID_Paciente.getText().trim();
        String Nombre_Paciente = TextNombre_Paciente.getText().trim();
        String Edad = TextEdad.getText().trim();
        String Telefono = TextTelefono.getText().trim();
        String Direccion = TextDireccion.getText().trim();

        if (ID_Paciente.isEmpty() || Nombre_Paciente.isEmpty() || Edad.isEmpty() || Telefono.isEmpty() || Direccion.isEmpty()) {
            JOptionPane.showMessageDialog(null, " Por favor, completa todos los campos.");
            return;
        }

        Paciente nuevoPaciente = new Paciente(ID_Paciente, Nombre_Paciente, Edad, Telefono, Direccion);

        
        OperacionesPaciente.guardar(nuevoPaciente);

        JOptionPane.showMessageDialog(null, " Paciente guardado correctamente.");

       
        TextID_Paciente.setText("");
        TextNombre_Paciente.setText("");
        TextEdad.setText("");
        TextTelefono.setText("");
        TextDireccion.setText("");
    }
});


    }//GEN-LAST:event_GuardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    Buscar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        Buscar.setEnabled(false); // Desactivar botón durante la búsqueda

        try {
            String ID_Paciente = JOptionPane.showInputDialog(null, "Ingrese la cédula del paciente:", "Buscar Paciente", JOptionPane.QUESTION_MESSAGE);

            if (ID_Paciente == null || ID_Paciente.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "❗ Cédula vacía o búsqueda cancelada.");
                return;
            }

            ID_Paciente = ID_Paciente.trim();
            Paciente p = OperacionesPaciente.obtenerPacientePorID(ID_Paciente);

            if (p != null) {
                
                TextID_Paciente.setText(p.getID_Paciente());
                TextNombre_Paciente.setText(p.getNombre_Paciente());
                TextEdad.setText(p.getEdad());
                TextTelefono.setText(p.getTelefono());
                TextDireccion.setText(p.getDireccion());

                JOptionPane.showMessageDialog(null, "✅ Paciente encontrado.");
            } else {
                JOptionPane.showMessageDialog(null, "❌ Paciente no encontrado.");
            }
        } finally {
            Buscar.setEnabled(true); 
        }
    }
});


    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    Eliminar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Paciente = JOptionPane.showInputDialog(null, "Ingrese la cédula del paciente a eliminar:", "Eliminar Paciente", JOptionPane.WARNING_MESSAGE);

        if (ID_Paciente == null || ID_Paciente.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Operación cancelada o cédula vacía.");
            return;
        }

        ID_Paciente = ID_Paciente.trim();

        if (OperacionesPaciente.buscar(ID_Paciente)) {
            boolean eliminado = OperacionesPaciente.eliminarPacientePorID(ID_Paciente);

            if (eliminado) {
                // Limpiar campos del formulario
                TextID_Paciente.setText("");
                TextNombre_Paciente.setText("");
                TextEdad.setText("");
                TextTelefono.setText("");
                TextDireccion.setText("");

                JOptionPane.showMessageDialog(null, " Paciente eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, " No se pudo eliminar el paciente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Paciente no encontrado.");
        }
    }
});


    }//GEN-LAST:event_EliminarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
    Mostrar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        Mostrar.setEnabled(false); // Desactivar el botón mientras se muestra la ventana emergente

        // Crear la tabla con los datos de los pacientes
        JTable tabla = OperacionesPaciente.crearTablaPacientes();

        // Crear el JScrollPane para la tabla
        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(tabla);
        scroll.setPreferredSize(new java.awt.Dimension(500, 300)); // Ajustar el tamaño del JScrollPane

        // Mostrar la tabla en un JOptionPane
        JOptionPane.showMessageDialog(
            null,
            scroll,
            "Pacientes Registrados",
            JOptionPane.INFORMATION_MESSAGE
        );

        // Reactivar el botón después de que se cierre el JOptionPane
        javax.swing.SwingUtilities.invokeLater(() -> {
            Mostrar.setEnabled(true);
        });
    }
});



    }//GEN-LAST:event_MostrarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
    Modificar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Pedir el ID actual del paciente a modificar
        String ID_Paciente = JOptionPane.showInputDialog("Ingrese el ID del paciente a modificar:");

        if (ID_Paciente == null || ID_Paciente.trim().isEmpty()) return;

        // Buscar el paciente por su ID
        Paciente paciente = OperacionesPaciente.obtenerPacientePorID(ID_Paciente.trim());

        if (paciente == null) {
            JOptionPane.showMessageDialog(null, "Paciente no encontrado.");
        } else {
            // Pedir el nuevo ID del paciente
            String nuevoID = JOptionPane.showInputDialog("ID actual: " + paciente.getID_Paciente() + "\n\nIngrese el nuevo ID del paciente:");
            if (nuevoID == null || nuevoID.trim().isEmpty()) return;

            // Pedir el resto de los nuevos valores
            String nuevoNombre = JOptionPane.showInputDialog("Nombre actual: " + paciente.getNombre_Paciente() + "\n\nIngrese el nuevo nombre:");
            String nuevaEdad = JOptionPane.showInputDialog("Edad actual: " + paciente.getEdad() + "\n\nIngrese la nueva edad:");
            String nuevaDireccion = JOptionPane.showInputDialog("Dirección actual: " + paciente.getDireccion() + "\n\nIngrese la nueva dirección:");
            String nuevoTelefono = JOptionPane.showInputDialog("Teléfono actual: " + paciente.getTelefono() + "\n\nIngrese el nuevo teléfono:");

            // Validar que todos los campos estén completos
            if (nuevoNombre != null && !nuevoNombre.trim().isEmpty() &&
                nuevaEdad != null && !nuevaEdad.trim().isEmpty() &&
                nuevaDireccion != null && !nuevaDireccion.trim().isEmpty() &&
                nuevoTelefono != null && !nuevoTelefono.trim().isEmpty()) {

                // Llamar al método de modificación (pasando el ID original para ubicarlo)
                boolean modificado = OperacionesPaciente.Modificar(
                    paciente.getID_Paciente(), // ID original
                    nuevoID.trim(),
                    nuevoNombre.trim(),
                    nuevaEdad.trim(),
                    nuevaDireccion.trim(),
                    nuevoTelefono.trim()
                );

                if (modificado) {
                    JOptionPane.showMessageDialog(null, "Paciente modificado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar el paciente.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos son requeridos.");
            }
        }
    }
});


    }//GEN-LAST:event_ModificarActionPerformed

    private void TextNombre_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombre_PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombre_PacienteActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JTextField TextDireccion;
    private javax.swing.JTextField TextEdad;
    private javax.swing.JTextField TextID_Paciente;
    private javax.swing.JTextField TextNombre_Paciente;
    private javax.swing.JTextField TextTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
