package GUI_archivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import versionador.java.entidades.ProyectosCab;
import versionador.java.entidades.ProyectosDet;
import versionador.java.entidades.Usuario;
import versionador.java.interfaces.I_ProyectosCab;
import versionador.java.interfaces.I_ProyectosDet;
import versionador.java.interfaces.I_Usuario;
import versionador.java.repositorios.ProyectosCab_Repositorio;
import versionador.java.repositorios.ProyectosDet_Repositorio;
import versionador.java.repositorios.Usuario_Repositorio;

public class Manejador_virtual_de_archivos extends javax.swing.JFrame {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
    I_ProyectosCab pCab = new ProyectosCab_Repositorio(emf);
    I_ProyectosDet pDet = new ProyectosDet_Repositorio(emf);
    I_Usuario ur = new Usuario_Repositorio(emf);
    DefaultListModel modelo = new DefaultListModel();
    File subCarpeta;

    public Manejador_virtual_de_archivos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtCarpeta = new javax.swing.JTextField();
        btnBuscarCarpeta = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstList = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTamanio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblModific = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txtCarpetaBase = new javax.swing.JTextField();
        btnGrabar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtCarpetaDestino = new javax.swing.JTextField();
        btnBuscarDestino = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Carpeta:");

        btnBuscarCarpeta.setText("Buscar");
        btnBuscarCarpeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCarpetaActionPerformed(evt);
            }
        });

        lstList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstList);

        jLabel3.setText("Nombre:");

        jLabel2.setText("Tamaño:");

        jLabel5.setText("Actualizado:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DETALLES");
        jLabel4.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel6.setText("Nombre:");

        jLabel7.setText("Descripción:");

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jLabel8.setText("Carpeta base:");

        txtCarpetaBase.setEditable(false);

        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        jLabel9.setText("Carpeta destino:");

        btnBuscarDestino.setText("Buscar");
        btnBuscarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDestinoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(212, 212, 212)
                            .addComponent(btnBuscarCarpeta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(lblModific, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(txtCarpetaBase))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane1)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCarpetaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscarDestino))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnGrabar)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCarpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnBuscarCarpeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtCarpetaBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCarpetaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarDestino))
                        .addGap(18, 18, 18)
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(lblTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(lblModific, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar() {
        txtCarpeta.setText("");
        lblModific.setText("");
        lblNombre.setText("");
        lblTamanio.setText("");
        txtCarpetaBase.setText("");
        txtDescripcion.setText("");
        txtNombre.setText("");
        txtCarpetaDestino.setText("");
        modelo.clear();
    }

    private void btnBuscarCarpetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCarpetaActionPerformed
        limpiar();
        String carpeta = "";
        String carpetaBase = "";

        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVol = jfc.showOpenDialog(this);
        if (returnVol == JFileChooser.APPROVE_OPTION) {
            carpeta = jfc.getSelectedFile().getAbsolutePath();
            carpetaBase = jfc.getSelectedFile().getName();
            txtCarpeta.setText(carpeta);
            txtCarpetaBase.setText(carpetaBase);
            subCarpeta = new File(txtCarpeta.getText());
            File ruta = new File(txtCarpeta.getText());
            File[] listado = ruta.listFiles();
            buscarCarpeta(listado);
        }
    }//GEN-LAST:event_btnBuscarCarpetaActionPerformed

    private void buscarCarpeta(File[] listado) {
        for (int i = 0; i < listado.length; i++) {
            if (listado[i].isDirectory()) {
                modelo.addElement(listado[i].getName() + " (Carpeta)");
                subCarpeta = new File(subCarpeta + File.separator + listado[i].getName());
                File[] subListado = subCarpeta.listFiles();
                if (subListado.length > 0) {
                    buscarCarpeta(subListado);
                    subCarpeta = new File(txtCarpeta.getText());
                }
            } else {
                modelo.addElement(listado[i].getName());
            }
        }
        lstList.setModel(modelo);
    }

    private void lstListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstListMouseClicked
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        File f = new File(txtCarpeta.getText() + File.separator + lstList.getSelectedValue());
        if (f.isDirectory()) {
            lblNombre.setText(f.getName() + " (Carpeta)");
        }
        lblNombre.setText(f.getName());
        lblTamanio.setText(f.length() + " bytes");
        lblModific.setText(sdf.format(f.lastModified()));
    }//GEN-LAST:event_lstListMouseClicked

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        if (!validar()) {
            JOptionPane.showMessageDialog(this, "NO SE PUDO GUARDAR");
            return;
        }
        Usuario usuario = new Usuario(1, "Pepito");
        ur.save(usuario);
        ProyectosCab proyecto = new ProyectosCab(txtNombre.getText(), txtDescripcion.getText(), txtCarpetaBase.getText(), "SI", "número de usuario");
        pCab.save(proyecto);
        if (proyecto.getIdProyecto() > 0) {
            JOptionPane.showMessageDialog(this, "Proyecto Guardado en el Repositorio de Fran !!");
            copiarDirectorio(txtCarpeta.getText(), txtCarpetaDestino.getText());
        }

        for (int i = 0; i < modelo.getSize(); i++) {
            File f = new File(txtCarpeta.getText() + File.separator + modelo.getElementAt(i));
            ProyectosDet proyectosDet = new ProyectosDet(proyecto.getIdProyecto(), f.getName(), "destino del archivo", usuario);
            pDet.save(proyectosDet);
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnBuscarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDestinoActionPerformed
        String carpeta = "";
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVol = jfc.showOpenDialog(this);
        if (returnVol == JFileChooser.APPROVE_OPTION) {
            carpeta = jfc.getSelectedFile().getAbsolutePath();
            txtCarpetaDestino.setText(carpeta);
        } else {
            txtCarpeta.setText("");
        }
    }//GEN-LAST:event_btnBuscarDestinoActionPerformed

    /*
        Validar debería ser una clase que tenga más validaciones para evitar cargas erróneas como las rutas
     */
    private boolean validar() {
        if (txtNombre.getText().equals("")) {
            return false;
        }
        if (txtDescripcion.getText().equals("")) {
            return false;
        }
        if (txtCarpetaBase.getText().equals("")) {
            return false;
        }
        if (txtCarpetaDestino.getText().equals("")) {
            return false;
        }
        return true;
    }

    private void copiarDirectorio(String origen, String destino) {
        comprobarCrearDirectorio(destino);
        File directorio = new File(origen);
        File f;
        if (directorio.isDirectory()) {
            comprobarCrearDirectorio(destino);
            String[] files = directorio.list();
            if (files.length > 0) {
                for (String archivo : files) {
                    f = new File(origen + File.separator + archivo);
                    if (f.isDirectory()) {
                        comprobarCrearDirectorio(destino + File.separator + archivo + File.separator);
                        copiarDirectorio(origen + File.separator + archivo + File.separator, destino + File.separator + archivo + File.separator);
                    } else { //Es un archivo
                        copiarArchivo(origen + File.separator + archivo, destino + File.separator + archivo);
                    }
                }
            }
        }
    }

    private void copiarArchivo(String sOrigen, String sDestino) {
        try {
            File origen = new File(sOrigen);
            File destino = new File(sDestino);
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }

            in.close();
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void comprobarCrearDirectorio(String ruta) {
        File directorio = new File(ruta);
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
    }

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
            java.util.logging.Logger.getLogger(Manejador_virtual_de_archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manejador_virtual_de_archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manejador_virtual_de_archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manejador_virtual_de_archivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manejador_virtual_de_archivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCarpeta;
    private javax.swing.JButton btnBuscarDestino;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblModific;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTamanio;
    private javax.swing.JList<String> lstList;
    private javax.swing.JTextField txtCarpeta;
    private javax.swing.JTextField txtCarpetaBase;
    private javax.swing.JTextField txtCarpetaDestino;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
