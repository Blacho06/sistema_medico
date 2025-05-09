
package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import mundo.OperacionesCita;
import mundo.OperacionesOrden;
import mundo.Orden;

/**
 *
 * @author Janus
 */

public class NuevaOrden extends JInternalFrame {

    /**
     * Creates new form NuevoPaciente
     */
    
    
    public NuevaOrden() {
        
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextFecha_Orden = new javax.swing.JTextField();
        TextTipo_Orden = new javax.swing.JTextField();
        TextID_Cita = new javax.swing.JTextField();
        TextID_Orden = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ORDEN MEDICA");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("TIPO DE ORDEN: ");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("FECHA DE LA ORDEN: ");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("ID_ORDEN: ");

        jLabel5.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("ID_CITA:");

        TextFecha_Orden.setBackground(new java.awt.Color(255, 255, 255));
        TextFecha_Orden.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextFecha_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFecha_OrdenActionPerformed(evt);
            }
        });

        TextTipo_Orden.setBackground(new java.awt.Color(255, 255, 255));
        TextTipo_Orden.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextTipo_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextTipo_OrdenActionPerformed(evt);
            }
        });

        TextID_Cita.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Cita.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_CitaActionPerformed(evt);
            }
        });

        TextID_Orden.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Orden.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_OrdenActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFecha_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextID_Cita, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextID_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextTipo_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 35, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Mostrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(Buscar)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextFecha_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addComponent(Guardar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextID_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TextTipo_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Modificar)
                        .addGap(2, 2, 2)
                        .addComponent(TextID_Cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(Mostrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Eliminar)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFecha_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFecha_OrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFecha_OrdenActionPerformed

    private void TextTipo_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextTipo_OrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextTipo_OrdenActionPerformed

    private void TextID_CitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_CitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_CitaActionPerformed

    private void TextID_OrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_OrdenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_OrdenActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    Guardar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String Fecha_Orden = TextFecha_Orden.getText().trim();
        String ID_Orden = TextID_Orden.getText().trim();
        String ID_Cita = TextID_Cita.getText().trim();
        String Tipo_Orden = TextTipo_Orden.getText().trim();

        // Validar campos vacíos
        if (Fecha_Orden.isEmpty() || ID_Orden.isEmpty() || ID_Cita.isEmpty() || Tipo_Orden.isEmpty()) {
            JOptionPane.showMessageDialog(null, "❗Por favor, completa todos los campos.");
            return;
        }

        // Validar formato de fecha (opcional)
        if (!Fecha_Orden.matches("\\d{2}/\\d{2}/\\d{4}")) {
            JOptionPane.showMessageDialog(null, " La fecha debe tener el formato dd/mm/yyyy.");
            return;
        }

        // Validar existencia de la cita
        if (OperacionesCita.obtenerCitaPorID(ID_Cita) == null) {
            JOptionPane.showMessageDialog(null, " El ID_Cita no existe.");
            return;
        }

        // Validar que la orden no exista
        if (OperacionesOrden.obtenerOrdenPorID(ID_Orden) != null) {
            JOptionPane.showMessageDialog(null, " Ya existe una orden con ese ID.");
            return;
        }

        // Crear y guardar orden
        Orden nuevaOrden = new Orden( Fecha_Orden,  ID_Orden,  ID_Cita,  Tipo_Orden);
        nuevaOrden.Fecha_Orden = Fecha_Orden;
        nuevaOrden.ID_Orden = ID_Orden;
        nuevaOrden.ID_Cita = ID_Cita;
        nuevaOrden.Tipo_Orden = Tipo_Orden;

        OperacionesOrden.guardar(nuevaOrden);

        JOptionPane.showMessageDialog(null, " Orden guardada correctamente.");

        // Limpiar campos
        TextFecha_Orden.setText("");
        TextID_Orden.setText("");
        TextID_Cita.setText("");
        TextTipo_Orden.setText("");
    }
});

    }//GEN-LAST:event_GuardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    Buscar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Orden = JOptionPane.showInputDialog(null, "Ingrese el ID_Orden a buscar:", "Buscar Orden", JOptionPane.QUESTION_MESSAGE);

        if (ID_Orden == null || ID_Orden.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, " No ingresaste ningún ID_Orden.");
            return;
        }

        ID_Orden = ID_Orden.trim();
        Orden orden = OperacionesOrden.obtenerOrdenPorID(ID_Orden);

        if (orden != null) {
            TextFecha_Orden.setText(orden.Fecha_Orden);
            TextID_Orden.setText(orden.ID_Orden);
            TextID_Cita.setText(orden.ID_Cita);
            TextTipo_Orden.setText(orden.Tipo_Orden);
            JOptionPane.showMessageDialog(null, " Orden encontrada.");
        } else {
            JOptionPane.showMessageDialog(null, " Orden no encontrada.");
        }
    }
});


    }//GEN-LAST:event_BuscarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
    Mostrar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        Mostrar.setEnabled(false); // Desactivar botón mientras se muestra

        try {
            JTable tabla = OperacionesOrden.crearTablaOrdenes(); // Crear la tabla con las órdenes

            javax.swing.JScrollPane scroll = new javax.swing.JScrollPane(tabla);
            scroll.setPreferredSize(new java.awt.Dimension(650, 300));
            scroll.setBorder(null); // Estilo más limpio, opcional

            JOptionPane.showMessageDialog(null, scroll, "Órdenes Registradas", JOptionPane.INFORMATION_MESSAGE);
        } finally {
            Mostrar.setEnabled(true); // Reactivar después de mostrar
        }
    }
});
 

    }//GEN-LAST:event_MostrarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    Eliminar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Orden = JOptionPane.showInputDialog(null, "Ingrese el ID_Orden a eliminar:", "Eliminar Orden", JOptionPane.WARNING_MESSAGE);

        if (ID_Orden == null || ID_Orden.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Operación cancelada o ID_Orden vacío.");
            return;
        }

        ID_Orden = ID_Orden.trim();
        boolean eliminado = OperacionesOrden.eliminarOrdenPorID(ID_Orden);

        if (eliminado) {
            JOptionPane.showMessageDialog(null, " Orden eliminada correctamente.");

            // Limpiar campos del formulario
            TextFecha_Orden.setText("");
            TextID_Orden.setText("");
            TextID_Cita.setText("");
            TextTipo_Orden.setText("");
        } else {
            JOptionPane.showMessageDialog(null, " Orden no encontrada.");
        }
    }
});
  
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
    Modificar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Pedir el ID de la orden a modificar
        String ID_Orden = JOptionPane.showInputDialog("Ingrese el ID de la orden a modificar:");

        if (ID_Orden == null || ID_Orden.trim().isEmpty()) return;

        // Buscar la orden por su ID
        Orden orden = OperacionesOrden.obtenerOrdenPorID(ID_Orden.trim());

        if (orden == null) {
            JOptionPane.showMessageDialog(null, "Orden no encontrada.");
        } else {
            // Pedir los nuevos valores para los campos modificables
            String nuevoID = JOptionPane.showInputDialog("ID actual: " + orden.getID_Orden() + "\n\nIngrese el nuevo ID de la orden:");
            if (nuevoID == null || nuevoID.trim().isEmpty()) return;

            String nuevaFecha = JOptionPane.showInputDialog("Fecha actual: " + orden.getFecha_Orden() + "\n\nIngrese la nueva fecha de la orden:");
            if (nuevaFecha == null || nuevaFecha.trim().isEmpty()) return;

            String nuevoTipo = JOptionPane.showInputDialog("Tipo actual: " + orden.getTipo_Orden() + "\n\nIngrese el nuevo tipo de la orden:");
            if (nuevoTipo == null || nuevoTipo.trim().isEmpty()) return;

            // Llamar al método para modificar la orden
            boolean modificado = OperacionesOrden.Modificar(ID_Orden.trim(), nuevoID.trim(), nuevaFecha.trim(), nuevoTipo.trim());

            if (modificado) {
                JOptionPane.showMessageDialog(null, "Orden modificada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la orden.");
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
    private javax.swing.JTextField TextFecha_Orden;
    private javax.swing.JTextField TextID_Cita;
    private javax.swing.JTextField TextID_Orden;
    private javax.swing.JTextField TextTipo_Orden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
