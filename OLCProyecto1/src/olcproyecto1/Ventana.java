/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package olcproyecto1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import Analizadores.Objetos.Util;
import Listas.NodoImagen;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author Cesar
 */
public class Ventana extends javax.swing.JFrame {
    int contArch = 1;
    Ejecutar ejecutar = new Ejecutar();
    NodoImagen temporal;
    
    public Ventana() {
        initComponents();
        jConsola.setEditable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jLabel1 = new javax.swing.JLabel();
        panelEntrada = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jConsola = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        lienzo = new javax.swing.JLabel();
        jButtonAnterior = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newArchivo = new javax.swing.JMenuItem();
        openArchivo = new javax.swing.JMenuItem();
        save = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        closeP = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jEjecutarBoton = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jReporteTokens = new javax.swing.JMenuItem();
        jReporteErrores = new javax.swing.JMenuItem();
        jTabSimbolos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel1.setText("Entrada:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel2.setText("Consola:");

        jConsola.setColumns(20);
        jConsola.setRows(5);
        jScrollPane2.setViewportView(jConsola);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 20)); // NOI18N
        jLabel3.setText("Ver gráficas");

        lienzo.setToolTipText("");

        jButtonAnterior.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonAnterior.setText("<");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonSiguiente.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButtonSiguiente.setText(">");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jMenuBar1.setFont(new java.awt.Font("sansserif", 0, 13)); // NOI18N

        jMenu1.setText("Archivo");

        newArchivo.setText("Nuevo Archivo");
        newArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(newArchivo);

