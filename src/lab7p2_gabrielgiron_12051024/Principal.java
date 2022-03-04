/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gabrielgiron_12051024;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Galex
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        UpdateFrame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        CrearEquipos = new javax.swing.JButton();
        ModificarEquipo = new javax.swing.JButton();
        ListarEquipos = new javax.swing.JButton();
        EliminarEquipo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Equipo1 = new javax.swing.JComboBox<>();
        Equipo2 = new javax.swing.JComboBox<>();
        SimularPartido = new javax.swing.JButton();
        Goles1 = new javax.swing.JLabel();
        Goles2 = new javax.swing.JLabel();
        Resultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Posiciones = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CrearEquipos.setText("Crear Equipos");
        CrearEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearEquiposActionPerformed(evt);
            }
        });

        ModificarEquipo.setText("Modificar Equipo");
        ModificarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEquipoActionPerformed(evt);
            }
        });

        ListarEquipos.setText("Listar Equipos");
        ListarEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarEquiposActionPerformed(evt);
            }
        });

        EliminarEquipo.setText("Eliminar Equipo");
        EliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEquipoActionPerformed(evt);
            }
        });

        jButton1.setText("Cargar Archivo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CrearEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addComponent(ModificarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ListarEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrearEquipos)
                    .addComponent(ModificarEquipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListarEquipos)
                    .addComponent(EliminarEquipo))
                .addGap(54, 54, 54)
                .addComponent(jButton1)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Equipos", jPanel1);

        Equipo1.setModel(new DefaultComboBoxModel());

        Equipo2.setModel(new DefaultComboBoxModel());

        SimularPartido.setText("Simular");
        SimularPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimularPartidoActionPerformed(evt);
            }
        });

        Goles1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Goles1.setText("0");

        Goles2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Goles2.setText("0");

        Resultado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Resultado.setText("Resultado: ");

        jLabel1.setText("Equipo 1");

        jLabel2.setText("Equipo 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(Goles1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Goles2)
                .addGap(152, 152, 152))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Resultado, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(31, 31, 31))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(SimularPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Equipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Goles2)
                    .addComponent(Goles1))
                .addGap(25, 25, 25)
                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SimularPartido)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Simulacion", jPanel2);

        Posiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Equipo", "PG", "PP", "PE", "GF", "GC", "Puntos"
            }
        ));
        jScrollPane2.setViewportView(Posiciones);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tabla de Posiciones", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CrearEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearEquiposActionPerformed
        try {
            // TODO add your handling code here:
            AdministrarEquipos AE = new AdministrarEquipos("./Equipos.txt");
            AE.cargarArchivo();
            String Name;
            Name = JOptionPane.showInputDialog("Ingrese el Nombre del Equipo: ");
            int cent = 0;
            for (int i = 0; i < AE.getListaEquipos().size(); i++) {
                if(Name.equals(AE.getListaEquipos().get(i).getNombre()))
                    cent = 1;
            }
            if(cent == 1)
            {
                JOptionPane.showMessageDialog(null, "Ese Equipo ya Existe");
            }
            else
            {
                Equipo E = new Equipo(Name);
                AE.getListaEquipos().add(E);
                AE.escribirArchivo();
                JOptionPane.showMessageDialog(null, "Equipo Creado Exitosamente");
                UpdateFrame();
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CrearEquiposActionPerformed

    private void ModificarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEquipoActionPerformed
        // TODO add your handling code here:
        int pos;
        pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del equipo en la lista"));
        AdministrarEquipos AE = new AdministrarEquipos("./Equipos.txt");
        AE.cargarArchivo();
        if(pos < AE.getListaEquipos().size())
        {
            try {
                String Name;
                Name = JOptionPane.showInputDialog("Ingrese el Nombre del Equipo: ");
                AE.getListaEquipos().get(pos).setNombre(Name);
                AE.escribirArchivo();
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente");
                UpdateFrame();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Posicion no valida");
        }
    }//GEN-LAST:event_ModificarEquipoActionPerformed

    private void ListarEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarEquiposActionPerformed
        // TODO add your handling code here:
        AdministrarEquipos AE = new AdministrarEquipos("./Equipos.txt");
        AE.cargarArchivo();
        String Salida  = "";
        for (int i = 0; i < AE.getListaEquipos().size(); i++) {
            Salida = Salida + "[" + i + "]" + AE.getListaEquipos().get(i).toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, Salida);
    }//GEN-LAST:event_ListarEquiposActionPerformed

    private void EliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEquipoActionPerformed
        // TODO add your handling code here:
        int pos;
        pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del equipo en la lista"));
        AdministrarEquipos AE = new AdministrarEquipos("./Equipos.txt");
        AE.cargarArchivo();
        if(pos < AE.getListaEquipos().size())
        {
            try {
                AE.getListaEquipos().remove(pos);
                AE.escribirArchivo();
                JOptionPane.showMessageDialog(null, "Eliminado Exitosamente");
                UpdateFrame();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Posicion no valida");
        }
    }//GEN-LAST:event_EliminarEquipoActionPerformed

    private void SimularPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SimularPartidoActionPerformed
        // TODO add your handling code here:
        AdministrarEquipos AE = new AdministrarEquipos("./Equipos.txt");
        AE.cargarArchivo();
        Random R = new Random();
        Equipo E1 = (Equipo) Equipo1.getSelectedItem();
        Equipo E2 = (Equipo) Equipo2.getSelectedItem();
        for (int i = 0; i < AE.getListaEquipos().size(); i++) {
            if(E1.getNombre().equals(AE.getListaEquipos().get(i).getNombre()))
                E1 = AE.getListaEquipos().get(i);
            
            if(E2.getNombre().equals(AE.getListaEquipos().get(i).getNombre()))
                E2 = AE.getListaEquipos().get(i);
        }
        if(E1.getNombre().equals(E2.getNombre()))
        {
            JOptionPane.showMessageDialog(null, "Estas Poniendo el mismo equipo en ambas cajas");
        }
        else
        {
            int G1 = R.nextInt(6);
            int G2 = R.nextInt(6);
            Goles1.setText(String.valueOf(G1));
            Goles2.setText(String.valueOf(G2));
            if(G1 > G2)
            {
                try {
                    E1.setGanados(E1.getGanados()+1);
                    E1.setGolesFavor(E1.getGolesFavor() + G1);
                    E1.setGolesContra(E1.getGolesContra() + G2);
                    
                    E2.setPerdidos(E2.getPerdidos() + 1);
                    E2.setGolesFavor(E2.getGolesFavor() + G2);
                    E2.setGolesContra(E2.getGolesContra() + G1);
                    AE.escribirArchivo();
                    Resultado.setText("Resultado: Equipo 1 Gana");
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(G1 < G2)
            {
                try {
                    E1.setPerdidos(E1.getPerdidos()+1);
                    E1.setGolesFavor(E1.getGolesFavor() + G1);
                    E1.setGolesContra(E1.getGolesContra() + G2);
                    
                    E2.setPerdidos(E2.getGanados() + 1);
                    E2.setGolesFavor(E2.getGolesFavor() + G2);
                    E2.setGolesContra(E2.getGolesContra() + G1);
                    AE.escribirArchivo();
                    Resultado.setText("Resultado: Equipo 2 Gana");
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (G1 == G2)
            {
                try {
                    E1.setGanados(E1.getEmpatados()+1);
                    E1.setGolesFavor(E1.getGolesFavor() + G1);
                    E1.setGolesContra(E1.getGolesContra() + G2);
                    
                    E2.setPerdidos(E2.getEmpatados() + 1);
                    E2.setGolesFavor(E2.getGolesFavor() + G2);
                    E2.setGolesContra(E2.getGolesContra() + G1);
                    AE.escribirArchivo();
                    Resultado.setText("Resultado: Empate");
                } catch (IOException ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_SimularPartidoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        File fichero = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = 
                    new FileNameExtensionFilter(
                            "Archivos de Texto", "txt");
            FileNameExtensionFilter filtro2 = 
                new FileNameExtensionFilter(
                        "Imagenes", "jpg", "png", "bmp");
            jfc.setFileFilter(filtro);
            jfc.addChoosableFileFilter(filtro2);            
            int seleccion = jfc.showOpenDialog(this);
            if (seleccion == JFileChooser.APPROVE_OPTION)
            {
               fichero = jfc.getSelectedFile();
               fr = new FileReader(fichero);
               br=new BufferedReader(fr);
               String linea;
               String Salida = "";
               while(  (linea=br.readLine()) !=null  ){                    
                   Salida = Salida + linea + "\n"; 
                }
               JOptionPane.showMessageDialog(null, Salida);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            br.close();
            fr.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void UpdateFrame()
    {
        AdministrarEquipos AE = new AdministrarEquipos("./Equipos.txt");
        AE.cargarArchivo();
        Equipo1.setModel(new DefaultComboBoxModel());
        Equipo2.setModel(new DefaultComboBoxModel());
        DefaultComboBoxModel R = (DefaultComboBoxModel) Equipo1.getModel();
        DefaultComboBoxModel M = (DefaultComboBoxModel) Equipo2.getModel();
        for (int i = 0; i < AE.getListaEquipos().size(); i++) {
            R.addElement(AE.getListaEquipos().get(i));
            M.addElement(AE.getListaEquipos().get(i));
        }
        Equipo1.setModel(R);
        Equipo2.setModel(M);
        
       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearEquipos;
    private javax.swing.JButton EliminarEquipo;
    private javax.swing.JComboBox<String> Equipo1;
    private javax.swing.JComboBox<String> Equipo2;
    private javax.swing.JLabel Goles1;
    private javax.swing.JLabel Goles2;
    private javax.swing.JButton ListarEquipos;
    private javax.swing.JButton ModificarEquipo;
    private javax.swing.JTable Posiciones;
    private javax.swing.JLabel Resultado;
    private javax.swing.JButton SimularPartido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
