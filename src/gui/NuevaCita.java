package gui;

/**
 *
 * @author Janus
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import mundo.Cita;
import mundo.OperacionesCita;
import mundo.OperacionesHistoriaClinica;
import mundo.OperacionesMedico;
import mundo.OperacionesPaciente;



public class NuevaCita extends JInternalFrame {

    /**
     * Creates new form NuevoPaciente
     */
    
    
    public NuevaCita() {
        
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
        jLabel5 = new javax.swing.JLabel();
        TextHora = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextFecha = new javax.swing.JTextField();
        TextID_Historia = new javax.swing.JTextField();
        TextID_Paciente = new javax.swing.JTextField();
        TextID_Medico = new javax.swing.JTextField();
        TextID_Cita = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("ID_PACIENTE: ");

        TextHora.setBackground(new java.awt.Color(255, 255, 255));
        TextHora.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextHoraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("CC. MEDICO:");

        jLabel7.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setText("ID_HISTORIA:");

        TextFecha.setBackground(new java.awt.Color(255, 255, 255));
        TextFecha.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFechaActionPerformed(evt);
            }
        });

        TextID_Historia.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Historia.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Historia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_HistoriaActionPerformed(evt);
            }
        });

        TextID_Paciente.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Paciente.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_PacienteActionPerformed(evt);
            }
        });

        TextID_Medico.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Medico.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_MedicoActionPerformed(evt);
            }
        });

        TextID_Cita.setBackground(new java.awt.Color(255, 255, 255));
        TextID_Cita.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        TextID_Cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextID_CitaActionPerformed(evt);
            }
        });

        jLabel1.setFont(jLabel1.getFont().deriveFont(jLabel1.getFont().getStyle() | java.awt.Font.BOLD, jLabel1.getFont().getSize()+36));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO DE CITA");

        jLabel2.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("FECHA: ");

        jLabel3.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("HORA:");

        jLabel4.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("ID_CITA: ");

        Guardar.setBackground(new java.awt.Color(153, 204, 255));
        Guardar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Guardar.setForeground(new java.awt.Color(51, 51, 51));
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(153, 204, 255));
        Buscar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Buscar.setForeground(new java.awt.Color(51, 51, 51));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(153, 204, 255));
        Mostrar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Mostrar.setForeground(new java.awt.Color(51, 51, 51));
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(255, 51, 51));
        Eliminar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Eliminar.setForeground(new java.awt.Color(51, 51, 51));
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Modificar.setBackground(new java.awt.Color(153, 204, 255));
        Modificar.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Modificar.setForeground(new java.awt.Color(51, 51, 51));
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
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TextID_Medico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextID_Historia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextID_Cita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextID_Paciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextHora, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(243, 243, 243))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Guardar))
                        .addGap(14, 195, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextID_Cita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(Modificar))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextID_Paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(Mostrar))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextID_Medico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Eliminar)
                            .addComponent(jLabel6))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextID_Historia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(91, 91, 91))
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

    private void TextFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFechaActionPerformed

    private void TextID_HistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_HistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_HistoriaActionPerformed

    private void TextID_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_PacienteActionPerformed

    private void TextID_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_MedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_MedicoActionPerformed

    private void TextID_CitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextID_CitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextID_CitaActionPerformed

    private void TextHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextHoraActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
    Guardar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Cita = TextID_Cita.getText().trim();
        String Fecha = TextFecha.getText().trim();
        String Hora = TextHora.getText().trim();
        String ID_Paciente = TextID_Paciente.getText().trim();
        String ID_Medico = TextID_Medico.getText().trim();
        String ID_Historia = TextID_Historia.getText().trim();

       
        if (ID_Cita.isEmpty() || Fecha.isEmpty() || Hora.isEmpty() ||
            ID_Paciente.isEmpty() || ID_Medico.isEmpty() || ID_Historia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "️ Por favor, completa todos los campos.");
            return;
        }
        
        if (OperacionesCita.obtenerCitaPorID(ID_Cita) != null) {
            JOptionPane.showMessageDialog(null, " Ya existe una cita con ese ID.");
            return;
        }


        if (OperacionesPaciente.obtenerPacientePorID(ID_Paciente) == null) {
            JOptionPane.showMessageDialog(null, " El ID del paciente no existe.");
            return;
        }

   
        if (OperacionesMedico.obtenerMedicoPorID(ID_Medico) == null) {
            JOptionPane.showMessageDialog(null, " El ID del médico no existe.");
            return;
        }


        if (OperacionesHistoriaClinica.obtenerHistoriaPorID(ID_Historia) == null) {
            JOptionPane.showMessageDialog(null, " El ID de la historia clínica no existe.");
            return;
        }

        
        Cita nueva = new Cita(Fecha, Hora, ID_Cita, ID_Paciente, ID_Medico, ID_Historia);
        if (OperacionesCita.guardar(nueva)) {
            JOptionPane.showMessageDialog(null, " Cita guardada correctamente.");


      
            TextID_Cita.setText("");
            TextFecha.setText("");
            TextHora.setText("");
            TextID_Paciente.setText("");
            TextID_Medico.setText("");
            TextID_Historia.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "❌ No se pudo guardar la cita.");
        }
    }
});


    }//GEN-LAST:event_GuardarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
    Buscar.addActionListener(new java.awt.event.ActionListener() {
    @Override
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Cita = JOptionPane.showInputDialog(null, " Ingresa el ID de la cita a buscar:");

        if (ID_Cita != null && !ID_Cita.trim().isEmpty()) {
            if (OperacionesCita.buscar(ID_Cita.trim())) {
                Cita encontrada = OperacionesCita.obtenerCitaPorID(ID_Cita);

                TextID_Cita.setText(encontrada.getID_Cita());
                TextFecha.setText(encontrada.getFechaCita());
                TextHora.setText(encontrada.getHoraCita());
                TextID_Paciente.setText(encontrada.getID_Paciente());
                TextID_Medico.setText(encontrada.getID_Medico());
                TextID_Historia.setText(encontrada.getID_Historia());

                JOptionPane.showMessageDialog(null, " Cita encontrada y mostrada.");
            } else {
                JOptionPane.showMessageDialog(null, " Cita no encontrada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, " Debes ingresar un ID de cita válido.");
        }
    }
});


    }//GEN-LAST:event_BuscarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
    Mostrar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        JTable tabla = OperacionesCita.crearTabla();
        JScrollPane scrollPane = new JScrollPane(tabla);
        JOptionPane.showMessageDialog(null, scrollPane, "Lista de Citas", JOptionPane.INFORMATION_MESSAGE);
    }
});
    }//GEN-LAST:event_MostrarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    Eliminar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        String ID_Cita = JOptionPane.showInputDialog(null, "🗑️ Ingresa el ID de la cita a eliminar:");

        if (ID_Cita != null && !ID_Cita.trim().isEmpty()) {
            if (OperacionesCita.eliminar(ID_Cita.trim())) {
                JOptionPane.showMessageDialog(null, " Cita eliminada correctamente.");

                // Limpiar los campos
                TextID_Cita.setText("");
                TextFecha.setText("");
                TextHora.setText("");
                TextID_Paciente.setText("");
                TextID_Medico.setText("");
                TextID_Historia.setText("");
            } else {
                JOptionPane.showMessageDialog(null, " Cita no encontrada.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "️ Debes ingresar un ID de cita válido.");
        }
    }
});


    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
    Modificar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
       
        String ID_Cita = JOptionPane.showInputDialog("Ingrese el ID de la cita a modificar:");

        if (ID_Cita == null || ID_Cita.trim().isEmpty()) return;

        Cita cita = OperacionesCita.obtenerCitaPorID(ID_Cita.trim());

        if (cita == null) {
            JOptionPane.showMessageDialog(null, "Cita no encontrada.");
        } else {
        
            String nuevoID = JOptionPane.showInputDialog("ID actual: " + cita.getID_Cita() + "\n\nIngrese el nuevo ID de la cita:");

            if (nuevoID == null || nuevoID.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "El ID no puede estar vacío.");
                return;
            }

            String nuevaFecha = JOptionPane.showInputDialog("Fecha actual: " + cita.getFechaCita() + "\n\nIngrese la nueva fecha:");

            if (nuevaFecha == null || nuevaFecha.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "La fecha no puede estar vacía.");
                return;
            }

     
            String nuevaHora = JOptionPane.showInputDialog("Hora actual: " + cita.getHoraCita() + "\n\nIngrese la nueva hora:");

            if (nuevaHora == null || nuevaHora.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "La hora no puede estar vacía.");
                return;
            }

           
            boolean modificado = OperacionesCita.Modificar(ID_Cita.trim(), nuevoID.trim(), nuevaFecha.trim(), nuevaHora.trim());

      
            if (modificado) {
                JOptionPane.showMessageDialog(null, "Cita modificada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la cita.");
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
    private javax.swing.JTextField TextFecha;
    private javax.swing.JTextField TextHora;
    private javax.swing.JTextField TextID_Cita;
    private javax.swing.JTextField TextID_Historia;
    private javax.swing.JTextField TextID_Medico;
    private javax.swing.JTextField TextID_Paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
