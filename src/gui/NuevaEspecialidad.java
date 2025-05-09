
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import mundo.Especialidad;
import mundo.OperacionesEspecialidad;


/**
 *
 * @author Janus
 */

public class NuevaEspecialidad extends JInternalFrame {

    /**
     * Creates new form NuevoPaciente
     */
    
    
    public NuevaEspecialidad() {
        
        initComponents();
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextNombre_Especialidad = new javax.swing.JTextField();
        TextID_Especialidad = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("ESPECIALIDAD");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("NOMBRE DE ESPECIALIDAD: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("ID_ESPECIALIDAD: ");

        TextNombre_Especialidad.setBackground(new java.awt.Color(255, 255, 255));
        TextNombre_Especialidad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextNombre_Especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombre_EspecialidadActionPerformed(evt);
            }
        });

        TextID_Especialidad.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Especialidad.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Especialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_EspecialidadActionPerformed(evt);
            }
        });

        Guardar.setBackground(new java.awt.Color(153, 204, 255));
        Guardar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Guardar.setText("Guardar");
        Guardar.setToolTipText("");
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

        Mostrar.setBackground(new java.awt.Color(153, 204, 255));
        Mostrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(0, 0, 0));
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(358, 358, 358)
                        .addComponent(TextID_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextNombre_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(Mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(Buscar)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextID_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Guardar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextNombre_Especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Modificar)
                        .addGap(18, 18, 18)
                        .addComponent(Mostrar)))
                .addGap(38, 38, 38)
                .addComponent(Eliminar)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextNombre_EspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombre_EspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombre_EspecialidadActionPerformed

    private void TextID_EspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_EspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_EspecialidadActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    Guardar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        // Desactivar temporalmente para evitar múltiples clics
        Guardar.setEnabled(false);

        try {
            String ID_Especialidad = TextID_Especialidad.getText().trim();
            String Nombre_Especialidad = TextNombre_Especialidad.getText().trim();

            if (ID_Especialidad.isEmpty() || Nombre_Especialidad.isEmpty()) {
                JOptionPane.showMessageDialog(null, "️ Por favor, completa todos los campos.");
                return;
            }

            if (OperacionesEspecialidad.obtenerEspecialidadPorID(ID_Especialidad) != null) {
                JOptionPane.showMessageDialog(null, " Ya existe una especialidad con ese ID.");
                return;
            }

            Especialidad especialidad = new Especialidad( ID_Especialidad, Nombre_Especialidad); 
            OperacionesEspecialidad.Guardar(especialidad);

            JOptionPane.showMessageDialog(null, " Especialidad guardada correctamente .");

            // Limpiar campos
            TextID_Especialidad.setText("");
            TextNombre_Especialidad.setText("");

        } finally {
            // Activar el botón nuevamente
            Guardar.setEnabled(true);
        }
    }
});



    }//GEN-LAST:event_GuardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    Buscar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        Buscar.setEnabled(false); // Desactivar botón mientras se busca

        try {
            String id = JOptionPane.showInputDialog(null, "Ingrese el ID de la Especialidad a buscar:");

            if (id == null || id.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "️ Debe ingresar un ID válido.");
                return;
            }

            id = id.trim();
            Especialidad esp = OperacionesEspecialidad.obtenerEspecialidadPorID(id);

            if (esp != null) {
                TextID_Especialidad.setText(esp.getID_Especialidad());
                TextNombre_Especialidad.setText(esp.getNombre_Especialidad());

                JOptionPane.showMessageDialog(null, " Especialidad encontrada.");
            } else {
                JOptionPane.showMessageDialog(null, " Especialidad no encontrada.");
            }
        } finally {
            Buscar.setEnabled(true); // Reactivar botón
        }
    }
});



    }//GEN-LAST:event_BuscarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    Eliminar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        Eliminar.setEnabled(false); // Desactivar para evitar múltiples clics

        try {
            String id = JOptionPane.showInputDialog(null, "Ingrese el ID de la Especialidad a eliminar:");

            if (id == null || id.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "️ Debe ingresar un ID válido.");
                return;
            }

            id = id.trim();
            boolean eliminado = OperacionesEspecialidad.eliminarEspecialidadPorID(id);

            if (eliminado) {
                JOptionPane.showMessageDialog(null, " Especialidad eliminada correctamente.");
                TextID_Especialidad.setText("");
                TextNombre_Especialidad.setText("");
            } else {
                JOptionPane.showMessageDialog(null, " No se encontró la especialidad con ese ID.");
            }
        } finally {
            Eliminar.setEnabled(true); // Volver a activar
        }
    }
});

    }//GEN-LAST:event_EliminarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
    Mostrar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        Mostrar.setEnabled(false); // Desactivar botón

        JTable tabla = OperacionesEspecialidad.crearTablaEspecialidades();

        javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(tabla);
        scroll.setPreferredSize(new java.awt.Dimension(500, 300));

        // Mostrar la tabla en un JOptionPane
        JOptionPane.showMessageDialog(
            null,
            scroll,
            " Lista de Especialidades",
            JOptionPane.INFORMATION_MESSAGE
        );

        // Reactivar el botón 
        javax.swing.SwingUtilities.invokeLater(() -> {
            Mostrar.setEnabled(true);
        });
    }
});



    }//GEN-LAST:event_MostrarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
    Modificar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Pedir el ID actual de la especialidad a modificar
        String idEsp = JOptionPane.showInputDialog("Ingrese el ID de la especialidad a modificar:");

        if (idEsp == null || idEsp.trim().isEmpty()) return;

        // Buscar la especialidad por su ID
        Especialidad especialidad = OperacionesEspecialidad.obtenerEspecialidadPorID(idEsp.trim());

        if (especialidad == null) {
            JOptionPane.showMessageDialog(null, "Especialidad no encontrada.");
        } else {
            // Solicitar nuevo ID
            String nuevoID = JOptionPane.showInputDialog("ID actual: " + especialidad.getID_Especialidad() + "\n\nIngrese el nuevo ID de la especialidad:");
            if (nuevoID == null || nuevoID.trim().isEmpty()) return;

            // Solicitar nuevo nombre
            String nuevoNombre = JOptionPane.showInputDialog("Nombre actual: " + especialidad.getNombre_Especialidad() + "\n\nIngrese el nuevo nombre de la especialidad:");
            if (nuevoNombre == null || nuevoNombre.trim().isEmpty()) return;

            // Llamar al método para modificar
            boolean modificado = OperacionesEspecialidad.Modificar(especialidad.getID_Especialidad(), nuevoID.trim(), nuevoNombre.trim());

            if (modificado) {
                JOptionPane.showMessageDialog(null, "Especialidad modificada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la especialidad.");
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
    private javax.swing.JTextField TextID_Especialidad;
    private javax.swing.JTextField TextNombre_Especialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