        openArchivo.setText("Abrir Archivo");
        openArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openArchivoActionPerformed(evt);
            }
        });
        jMenu1.add(openArchivo);

        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jMenu1.add(save);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Pestañas");

        closeP.setText("Eliminar Pestaña");
        closeP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closePActionPerformed(evt);
            }
        });
        jMenu2.add(closeP);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Accion");

        jEjecutarBoton.setText("Ejecutar");
        jEjecutarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEjecutarBotonActionPerformed(evt);
            }
        });
        jMenu3.add(jEjecutarBoton);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Reportes");

        jReporteTokens.setText("Tokens");
        jReporteTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReporteTokensActionPerformed(evt);
            }
        });
        jMenu4.add(jReporteTokens);

        jReporteErrores.setText("Errores");
        jReporteErrores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReporteErroresActionPerformed(evt);
            }
        });
        jMenu4.add(jReporteErrores);

        jTabSimbolos.setText("Simbolos");
        jTabSimbolos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTabSimbolosActionPerformed(evt);
            }
        });
        jMenu4.add(jTabSimbolos);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jButtonSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(panelEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(220, 220, 220))
                                    .addComponent(lienzo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2))
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                    .addComponent(panelEntrada))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAnterior)
                            .addComponent(jButtonSiguiente))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openArchivoActionPerformed
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos DF","df");
        jFileChooser.setFileFilter(filtro);

        int respuesta = jFileChooser.showOpenDialog(this);
        if (respuesta == JFileChooser.APPROVE_OPTION){
            File ruta = jFileChooser.getSelectedFile();
            JTextArea textArea = new JTextArea(20, 40);
            JScrollPane scrollPane = new JScrollPane(textArea);
            try {
                FileReader reader = new FileReader(ruta);
                BufferedReader br = new BufferedReader(reader);
                textArea.read(br, null);
                br.close();                
            } catch (IOException ioEx) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo: " + ioEx.getMessage());
            }
            panelEntrada.addTab(ruta.getName(), scrollPane);
        }
    }//GEN-LAST:event_openArchivoActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int indexPestana = panelEntrada.getSelectedIndex();  
        if (indexPestana != -1) {
            JFileChooser fileChooser = new JFileChooser();
            String TituloSugerido = panelEntrada.getTitleAt(indexPestana);
            fileChooser.setSelectedFile(new File(TituloSugerido + ".df"));

            int Selection = fileChooser.showSaveDialog(this);
            if (Selection == JFileChooser.APPROVE_OPTION) {
                File fileSave = fileChooser.getSelectedFile();
                try {
                    JTextArea textArea = (JTextArea) ((JScrollPane) panelEntrada.getComponentAt(indexPestana)).getViewport().getView();
                    FileWriter fw = new FileWriter(fileSave);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(textArea.getText());
                    bw.close();
                } catch (IOException ioEx) {
                    JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + ioEx.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay ninguna pestaña seleccionada.");
        }
    
    }//GEN-LAST:event_saveActionPerformed

    private void newArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newArchivoActionPerformed
        JTextArea textArea = new JTextArea(20, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panelEntrada.addTab("Archivo"+contArch,scrollPane);
        contArch++;
    }//GEN-LAST:event_newArchivoActionPerformed

    private void closePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closePActionPerformed
        int PestañaSelect = panelEntrada.getSelectedIndex();
        if (PestañaSelect != -1){
            panelEntrada.removeTabAt(PestañaSelect);
            jConsola.setText("");
            lienzo.setIcon(null);
            Util.imagenes.vaciar();
            temporal = null;
        } else{
            JOptionPane.showMessageDialog(this, "No hay ninguna pestaña seleccionada");
        }
    }//GEN-LAST:event_closePActionPerformed

    private void jReporteTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReporteTokensActionPerformed
        if (!Util.tokens.isEmpty())  {
            Util.generarHTML_Tokens();
            JOptionPane.showMessageDialog(this, "Se ha generado el reporte de Tokens");
        } else {
            JOptionPane.showMessageDialog(this, "No se han cargado tokens");
        }
    }//GEN-LAST:event_jReporteTokensActionPerformed

    private void jReporteErroresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReporteErroresActionPerformed
        if (!Util.errores.isEmpty())  {
            Util.generarHTML_Errores();
            JOptionPane.showMessageDialog(this, "Se ha generado el reporte de Errores");
        } else {
            JOptionPane.showMessageDialog(this, "No se han cargado errores");
        }
    }//GEN-LAST:event_jReporteErroresActionPerformed

    private void jTabSimbolosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTabSimbolosActionPerformed
        if (!Util.variables.isEmpty() || !Util.arrays.isEmpty() || !Util.arrayChar.isEmpty())  {
            Util.generarHTML_TablaDeSimbolos();
            JOptionPane.showMessageDialog(this, "Se ha generado la Tabla de Simbolos");
        } else {
            JOptionPane.showMessageDialog(this, "No se han cargado variables");
        }
    }//GEN-LAST:event_jTabSimbolosActionPerformed

    private void jEjecutarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEjecutarBotonActionPerformed
        int indexPestana = panelEntrada.getSelectedIndex();
        lienzo.setIcon(null);
        if (indexPestana != -1){
            Util.clearAll();
            jConsola.setText("");
            jConsola.append("Ejecucion: \n");
            JTextArea textArea = (JTextArea) ((JScrollPane) panelEntrada.getComponentAt(indexPestana)).getViewport().getView();
            String textoExtraido = textArea.getText();    
            ejecutar.ejecucion(textoExtraido);
            jConsola.append(Util.textoConsola);
            temporal = Util.imagenes.peek();
            if (temporal != null) {
                MostrarImagen(lienzo, temporal.getRuta());
            } else {
                lienzo.setIcon(null);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay ninguna pestaña seleccionada para ejecutar el analizador");
        }
    }//GEN-LAST:event_jEjecutarBotonActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        if (temporal != null) {
            temporal = temporal.getSiguiente();
            MostrarImagen(lienzo,temporal.getRuta());
        }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        if (temporal != null) {
            temporal = temporal.getAnterior();
            MostrarImagen(lienzo, temporal.getRuta());
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void MostrarImagen(JLabel lienzo, String ruta){
        try {
            File imgFile = new File(ruta);
            // Invalidando el caché de la imagen
            ImageIO.setUseCache(false);
            BufferedImage img = ImageIO.read(imgFile);
            ImageIcon icon = new ImageIcon(img);
            lienzo.setIcon(icon);
            lienzo.repaint(); // Forzando al JLabel a repintarse con la nueva imagen
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem closeP;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JTextArea jConsola;
    private javax.swing.JMenuItem jEjecutarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jReporteErrores;
    private javax.swing.JMenuItem jReporteTokens;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem jTabSimbolos;
    private javax.swing.JLabel lienzo;
    private javax.swing.JMenuItem newArchivo;
    private javax.swing.JMenuItem openArchivo;
    private javax.swing.JTabbedPane panelEntrada;
    private javax.swing.JMenuItem save;
    // End of variables declaration//GEN-END:variables
}
